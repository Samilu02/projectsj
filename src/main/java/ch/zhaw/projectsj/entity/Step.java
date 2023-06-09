package ch.zhaw.projectsj.entity;

import javax.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "steps")
public class Step extends Therapy {

    // step-specific attributes...

    // getters and setters...
}
