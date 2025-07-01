package com.example.ENAA.SKills.Service;

import com.example.ENAA.SKills.DTO.CompetenceDTO;
import com.example.ENAA.SKills.Model.Competence;
import com.example.ENAA.SKills.Repository.CompetenceRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CompetenceService {

    private final CompetenceRepository competenceRepository;

    @Autowired
    public CompetenceService(CompetenceRepository competenceRepository) {
        this.competenceRepository = competenceRepository;
    }

    public CompetenceDTO createCompetence(CompetenceDTO competenceDTO) {
        Competence competence = new Competence();
        Competence savedCompetence = competenceRepository.save(competence);
        CompetenceDTO savedCompetenceDTO = new CompetenceDTO();
        BeanUtils.copyProperties(savedCompetence, savedCompetenceDTO);
        return savedCompetenceDTO;
    }

    public CompetenceDTO getCompetenceById(Long id) {
        Optional<Competence> competenceOptional = competenceRepository.findById(id);
        if (competenceOptional.isPresent()) {
            Competence competence = competenceOptional.get();
            CompetenceDTO competenceDTO = new CompetenceDTO();
            BeanUtils.copyProperties(competence, competenceDTO);
            return competenceDTO;
        }
        return null;
    }

    public List<CompetenceDTO> getAllCompetences() {
        List<Competence> competences = competenceRepository.findAll();
        return competences.stream()
                .map(competence -> {
                    CompetenceDTO competenceDTO = new CompetenceDTO();
                    BeanUtils.copyProperties(competence, competenceDTO);
                    return competenceDTO;
                })
                .collect(Collectors.toList());
    }

    public CompetenceDTO updateCompetence(Long id, CompetenceDTO competenceDTO) {
        Optional<Competence> competenceOptional = competenceRepository.findById(id);
        if (competenceOptional.isPresent()) {
            Competence existingCompetence = competenceOptional.get();
            BeanUtils.copyProperties(competenceDTO, existingCompetence, "id", "sousCompetences");
            Competence updatedCompetence = competenceRepository.save(existingCompetence);
            CompetenceDTO updatedCompetenceDTO = new CompetenceDTO();
            BeanUtils.copyProperties(updatedCompetence, updatedCompetenceDTO);
            return updatedCompetenceDTO;
        }
        return null;
    }

    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }
}