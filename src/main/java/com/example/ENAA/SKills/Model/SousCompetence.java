package com.example.ENAA.SKills.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SousCompetence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "competence_id", nullable = false)
    private Competence competence;
}