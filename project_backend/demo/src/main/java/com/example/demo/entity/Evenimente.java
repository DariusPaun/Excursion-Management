/**
 * Clasa Entity reprezintă o entitate din baza de date și este folosită pentru a defini structura
 * Reprezinta tabelul Evenimente din baza de date
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Evenimente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Eveniment_Id")
    private int Eveniment_Id;

    @Column(name = "Transport_Id")
    private int Transport_Id;

    @Column(name = "Data_Inceput")
    private LocalDateTime Data_Inceput;

    @Column(name = "Data_final")
    private LocalDateTime Data_final;

    @Column(name = "Descriere")
    private String Descriere;

    @Column(name = "Pret")
    private Integer Pret;

    @Column(name = "Nume_eveniment")
    private String Nume_eveniment;

    @Column(name = "Ocupat")
    private Integer Ocupat;

    // Getters and Setters
    @JsonProperty("Eveniment_Id")
    public int getEveniment_Id() {
        return Eveniment_Id;
    }

    public void setEveniment_Id(int Eveniment_Id) {
        this.Eveniment_Id = Eveniment_Id;
    }

    @JsonProperty("Transport_Id")
    public int getTransport_Id() {
        return Transport_Id;
    }

    public void setTransport_Id(int Transport_Id) {
        this.Transport_Id = Transport_Id;
    }

    @JsonProperty("Data_Inceput")
    public LocalDateTime getData_Inceput() {
        return Data_Inceput;
    }

    public void setData_Inceput(LocalDateTime Data_Inceput) {
        this.Data_Inceput = Data_Inceput;
    }

    @JsonProperty("Data_final")
    public LocalDateTime getData_Final() {
        return Data_final;
    }

    public void setData_Final(LocalDateTime Data_Final) {
        this.Data_final = Data_Final;
    }

    @JsonProperty("Descriere")
    public String getDescriere() {
        return Descriere;
    }

    public void setDescriere(String Descriere) {
        this.Descriere = Descriere;
    }

    @JsonProperty("Pret")
    public Integer getPret() {
        return Pret;
    }

    public void setPret(Integer Pret) {
        this.Pret = Pret;
    }

    @JsonProperty("Nume_eveniment")
    public String getNume_eveniment() {
        return Nume_eveniment;
    }

    public void setNume_eveniment(String Nume_eveniment) {
        this.Nume_eveniment = Nume_eveniment;
    }

    @JsonProperty("Ocupat")
    public Integer getOcupat() {
        return Ocupat;
    }

    public void setOcupat(Integer Ocupat) {
        this.Ocupat = Ocupat;
    }
}
