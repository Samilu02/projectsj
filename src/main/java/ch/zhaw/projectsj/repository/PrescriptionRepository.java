package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {
}
