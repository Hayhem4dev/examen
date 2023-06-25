package com.example.dev.Controller;

import com.example.dev.Services.ComplexeService;
import com.example.dev.entity.Complexe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complexes")
public class ComplexeController {
    private final ComplexeService complexeService;

    @Autowired
    public ComplexeController(ComplexeService complexeService) {
        this.complexeService = complexeService;
    }

    @PostMapping("/{idComplexe}/salles")
    public ResponseEntity<Void> assignSallesToComplexe(
            @PathVariable Long idComplexe,
            @RequestBody List<Long> salleIds
    ) {
        complexeService.assignSallesToComplexe(idComplexe, salleIds);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    // You can add more controller methods here if needed
}
