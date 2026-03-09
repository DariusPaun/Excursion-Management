/**
 * Clasa Entity reprezintă o entitate din baza de date și este folosită pentru a defini structura
 * Reprezinta tabelul Excursionisti din baza de date
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Excursionisti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Excursionisti_Id")
    private int Excursionisti_Id;

    @Column(name = "date_personale_id")
    private Integer date_personale_id;

    @Column(name = "Nr_excursii")
    private int Nr_excursii;

    @Column(name = "bani_cheltuiti")
    private double bani_cheltuiti;

    @Column(name = "parola")
    private String parola;

    // Getters and Setters
    @JsonProperty("Excursionisti_Id")
    public int getExcursionisti_Id() {
        return Excursionisti_Id;
    }

    public void setExcursionisti_Id(int Excursionisti_Id) {
        this.Excursionisti_Id = Excursionisti_Id;
    }

    @JsonProperty("date_personale_id")
    public Integer getDate_personale_id() {
        return date_personale_id;
    }

    public void setDate_personale_id(Integer date_personale_id) {
        this.date_personale_id = date_personale_id;
    }

    @JsonProperty("Nr_excursii")
    public int getNr_excursii() {
        return Nr_excursii;
    }

    public void setNr_excursii(int Nr_excursii) {
        this.Nr_excursii = Nr_excursii;
    }

    @JsonProperty("bani_cheltuiti")
    public double getBani_cheltuiti() {
        return bani_cheltuiti;
    }

    public void setBani_cheltuiti(double bani_cheltuiti) {
        this.bani_cheltuiti = bani_cheltuiti;
    }

    @JsonProperty("parola")
    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
}
