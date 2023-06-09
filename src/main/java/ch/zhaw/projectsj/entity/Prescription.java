package ch.zhaw.projectsj.entity;

import javax.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "prescriptions")
public class Prescription {

    @Id
    private String id;
    private String patientId;
    // other attributes...

    // getters and setters...
}

