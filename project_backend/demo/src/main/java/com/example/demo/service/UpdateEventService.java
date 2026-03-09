/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Dupa cumpararea unui bilet creste cat de ocupat este acel eveniment
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.UpdateOccupancyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.UpdateEventRepository;
@Service
public class UpdateEventService {

    @Autowired
    private UpdateEventRepository eventRepository;

    public String updateEventOccupancy(UpdateOccupancyDTO updateOccupancyDTO) {
        int rowsUpdated = eventRepository.updateOcupat(updateOccupancyDTO.getNewOcupat(), updateOccupancyDTO.getEventId());

        if (rowsUpdated > 0) {
            return "Event occupancy updated successfully";
        } else {
            throw new IllegalArgumentException("Event not found with ID: " + updateOccupancyDTO.getEventId());
        }
    }
}
