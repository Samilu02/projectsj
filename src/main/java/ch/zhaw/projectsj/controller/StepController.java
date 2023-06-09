package ch.zhaw.projectsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.projectsj.entity.Step;
import ch.zhaw.projectsj.repository.StepRepository;

import java.util.List;
import java.util.Optional;
import ch.zhaw.projectsj.entity.Step;
import ch.zhaw.projectsj.repository.StepRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/steps")
public class StepController {

    @Autowired
    private StepRepository stepRepository;

    @GetMapping
    public List<Step> getAllSteps() {
        return stepRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Step> getStepById(@PathVariable String id) {
        return stepRepository.findById(id);
    }
}
