/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Folosita pentru vizualizarea statisticilor din aplicatie
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class ExcursionistiDetailsDTO {
    private String numeComplet;
    private int varsta;
    private String sex;
    private int nrExcursii;
    private double baniCheltuiti;

    // Constructor
    public ExcursionistiDetailsDTO(String numeComplet, int varsta, String sex, int nrExcursii, double baniCheltuiti) {
        this.numeComplet = numeComplet;
        this.varsta = varsta;
        this.sex = sex;
        this.nrExcursii = nrExcursii;
        this.baniCheltuiti = baniCheltuiti;
    }

    // Getters and setters
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
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
}
