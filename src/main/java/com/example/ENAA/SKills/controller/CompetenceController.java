package com.example.ENAA.SKills.controller;

import com.example.ENAA.SKills.DTO.CompetenceDTO;
import com.example.ENAA.SKills.Service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public CompetenceDTO add(@RequestBody CompetenceDTO dto) {
        return competenceService.createCompetence(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        competenceService.deleteCompetence(id);
    }

    @GetMapping("/{id}")
    public CompetenceDTO getOne(@PathVariable Long id) {
        return competenceService.getCompetenceById(id);
    }

    @GetMapping
    public List<CompetenceDTO> getAll() {
        return competenceService.getAllCompetences();
    }

    @PutMapping("/{id}")
    public CompetenceDTO update(@PathVariable Long id, @RequestBody CompetenceDTO dto) {
        return competenceService.updateCompetence(id, dto);
    }
}