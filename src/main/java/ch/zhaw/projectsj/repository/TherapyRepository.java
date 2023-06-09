package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Therapy;


import ch.zhaw.projectsj.entity.Therapy;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TherapyRepository extends MongoRepository<Therapy, String> {
}
