package com.example.dev.Services;

import com.example.dev.Repository.ComplexeRepository;
import com.example.dev.Repository.SalleRepository;
import com.example.dev.entity.Complexe;
import com.example.dev.entity.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplexeService {
    private final ComplexeRepository complexeRepository;
    private final SalleRepository salleRepository;

    @Autowired
    public ComplexeService(ComplexeRepository complexeRepository, SalleRepository salleRepository) {
        this.complexeRepository = complexeRepository;
        this.salleRepository = salleRepository;
    }

    public void assignSallesToComplexe(Long idComplexe, List<Long> salleIds) {
        Optional<Complexe> complexeOptional = complexeRepository.findById(idComplexe);

        if (complexeOptional.isPresent()) {
            Complexe complexe = complexeOptional.get();
            List<Salle> salles = salleRepository.findAllById(salleIds);

            for (Salle salle : salles) {
                salle.setComplexe(complexe);
            }

            complexe.setSalles(salles);
            complexeRepository.save(complexe);
        } else {
            throw new IllegalArgumentException("Complexe not found");
        }
    }

    // You can add more service methods here if needed
}




