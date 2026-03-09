/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Transfera informatiile necesare pentru a realiza procesul de log-in ul
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class LoginDTO {
    private String parola;
    private int excursionistiId;
    private int nrExcursii;
    private double baniCheltuiti;
    private String numeComplet;

    // Constructor, Getters, and Setters
    public LoginDTO(String parola, int excursionistiId, int nrExcursii, double baniCheltuiti, String numeComplet) {
        this.parola = parola;
        this.excursionistiId = excursionistiId;
        this.nrExcursii = nrExcursii;
        this.baniCheltuiti = baniCheltuiti;
        this.numeComplet = numeComplet;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getExcursionistiId() {
        return excursionistiId;
    }

    public void setExcursionistiId(int excursionistiId) {
        this.excursionistiId = excursionistiId;
    }

    public int getNrExcursii() {
        return nrExcursii;
    }

    public void setNrExcursii(int nrExcursii) {
        this.nrExcursii = nrExcursii;
    }

    public double getBaniCheltuiti() {
        return baniCheltuiti;
    }

    public void setBaniCheltuiti(double baniCheltuiti) {
        this.baniCheltuiti = baniCheltuiti;
    }

    public String getNumeComplet() {
        return numeComplet;
    }

    public void setNumeComplet(String numeComplet) {
        this.numeComplet = numeComplet;
    }
}
