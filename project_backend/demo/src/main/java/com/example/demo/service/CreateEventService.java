/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Creaza un eveniment cu tot cu realtiile many-to-many
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.entity.Evenimente;
import com.example.demo.entity.EvenimenteAEO;
import com.example.demo.repository.EvenimenteAttractiiRepository;
import com.example.demo.repository.EvenimenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateEventService {

    @Autowired
    private EvenimenteRepository evenimenteRepository;

    @Autowired
    private EvenimenteAttractiiRepository evenimenteAttractiiRepository;

    public Evenimente createEvent(Evenimente event, List<Integer> attractions) {
        // Save the event
        Evenimente savedEvent = evenimenteRepository.save(event);

        // Save the event-attraction mappings
        for (Integer attractionId : attractions) {
            EvenimenteAEO mapping = new EvenimenteAEO();
            mapping.setEvenitment_Id(savedEvent.getEveniment_Id());
            mapping.setAtractii_Id(attractionId);
            evenimenteAttractiiRepository.save(mapping);
        }

        return savedEvent;
    }
}
