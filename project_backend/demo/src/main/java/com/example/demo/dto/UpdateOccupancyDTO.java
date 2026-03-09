/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class UpdateOccupancyDTO {
    private Integer newOcupat;
    private Long eventId;

    public Integer getNewOcupat() {
        return newOcupat;
    }

    public void setNewOcupat(Integer newOcupat) {
        this.newOcupat = newOcupat;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
