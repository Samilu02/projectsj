package ch.zhaw.projectsj.entity;

import javax.persistence.*;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "therapies")
public class Therapy {

    @Id
    private String id;
    private String patientId;
    // other attributes...

    // getters and setters...
}
