package ch.zhaw.projectsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.projectsj.entity.Therapy;
import ch.zhaw.projectsj.repository.TherapyRepository;

import java.util.List;
import java.util.Optional;
import ch.zhaw.projectsj.entity.Therapy;
import ch.zhaw.projectsj.repository.TherapyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/therapies")
public class TherapyController {

    @Autowired
    private TherapyRepository therapyRepository;

    @GetMapping
    public List<Therapy> getAllTherapies() {
        return therapyRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Therapy> getTherapyById(@PathVariable String id) {
        return therapyRepository.findById(id);
    }
}
