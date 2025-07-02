package com.example.ENAA.SKills.Mapper;

import com.example.ENAA.SKills.DTO.SousCompetenceDTO;
import com.example.ENAA.SKills.Model.SousCompetence;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface SousCompetenceMapper {



    SousCompetenceDTO toDto(SousCompetence sousCompetence);

    SousCompetence toEntity(SousCompetenceDTO dto);


}
