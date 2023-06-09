package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Step;
import ch.zhaw.projectsj.entity.Step;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StepRepository extends MongoRepository<Step, String> {
}
