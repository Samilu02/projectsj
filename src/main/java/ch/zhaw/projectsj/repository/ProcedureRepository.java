package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Procedure;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {
}