/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Se modifica tabelul many-to-many cand un profil de excursionist participa la un eveniment
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.CreatePurchaseRequestDTO;
import com.example.demo.repository.EvenimenteExcursionistiRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PurchaseService {

    private final EvenimenteExcursionistiRepository repository;

    public PurchaseService(EvenimenteExcursionistiRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public String createOrUpdatePurchase(CreatePurchaseRequestDTO request) {
        Long eventId = request.getEventId();
        Long userId = request.getUserId();
        int selectedTickets = request.getSelectedTickets();

        Integer currentTickets = repository.findTicketsByEventAndUser(eventId, userId);

        if (currentTickets != null) {
            // Update the ticket count if record exists
            int newTicketCount = currentTickets + selectedTickets;
            repository.updateTicketCount(newTicketCount, eventId, userId);
            return "Ticket count updated successfully";
        }
        return "New record created with selected tickets";
    }
}
