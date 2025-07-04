package com.example.ENAA.SKills.DTO;

import lombok.Data;

import java.util.List;

@Data
public class CompetenceDTO {
    Long id;
    private String code;
    private String titre;
    private String description;
    private List<SousCompetenceDTO> sousCompetences;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SousCompetenceDTO> getSousCompetences() {
        return sousCompetences;
    }

    public void setSousCompetences(List<SousCompetenceDTO> sousCompetences) {
        this.sousCompetences = sousCompetences;
    }
}