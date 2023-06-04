package ch.zhaw.projectsj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.projectsj.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
