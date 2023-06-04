package ch.zhaw.projectsj.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "therapy_type")
public abstract class Therapy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // other attributes

    @OneToMany(mappedBy = "therapy")
    private List<Prescription> prescriptions;

    // getters and setters
}

