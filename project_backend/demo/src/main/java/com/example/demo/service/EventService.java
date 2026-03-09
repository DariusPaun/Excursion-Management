/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Folosit pentru vizualizarea tuturor evenimente trecute/in desfasurare/ viitoare
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.EventResponseDTO;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public Map<String, List<EventResponseDTO>> getEventsByCategory() {
        LocalDateTime now = LocalDateTime.now();

        List<EventResponseDTO> upcoming = eventRepository.findUpcomingEvents(now);
        List<EventResponseDTO> ongoing = eventRepository.findOngoingEvents(now);
        List<EventResponseDTO> past = eventRepository.findPastEvents(now);

        Map<String, List<EventResponseDTO>> eventsMap = new HashMap<>();
        eventsMap.put("upcoming", upcoming);
        eventsMap.put("ongoing", ongoing);
        eventsMap.put("past", past);

        return eventsMap;
    }
}
