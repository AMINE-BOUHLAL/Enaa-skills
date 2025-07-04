package com.example.ENAA.SKills.controller;

import com.example.ENAA.SKills.DTO.SousCompetenceDTO;
import com.example.ENAA.SKills.Model.SousCompetence;
import com.example.ENAA.SKills.Repository.SousCompetenceRepository;
import com.example.ENAA.SKills.Service.SousCompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/SousCompetences")

public class SousCompetenceController {
    private final SousCompetenceService sousCompetenceService;
    private final SousCompetenceRepository sousCompetenceRepository;




@Autowired
    public SousCompetenceController(SousCompetenceService sousCompetenceService, SousCompetenceRepository sousCompetenceRepository) {
        this.sousCompetenceService = sousCompetenceService;

    this.sousCompetenceRepository = sousCompetenceRepository;
}



//    @PostMapping
//    public SousCompetenceDTO add(@RequestBody SousCompetenceDTO sousCompetenceDTO) {
//        return sousCompetenceService.create(sousCompetenceDTO);
//    }

    @PostMapping
    public ResponseEntity<SousCompetenceDTO> create(@RequestBody SousCompetenceDTO dto) {
        SousCompetenceDTO savedDTO = sousCompetenceService.create(dto);
        return ResponseEntity.ok(savedDTO);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        sousCompetenceService.delete(id);
    }

    @GetMapping
    public List<SousCompetenceDTO> getAll() {
        return sousCompetenceService.getAll();
    }

    @PutMapping("/{id}")
    public SousCompetenceDTO update(@PathVariable Long id, @RequestBody SousCompetenceDTO dto) {
        return sousCompetenceService.update(id, dto);
    }

    @GetMapping("/all")
    public List<SousCompetence> getAllSC() {
        return sousCompetenceRepository.findAll();
    }







}
