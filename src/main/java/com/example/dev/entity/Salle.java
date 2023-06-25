package com.example.dev.entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    @Column(name = "nombre_personne")
    private Integer nombrePersonne;

    @ManyToOne
    private Complexe complexe;

    // Constructors, getters, and setters
}

