package com.example.studentmanagement.repositories;

import com.example.studentmanagement.entities.Etudiant;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

}