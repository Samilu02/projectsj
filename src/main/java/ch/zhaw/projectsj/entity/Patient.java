
    // other attributes

   // @OneToMany(mappedBy = "patient")
   // private List<Prescription> prescriptions;

    // getters and setters




package ch.zhaw.projectsj.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    // getters and setters
}
