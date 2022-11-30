package com.example.studentmanagement.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor @AllArgsConstructor
public class EntudiantModel {
    private int num;
    private String matricule;
    private String nom;
    private String Prenom;
    private String sexe;
    private Date dateNaiss;
    private String niveau;
    private String lieuNaiss;
    private String telephone;
}
