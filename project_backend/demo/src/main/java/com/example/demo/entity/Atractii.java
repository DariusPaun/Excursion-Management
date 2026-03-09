/**
 * Clasa Entity reprezintă o entitate din baza de date și este folosită pentru a defini structura
 * Reprezinta tabelul Atractii din baza de date
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class Atractii {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Atractii_Id")
    private int Atractii_Id;

    @Column(name = "Nume_Atractie")
    private String Nume_Atractie;

    @Column(name = "Descriere_Atractie")
    private String Descriere_Atractie;

    @Column(name = "URL_Poza")
    private String URL_Poza;

    // Getters and Setters
    @JsonProperty("Atractii_Id")
    public int getAtractii_Id() {
        return Atractii_Id;
    }

    public void setAtractii_Id(int Atractii_Id) {
        this.Atractii_Id = Atractii_Id;
    }

    @JsonProperty("Nume_Atractie")
    public String getNume_Atractie() {
        return Nume_Atractie;
    }

    public void setNume_Atractie(String Nume_Atractie) {
        this.Nume_Atractie = Nume_Atractie;
    }

    @JsonProperty("Descriere_Atractie")
    public String getDescriere_Atractie() {
        return Descriere_Atractie;
    }

    public void setDescriere_Atractie(String Descriere_Atractie) {
        this.Descriere_Atractie = Descriere_Atractie;
    }

    @JsonProperty("URL_Poza")
    public String getURL_Poza() {
        return URL_Poza;
    }

    public void setURL_Poza(String URL_Poza) {
        this.URL_Poza = URL_Poza;
    }
}
