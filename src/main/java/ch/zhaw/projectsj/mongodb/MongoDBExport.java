package ch.zhaw.projectsj.mongodb;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class MongoDBExport {

    public static void main(String[] args) {
        MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase database = mongoClient.getDatabase("yourDatabase");
        MongoCollection<Document> collection = database.getCollection("yourCollection");

        // Query your data here and export it to CSV files
    }
}
