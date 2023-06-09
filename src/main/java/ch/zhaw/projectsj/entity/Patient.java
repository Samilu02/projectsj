
    // other attributes

   // @OneToMany(mappedBy = "patient")
   // private List<Prescription> prescriptions;

    // getters and setters




package ch.zhaw.projectsj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Id;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patients")
public class Patient {

    @Id
    private String id;
    private String name;
    // other attributes...

    // getters and setters...
}
