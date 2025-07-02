package com.example.ENAA.SKills.Mapper;

import com.example.ENAA.SKills.DTO.CompetenceDTO;
import com.example.ENAA.SKills.Model.Competence;
import org.mapstruct.Mapper;



@Mapper(componentModel = "spring", uses = {SousCompetenceMapper.class})
public interface CompetenceMapper {


    CompetenceDTO toDto(Competence competence);

    Competence toEntity(CompetenceDTO dto);
}