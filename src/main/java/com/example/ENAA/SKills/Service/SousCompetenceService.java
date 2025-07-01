package com.example.ENAA.SKills.Service;

import com.example.ENAA.SKills.Mapper.CompetenceMapper;
import com.example.ENAA.SKills.Model.SousCompetence;
import com.example.ENAA.SKills.Repository.CompetenceRepository;
import com.example.ENAA.SKills.Repository.SousCompetenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SousCompetenceService {

    private final SousCompetenceRepository sousCompetenceRepository;

    public SousCompetenceService(SousCompetenceRepository sousCompetenceRepository) {
        this.sousCompetenceRepository = sousCompetenceRepository;
    }


    public List<SousCompetence> getAll() {
        return sousCompetenceRepository.findAll();
    }

    public SousCompetence create(SousCompetence sousCompetence) {
        return sousCompetenceRepository.save(sousCompetence);
    }
}
