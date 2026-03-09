/**
 * Clasa Entity reprezintă o entitate din baza de date și este folosită pentru a defini structura
 * Reprezinta tabelul Evenimete_a_e_o din baza de date
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class EvenimenteAEO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Interactiune_Id")
    private int Interactiune_Id;

    @Column(name = "Evenitment_Id")
    private Integer Evenitment_Id;

    @Column(name = "Excursionisti_Id")
    private Integer Excursionisti_Id;

    @Column(name = "Organizatori_Id")
    private Integer Organizatori_Id;

    @Column(name = "Atractii_Id")
    private Integer Atractii_Id;

    @Column(name = "nr_bilete")
    private Integer nr_bilete;

    // Getters and Setters
    @JsonProperty("Interactiune_Id")
    public int getInteractiune_Id() {
        return Interactiune_Id;
    }

    public void setInteractiune_Id(int Interactiune_Id) {
        this.Interactiune_Id = Interactiune_Id;
    }

    @JsonProperty("Evenitment_Id")
    public Integer getEvenitment_Id() {
        return Evenitment_Id;
    }

    public void setEvenitment_Id(Integer Evenitment_Id) {
        this.Evenitment_Id = Evenitment_Id;
    }

    @JsonProperty("Excursionisti_Id")
    public Integer getExcursionisti_Id() {
        return Excursionisti_Id;
    }

    public void setExcursionisti_Id(Integer Excursionisti_Id) {
        this.Excursionisti_Id = Excursionisti_Id;
    }

    @JsonProperty("Organizatori_Id")
    public Integer getOrganizatori_Id() {
        return Organizatori_Id;
    }

    public void setOrganizatori_Id(Integer Organizatori_Id) {
        this.Organizatori_Id = Organizatori_Id;
    }

    @JsonProperty("Atractii_Id")
    public Integer getAtractii_Id() {
        return Atractii_Id;
    }

    public void setAtractii_Id(Integer Atractii_Id) {
        this.Atractii_Id = Atractii_Id;
    }

    @JsonProperty("nr_bilete")
    public Integer getNr_bilete() {
        return nr_bilete;
    }

    public void setNr_bilete(Integer nr_bilete) {
        this.nr_bilete = nr_bilete;
    }
}
