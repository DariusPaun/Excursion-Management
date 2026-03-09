/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Permite stergerea evenimentelor
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.repository.EventsDeleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventsDeleteService {

    @Autowired
    private EventsDeleteRepository eventsDeleteRepository;

    public boolean deleteEvent(Integer id) {
        int affectedRows = eventsDeleteRepository.deleteEventById(id);
        return affectedRows > 0; // Returns true if at least one row was deleted
    }
}
