package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Procedure;
import ch.zhaw.projectsj.entity.Procedure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProcedureRepository extends MongoRepository<Procedure, String> {
}
