/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Pentru vizualizarea angajatilor de catre organizator
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class AngajatDTO {
    private String numeComplet;
    private int varsta;
    private String cnp;
    private String nrTelefon;
    private String email;
    private Double salariu;
    private int organizatoriId;

    // Constructor
    public AngajatDTO(String numeComplet, int varsta, String cnp, String nrTelefon, String email, Double salariu, int organizatoriId) {
        this.numeComplet = numeComplet;
        this.varsta = varsta;
        this.cnp = cnp;
        this.nrTelefon = nrTelefon;
        this.email = email;
        this.salariu = salariu;
        this.organizatoriId = organizatoriId;
    }

    // Getters and Setters
    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalariu() {
        return salariu;
    }

    public void setSalariu(Double salariu) {
        this.salariu = salariu;
    }

    public int getOrganizatoriId() {
        return organizatoriId;
    }

    public void setOrganizatoriId(int organizatoriId) {
        this.organizatoriId = organizatoriId;
    }
}
