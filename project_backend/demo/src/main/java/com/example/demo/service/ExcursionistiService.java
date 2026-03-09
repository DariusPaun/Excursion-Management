/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Folosita pentru vizualizarea statisticilor din aplicatie
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.ExcursionistiDetailsDTO;
import com.example.demo.repository.ExcursionistiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExcursionistiService {

    @Autowired
    private ExcursionistiRepository excursionistiRepository;

    public List<ExcursionistiDetailsDTO> getExcursionistiDetails() {
        return excursionistiRepository.findExcursionistiDetails();
    }
}
