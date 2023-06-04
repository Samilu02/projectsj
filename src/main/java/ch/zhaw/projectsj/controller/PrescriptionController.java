package ch.zhaw.projectsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.projectsj.entity.Prescription;
import ch.zhaw.projectsj.repository.PrescriptionRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prescriptions")
public class PrescriptionController {

    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @GetMapping
    public List<Prescription> findAll() {
        return prescriptionRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Prescription> findById(@PathVariable Long id) {
        return prescriptionRepository.findById(id);
    }
}
