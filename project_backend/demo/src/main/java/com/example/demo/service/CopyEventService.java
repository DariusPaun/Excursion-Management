/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Permite copiererea unui eveniment schimband perioada de desfasurare
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.CopyEventResponseDTO;
import com.example.demo.repository.CopyEventRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopyEventService {

    @Autowired
    private CopyEventRepository copyEventRepository;

    @Transactional
    public CopyEventResponseDTO copyEvent(Long id, String startDatetime, String endDatetime) {
        // Step 1: Insert a new event
        Long newEventId = copyEventRepository.insertEvent(id, startDatetime, endDatetime);

        // Step 2: Copy associated rows
        int copiedRows = copyEventRepository.copyEventAttractions(newEventId, id);

        return new CopyEventResponseDTO(newEventId.intValue(), copiedRows);
    }
}
