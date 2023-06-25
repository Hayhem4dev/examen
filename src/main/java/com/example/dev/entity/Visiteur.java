package com.example.dev.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Visiteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idvisiteur;

    private String nom;
    private String prenom;

    @Enumerated(EnumType.STRING)
    private CategorieVisiteur categorie;

    @Column(name = "DateDeNaissance")
    private LocalDate dateDeNaissance;

}
