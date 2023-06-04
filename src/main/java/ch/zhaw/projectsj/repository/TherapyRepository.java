package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Therapy;

public interface TherapyRepository extends JpaRepository<Therapy, Long> {
}

