package com.example.ENAA.SKills.Model;

import com.example.ENAA.SKills.Model.SousCompetence;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Competence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String titre;
    private String description;
    @OneToMany(mappedBy = "competence", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<SousCompetence> sousCompetences;

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

    public List<SousCompetence> getSousCompetences() {
        return sousCompetences;
    }

    public void setSousCompetences(List<SousCompetence> sousCompetences) {
        this.sousCompetences = sousCompetences;
    }
}