package ch.zhaw.projectsj.entity;

import javax.persistence.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "procedures")
public class Procedure extends Therapy {

    // procedure-specific attributes...

    // getters and setters...
}

