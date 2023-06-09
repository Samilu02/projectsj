package ch.zhaw.projectsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.projectsj.entity.Procedure;
import ch.zhaw.projectsj.repository.ProcedureRepository;

import java.util.List;
import java.util.Optional;
import ch.zhaw.projectsj.entity.Procedure;
import ch.zhaw.projectsj.repository.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/procedures")
public class ProcedureController {

    @Autowired
    private ProcedureRepository procedureRepository;

    @GetMapping
    public List<Procedure> getAllProcedures() {
        return procedureRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Procedure> getProcedureById(@PathVariable String id) {
        return procedureRepository.findById(id);
    }
}
