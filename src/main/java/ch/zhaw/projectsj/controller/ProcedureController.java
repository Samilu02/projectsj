package ch.zhaw.projectsj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.projectsj.entity.Procedure;
import ch.zhaw.projectsj.repository.ProcedureRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/procedures")
public class ProcedureController {

    @Autowired
    private ProcedureRepository procedureRepository;

    @GetMapping
    public List<Procedure> findAll() {
        return procedureRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Procedure> findById(@PathVariable Long id) {
        return procedureRepository.findById(id);
    }
}
