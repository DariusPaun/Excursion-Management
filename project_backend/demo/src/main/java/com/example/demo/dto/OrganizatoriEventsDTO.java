/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class OrganizatoriEventsDTO {
    private int evenimentId;
    private int organizatoriId;

    // Constructor, Getters, Setters
    public OrganizatoriEventsDTO(int evenimentId, int organizatoriId) {
        this.evenimentId = evenimentId;
        this.organizatoriId = organizatoriId;
    }

    public int getEvenimentId() {
        return evenimentId;
    }

    public void setEvenimentId(int evenimentId) {
        this.evenimentId = evenimentId;
    }

    public int getOrganizatoriId() {
        return organizatoriId;
    }

    public void setOrganizatoriId(int organizatoriId) {
        this.organizatoriId = organizatoriId;
    }
}
