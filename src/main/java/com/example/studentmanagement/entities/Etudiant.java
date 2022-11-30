package com.example.studentmanagement.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "ETUDIANTS")
@Data @NoArgsConstructor @AllArgsConstructor
@ToString
public class Etudiant {
    @Id
    @Column(name = "N°")
    private int num;
    @Column(name = "N° Matricule")
    private String matricule;
    @Column(name = "Nom", length = 50)
    private String nom;
    @Column(name = "Prénom", length = 120)
    private String Prenom;
    @Column(name = "Sexe", length = 20)
    private String sexe;
    @Column(name = "Date de Naissance")
    @Temporal(TemporalType.DATE)
    private Date dateNaiss;
    @Column(name = "Niveau", length = 4)
    private String niveau;
    @Column(name = "Lieu de Naissance")
    private String lieuNaiss;
    @Column(name = "Telephone", length = 15)
    private String telephone;
}
