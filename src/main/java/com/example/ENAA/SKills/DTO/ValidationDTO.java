package com.example.ENAA.SKills.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ValidationDTO {
    private Long id;
    private Long apprenantId;
    private Long sousCompetenceId;
    private boolean validee;
}
