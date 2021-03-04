package it.bitsrl.scuola.controllers;

import it.bitsrl.scuola.dtos.CorsoDto;
import it.bitsrl.scuola.entities.Corso;
import it.bitsrl.scuola.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@CrossOrigin(origins={"http://localhost:8080"})
@RestController
@RequestMapping("/api/corso")
public class CorsoController {

    @Autowired
    private CourseRepository courseRepo;

    @GetMapping("/")
    public Iterable<CorsoDto> allCourses(){
        Collection<Corso> listaCorsi = (Collection<Corso>) this.courseRepo.findAll();
        return listaCorsi.stream().map(CorsoDto::new).collect(Collectors.toList());
    }
}
