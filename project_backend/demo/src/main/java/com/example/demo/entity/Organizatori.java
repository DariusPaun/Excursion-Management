/**
 * Clasa Entity reprezintă o entitate din baza de date și este folosită pentru a defini structura
 * Reprezinta tabelul Organizatori din baza de date
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Organizatori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Organizatori_Id")
    private int Organizatori_Id;

    @Column(name = "Date_Personale_Id")
    private Integer Date_Personale_Id;

    @Column(name = "Data_Angajarii")
    private LocalDate Data_Angajarii;

    @Column(name = "Salariu")
    private double Salariu;

    // Getters and Setters
    @JsonProperty("Organizatori_Id")
    public int getOrganizatori_Id() {
        return Organizatori_Id;
    }

    public void setOrganizatori_Id(int Organizatori_Id) {
        this.Organizatori_Id = Organizatori_Id;
    }

    @JsonProperty("Date_Personale_Id")
    public Integer getDate_Personale_Id() {
        return Date_Personale_Id;
    }

    public void setDate_Personale_Id(Integer Date_Personale_Id) {
        this.Date_Personale_Id = Date_Personale_Id;
    }

    @JsonProperty("Data_Angajarii")
    public LocalDate getData_Angajarii() {
        return Data_Angajarii;
    }

    public void setData_Angajarii(LocalDate Data_Angajarii) {
        this.Data_Angajarii = Data_Angajarii;
    }

    @JsonProperty("Salariu")
    public double getSalariu() {
        return Salariu;
    }

    public void setSalariu(double Salariu) {
        this.Salariu = Salariu;
    }
}
