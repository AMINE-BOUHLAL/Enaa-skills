package com.example.ENAA.SKills.Mapper;

import com.example.ENAA.SKills.DTO.SousCompetenceDTO;
import com.example.ENAA.SKills.Model.SousCompetence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SousCompetenceMapper {
    @Mapping(target = "competence", ignore = true) // Explicitly ignore competence field
    SousCompetence toEntity(SousCompetenceDTO dto);

    SousCompetenceDTO toDto(SousCompetence sousCompetence);
}
