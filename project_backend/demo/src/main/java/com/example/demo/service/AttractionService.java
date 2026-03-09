/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Creaza atractii pentru utilizarea lor in crearea evenimentelor
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.CreateAttractionDTO;
import com.example.demo.entity.Atractii;
import com.example.demo.repository.AttractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttractionService {

    @Autowired
    private AttractionRepository attractionRepository;

    public Atractii createAttraction(CreateAttractionDTO dto) {
        Atractii attraction = new Atractii();
        attraction.setNume_Atractie(dto.getName());
        attraction.setDescriere_Atractie(dto.getDescription());
        attraction.setURL_Poza(dto.getImageUrl());

        return attractionRepository.save(attraction);
    }
}
