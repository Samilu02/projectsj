package ch.zhaw.projectsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.projectsj.entity.Patient;
import ch.zhaw.projectsj.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Patient> findById(@PathVariable Long id) {
        return patientRepository.findById(id);
    }
}
