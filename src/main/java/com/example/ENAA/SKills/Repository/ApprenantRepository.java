package com.example.ENAA.SKills.Repository;

import com.example.ENAA.SKills.Model.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
    Apprenant findByEmail(String email);
}