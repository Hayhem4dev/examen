package com.example.dev.services;

import com.example.dev.Repository.SalleRepository;
import com.example.dev.entity.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalleService {

    private final SalleRepository salleRepository;

    @Autowired
    public SalleService(SalleRepository salleRepository) {
        this.salleRepository = salleRepository;
    }

    public void addSalle(Salle salle) {
        salleRepository.save(salle);
    }
}
