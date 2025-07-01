package com.example.ENAA.SKills.controller;

import com.example.ENAA.SKills.DTO.CompetenceDTO;
import com.example.ENAA.SKills.Service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competences")
public class CompetenceController {

    private final CompetenceService competenceService;

    @Autowired
    public CompetenceController(CompetenceService competenceService) {
        this.competenceService = competenceService;
    }

    @PostMapping
    public ResponseEntity<CompetenceDTO> createCompetence(@RequestBody CompetenceDTO competenceDTO) {
        CompetenceDTO createdCompetence = competenceService.createCompetence(competenceDTO);
        return new ResponseEntity<>(createdCompetence, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompetenceDTO> getCompetenceById(@PathVariable Long id) {
        CompetenceDTO competenceDTO = competenceService.getCompetenceById(id);
        if (competenceDTO != null) {
            return new ResponseEntity<>(competenceDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping
    public ResponseEntity<List<CompetenceDTO>> getAllCompetences() {
        List<CompetenceDTO> competences = competenceService.getAllCompetences();
        return new ResponseEntity<>(competences, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CompetenceDTO> updateCompetence(@PathVariable Long id, @RequestBody CompetenceDTO competenceDTO) {
        CompetenceDTO updatedCompetence = competenceService.updateCompetence(id, competenceDTO);
        if (updatedCompetence != null) {
            return new ResponseEntity<>(updatedCompetence, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompetence(@PathVariable Long id) {
        competenceService.deleteCompetence(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}