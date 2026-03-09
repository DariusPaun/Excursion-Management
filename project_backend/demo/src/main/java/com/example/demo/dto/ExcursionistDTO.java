/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Pentru vizualizarea tuturor excursionistilor de catre Organizator
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class ExcursionistDTO {
    private String numeComplet;
    private int varsta;
    private String cnp;
    private String nrTelefon;
    private String email;
    private int excursionistiId;

    // Constructor
    public ExcursionistDTO(String numeComplet, int varsta, String cnp, String nrTelefon, String email, int excursionistiId) {
        this.numeComplet = numeComplet;
        this.varsta = varsta;
        this.cnp = cnp;
        this.nrTelefon = nrTelefon;
        this.email = email;
        this.excursionistiId = excursionistiId;
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

    public int getExcursionistiId() {
        return excursionistiId;
    }

    public void setExcursionistiId(int excursionistiId) {
        this.excursionistiId = excursionistiId;
    }
}
