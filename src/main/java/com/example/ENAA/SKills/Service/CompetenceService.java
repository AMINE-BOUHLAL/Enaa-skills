package com.example.ENAA.SKills.Service;

import com.example.ENAA.SKills.DTO.CompetenceDTO;
import com.example.ENAA.SKills.Mapper.CompetenceMapper;
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
    private final CompetenceMapper competenceMapper;


    public CompetenceService(CompetenceRepository competenceRepository, CompetenceMapper competenceMapper) {
        this.competenceRepository = competenceRepository;
        this.competenceMapper = competenceMapper;
    }

    public CompetenceDTO createCompetence(CompetenceDTO competenceDTO) {
        Competence competence = competenceMapper.toEntity(competenceDTO);
        Competence saved = competenceRepository.save(competence);
        return competenceMapper.toDto(saved);
    }



    public CompetenceDTO getCompetenceById(Long id) {
        Competence competence = competenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Compétence non trouvée"));
        return competenceMapper.toDto(competence);
    }

    public List<CompetenceDTO> getAllCompetences() {
        List<Competence> competences = competenceRepository.findAll();
        return competences.stream()
                .map(competenceMapper::toDto)
                .collect(Collectors.toList());
    }

    public void deleteCompetence(Long id) {
        competenceRepository.deleteById(id);
    }





    public CompetenceDTO updateCompetence(Long id, CompetenceDTO dto) {
        Competence existing = competenceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Compétence non trouvée"));
        existing.setCode(dto.getCode());
        existing.setTitre(dto.getTitre());
        existing.setDescription(dto.getDescription());

        return competenceMapper.toDto(competenceRepository.save(existing));
    }
}