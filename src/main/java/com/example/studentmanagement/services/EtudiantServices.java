package com.example.studentmanagement.services;

import com.example.studentmanagement.entities.Etudiant;

import java.util.List;

public interface EtudiantServices {
    void enregistrerEtudiants(Etudiant etudiant);
    List<Etudiant> getEtudiants();
    Etudiant getOneEtudiant(int num);
}
