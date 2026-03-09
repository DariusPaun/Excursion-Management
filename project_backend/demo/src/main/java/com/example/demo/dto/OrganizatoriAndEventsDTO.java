/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Folosit pentru selectarea si vizualizarea organizatorilor pentru evenimente
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

import java.util.List;

public class OrganizatoriAndEventsDTO {
    private List<OrganizatorDTO> allOrganizatori;
    private List<OrganizatoriEventsDTO> organizatoriEvents;

    // Getters and Setters
    public List<OrganizatorDTO> getAllOrganizatori() {
        return allOrganizatori;
    }

    public void setAllOrganizatori(List<OrganizatorDTO> allOrganizatori) {
        this.allOrganizatori = allOrganizatori;
    }

    public List<OrganizatoriEventsDTO> getOrganizatoriEvents() {
        return organizatoriEvents;
    }

    public void setOrganizatoriEvents(List<OrganizatoriEventsDTO> organizatoriEvents) {
        this.organizatoriEvents = organizatoriEvents;
    }
}
