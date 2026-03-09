/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Folosit pentru vizualizarea evenimentelor pentru excursionisti
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.eventDTO;
import com.example.demo.repository.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class eventsService {

    // Constructor injection for the repository
    @Autowired
    private eventseRepository EventseRepository;


    public List<eventDTO> getAllEventsWithAttractions() {
        // Fetch events with their attractions from the repository
        return EventseRepository.findAllEventsWithAttractions();
    }
}
