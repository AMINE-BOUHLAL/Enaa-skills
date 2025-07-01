package com.example.ENAA.SKills.Repository;

import com.example.ENAA.SKills.Model.Validation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ValidationRepository extends JpaRepository<Validation, Long> {
    List<Validation> findByApprenantId(Long apprenantId);
    List<Validation> findBySousCompetenceId(Long sousCompetenceId);
    Optional<Validation> findByApprenantIdAndSousCompetenceId(Long apprenantId, Long sousCompetenceId);
}
