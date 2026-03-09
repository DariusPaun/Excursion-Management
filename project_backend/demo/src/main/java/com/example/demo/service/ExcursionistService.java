/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Pentru vizualizarea tuturor excursionistilor de catre Organizator
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.ExcursionistDTO;
import com.example.demo.repository.ExcursionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExcursionistService {

    @Autowired
    private ExcursionistRepository excursionistRepository;

    public List<ExcursionistDTO> getAllExcursionists() {
        return excursionistRepository.findAllExcursionists();
    }
}
