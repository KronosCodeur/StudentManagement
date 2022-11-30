package com.example.studentmanagement.services;

import com.example.studentmanagement.entities.Etudiant;
import com.example.studentmanagement.repositories.EtudiantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantServiceImpl implements EtudiantServices{
    final EtudiantRepository etudiantRepository;
    public EtudiantServiceImpl(EtudiantRepository etudiantRepository){
        this.etudiantRepository = etudiantRepository;
    }
    @Override
    public void enregistrerEtudiants(Etudiant etudiant) {
        this.etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getEtudiants() {
        return this.etudiantRepository.findAll();
    }

    @Override
    public Etudiant getOneEtudiant(int num) {
        return this.etudiantRepository.findById(num).get();
    }
}
