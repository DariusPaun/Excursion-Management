/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Folosita pentru a vizualiza evenimentele
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AtractiiDTO {

    @JsonProperty("Atractii_Id") // Mapping to the JSON field "Atractii_Id"
    private Integer atractiiId;

    @JsonProperty("Nume_Atractie") // Mapping to the JSON field "Nume_Atractie"
    private String numeAtractie;

    // Constructor
    public AtractiiDTO(Integer atractiiId, String numeAtractie) {
        this.atractiiId = atractiiId;
        this.numeAtractie = numeAtractie;
    }

    // Getters and setters
    public Integer getAtractiiId() {
        return atractiiId;
    }

    public void setAtractiiId(Integer atractiiId) {
        this.atractiiId = atractiiId;
    }

    public String getNumeAtractie() {
        return numeAtractie;
    }

    public void setNumeAtractie(String numeAtractie) {
        this.numeAtractie = numeAtractie;
    }
}
