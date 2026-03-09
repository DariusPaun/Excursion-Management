/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Afiseaza informatii despre un eveniment in functie de id-ul acesteia
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.entity.Evenimente;
import com.example.demo.repository.EvenimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CumparaBileteService {

    @Autowired
    private EvenimentRepository evenimentRepository;

    // Method to get event details by event ID
    public Optional<Evenimente> getEventDetails(Long eventId) {
        return evenimentRepository.findEventWithTransportById(eventId);
    }
}
