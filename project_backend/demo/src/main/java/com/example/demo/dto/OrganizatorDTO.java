/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class OrganizatorDTO {
    private int organizatoriId;
    private String numeComplet;

    // Constructor, Getters, Setters
    public OrganizatorDTO(int organizatoriId, String numeComplet) {
        this.organizatoriId = organizatoriId;
        this.numeComplet = numeComplet;
    }

    public int getOrganizatoriId() {
        return organizatoriId;
    }

    public void setOrganizatoriId(int organizatoriId) {
        this.organizatoriId = organizatoriId;
    }

    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }
}
