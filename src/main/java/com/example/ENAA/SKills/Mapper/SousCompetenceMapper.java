package com.example.ENAA.SKills.Mapper;

import com.example.ENAA.SKills.DTO.SousCompetenceDTO;
import com.example.ENAA.SKills.Model.SousCompetence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface SousCompetenceMapper {


    @Mapping(source = "competence.id", target = "competenceId")
    SousCompetenceDTO toDto(SousCompetence sousCompetence);

    @Mapping(target = "competence", ignore = true)
    SousCompetence toEntity(SousCompetenceDTO dto);


}
