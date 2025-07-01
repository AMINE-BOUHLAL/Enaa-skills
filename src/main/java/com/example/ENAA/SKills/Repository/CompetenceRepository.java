package com.example.ENAA.SKills.Repository;

import com.example.ENAA.SKills.Model.Competence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CompetenceRepository extends JpaRepository<Competence, Long> {
//    List<Competence> findByNomContainingIgnoreCase(String nom);
}

