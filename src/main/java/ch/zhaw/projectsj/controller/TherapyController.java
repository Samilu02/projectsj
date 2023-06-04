package ch.zhaw.projectsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.projectsj.entity.Therapy;
import ch.zhaw.projectsj.repository.TherapyRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/therapies")
public class TherapyController {

    @Autowired
    private TherapyRepository therapyRepository;

    @GetMapping
    public List<Therapy> findAll() {
        return therapyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Therapy> findById(@PathVariable Long id) {
        return therapyRepository.findById(id);
    }
}
