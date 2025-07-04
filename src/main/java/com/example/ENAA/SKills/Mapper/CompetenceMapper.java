package com.example.ENAA.SKills.Mapper;

import com.example.ENAA.SKills.DTO.CompetenceDTO;
import com.example.ENAA.SKills.Model.Competence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring", uses = {SousCompetenceMapper.class})
public interface CompetenceMapper {

    @Mapping(source = "sousCompetences", target = "sousCompetences")
    CompetenceDTO toDto(Competence competence);

    @Mapping(source = "sousCompetences", target = "sousCompetences")
    Competence toEntity(CompetenceDTO dto);
}