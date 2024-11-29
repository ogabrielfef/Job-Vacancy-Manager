package com.example.gestor_de_vagas.modules.candidate.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestor_de_vagas.modules.candidate.CandidateEntity;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/candidato")
public class CandidateController {
    
    @PostMapping("/")
    public void create(@Valid @RequestBody CandidateEntity candidateEntity) {
        System.out.println(candidateEntity.getUsername());
    }
}
