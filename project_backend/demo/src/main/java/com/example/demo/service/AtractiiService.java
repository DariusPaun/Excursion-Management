/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Folosita pentru a vizualiza evenimentele
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.AtractiiDTO;
import com.example.demo.repository.AtractiiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtractiiService {

    @Autowired
    private AtractiiRepository atractiiRepository;

    public List<AtractiiDTO> getAllAttractions() {
        return atractiiRepository.findAllAttractionsOrderedByName();
    }
}
