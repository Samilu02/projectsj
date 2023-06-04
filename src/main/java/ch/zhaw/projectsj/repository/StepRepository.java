package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Step;

public interface StepRepository extends JpaRepository<Step, Long> {
}
