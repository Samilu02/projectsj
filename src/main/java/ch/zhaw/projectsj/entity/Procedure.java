package ch.zhaw.projectsj.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Procedure")
public class Procedure extends Therapy {
    // specific attributes for Procedure

    // getters and setters
}

