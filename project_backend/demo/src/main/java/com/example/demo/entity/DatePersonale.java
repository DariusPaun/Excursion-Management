/**
 * Clasa Entity reprezintă o entitate din baza de date și este folosită pentru a defini structura
 * Reprezinta tabelul Date Personale din baza de date
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
public class DatePersonale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Persoana_Id")
    private int Persoana_Id;

    @Column(name = "nume_complet")
    private String nume_complet;

    @Column(name = "cnp")
    private String cnp;

    @Column(name = "sex")
    private String sex;

    @Column(name = "nr_telefon")
    private String nr_telefon;

    @Column(name = "email")
    private String email;

    @Column(name = "varsta")
    private Integer varsta;

    // Getters and Setters
    @JsonProperty("Persoana_Id")
    public int getPersoana_Id() {
        return Persoana_Id;
    }

    public void setPersoana_Id(int Persoana_Id) {
        this.Persoana_Id = Persoana_Id;
    }

    @JsonProperty("nume_complet")
    public String getNume_complet() {
        return nume_complet;
    }

    public void setNume_complet(String nume_complet) {
        this.nume_complet = nume_complet;
    }

    @JsonProperty("cnp")
    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @JsonProperty("sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @JsonProperty("nr_telefon")
    public String getNr_telefon() {
        return nr_telefon;
    }

    public void setNr_telefon(String nr_telefon) {
        this.nr_telefon = nr_telefon;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("varsta")
    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
