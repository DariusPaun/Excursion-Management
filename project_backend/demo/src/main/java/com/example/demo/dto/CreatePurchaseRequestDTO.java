/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class CreatePurchaseRequestDTO {
    private int selectedTickets;
    private Long eventId;
    private Long userId;

    // Getters and Setters
    public int getSelectedTickets() {
        return selectedTickets;
    }

    public void setSelectedTickets(int selectedTickets) {
        this.selectedTickets = selectedTickets;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
