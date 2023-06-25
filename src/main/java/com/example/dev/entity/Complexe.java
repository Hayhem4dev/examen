package com.example.dev.entity;


import jakarta.persistence.*;
import lombok.Data;
import com.example.dev.entity.Salle;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Complexe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idcomplexe;

    private String adresse;

    private String nomcomplexe;
    @OneToMany(mappedBy = "complexe", cascade = CascadeType.ALL)
    private List<Salle> salles = new ArrayList<>();


}

