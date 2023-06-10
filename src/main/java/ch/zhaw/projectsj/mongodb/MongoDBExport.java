package ch.zhaw.projectsj.mongodb;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoDBExport {

    public static void main(String[] args) {
        try {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("yourDatabase");
        MongoCollection<Document> collection = database.getCollection("yourCollection");

        List<Document> documents = new ArrayList<>();
for (Prescription prescription : prescriptionRepository.findAll()) {
    Document doc = new Document("_id", prescription.getId())
        .append("name", prescription.getName());
        // add other prescription attributes here
    documents.add(doc);
}
collection.insertMany(documents);

// Query MongoDB to get the list of nodes and edges
FindIterable<Document> nodes = collection.find();
for (Document node : nodes) {
    System.out.println(node.toJson());
}
mongoClient.close();
// Query your data here and export it to CSV files
}catch (Exception e) {
    e.printStackTrace();
}
 }
}
