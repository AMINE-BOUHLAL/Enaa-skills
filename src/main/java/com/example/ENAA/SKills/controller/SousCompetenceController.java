package com.example.ENAA.SKills.controller;

import com.example.ENAA.SKills.Model.SousCompetence;
import com.example.ENAA.SKills.Service.SousCompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SousCompetences")
public class SousCompetenceController {
    private final SousCompetenceService sousCompetenceService;

@Autowired
    public SousCompetenceController(SousCompetenceService sousCompetenceService) {
        this.sousCompetenceService = sousCompetenceService;
    }

    @GetMapping
    public List<SousCompetence> getAll() {
        return sousCompetenceService.getAll();
    }

    @PostMapping
    public SousCompetence create(@RequestBody SousCompetence sousCompetence) {
        return sousCompetenceService.create(sousCompetence);
    }









}
