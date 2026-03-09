/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

import java.time.LocalDateTime;

public class eventDTO {

    private int Eveniment_Id;
    private LocalDateTime Data_Inceput;
    private LocalDateTime Data_final;
    private String Nume_eveniment;
    private String Descriere;
    private Integer Pret;
    private int Atractii_Id;
    private String Nume_Atractie;
    private String Descriere_Atractie;
    private String URL_Poza;

    // Constructor matching the query
    public eventDTO(int Eveniment_Id, LocalDateTime Data_Inceput, LocalDateTime Data_final,
                    String Nume_eveniment, String Descriere, Integer Pret,
                    int Atractii_Id, String Nume_Atractie, String Descriere_Atractie,
                    String URL_Poza) {
        this.Eveniment_Id = Eveniment_Id;
        this.Data_Inceput = Data_Inceput;
        this.Data_final = Data_final;
        this.Nume_eveniment = Nume_eveniment;
        this.Descriere = Descriere;
        this.Pret = Pret;
        this.Atractii_Id = Atractii_Id;
        this.Nume_Atractie = Nume_Atractie;
        this.Descriere_Atractie = Descriere_Atractie;
        this.URL_Poza = URL_Poza;
    }

    // Getters and Setters

    public int getEveniment_Id() {
        return Eveniment_Id;
    }

    public void setEveniment_Id(int Eveniment_Id) {
        this.Eveniment_Id = Eveniment_Id;
    }

    public LocalDateTime getData_Inceput() {
        return Data_Inceput;
    }

    public void setData_Inceput(LocalDateTime Data_Inceput) {
        this.Data_Inceput = Data_Inceput;
    }

    public LocalDateTime getData_final() {
        return Data_final;
    }

    public void setData_final(LocalDateTime Data_Final) {
        this.Data_final = Data_Final;
    }

    public String getNume_eveniment() {
        return Nume_eveniment;
    }

    public void setNume_eveniment(String Nume_eveniment) {
        this.Nume_eveniment = Nume_eveniment;
    }

    public String getDescriere() {
        return Descriere;
    }

    public void setDescriere(String Descriere) {
        this.Descriere = Descriere;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setPret(Integer Pret) {
        this.Pret = Pret;
    }

    public int getAtractii_Id() {
        return Atractii_Id;
    }

    public void setAtractii_Id(int Atractii_Id) {
        this.Atractii_Id = Atractii_Id;
    }

    public String getNume_Atractie() {
        return Nume_Atractie;
    }

    public void setNume_Atractie(String Nume_Atractie) {
        this.Nume_Atractie = Nume_Atractie;
    }

    public String getDescriere_Atractie() {
        return Descriere_Atractie;
    }

    public void setDescriere_Atractie(String Descriere_Atractie) {
        this.Descriere_Atractie = Descriere_Atractie;
    }

    public String getURL_Poza() {
        return URL_Poza;
    }

    public void setURL_Poza(String URL_Poza) {
        this.URL_Poza = URL_Poza;
    }
}
