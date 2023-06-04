package ch.zhaw.projectsj.entity;

import javax.persistence.*;

@Entity
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // other attributes

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "therapy_id")
    private Therapy therapy;

    // getters and setters
}
