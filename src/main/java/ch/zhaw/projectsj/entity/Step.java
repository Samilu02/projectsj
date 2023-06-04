package ch.zhaw.projectsj.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Step")
public class Step extends Therapy {
    // specific attributes for Step

    // getters and setters
}
