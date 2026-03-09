/**
 * Clasa Entity reprezintă o entitate din baza de date și este folosită pentru a defini structura
 * Reprezinta tabelul Transport din baza de date
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Transport_ID")
    private int Transport_ID;

    @Column(name = "Mijloc_Transport", nullable = false, length = 40)
    private String Mijloc_Transport;

    @Column(name = "Capacitate", nullable = false)
    private int Capacitate;

    @Column(name = "Nume_Companie", nullable = false, length = 30)
    private String Nume_Companie;

    // Getters and Setters with JsonProperty on getter methods

    @JsonProperty("Transport_ID") // Mapping the JSON property to "TransportId"
    public int getTransportId() {
        return Transport_ID;
    }

    public void setTransportId(int Transport_ID) {
        this.Transport_ID = Transport_ID;
    }

    @JsonProperty("Mijloc_Transport") // Mapping the JSON property to "MijlocTransport"
    public String getMijlocTransport() {
        return Mijloc_Transport;
    }

    public void setMijlocTransport(String Mijloc_Transport) {
        this.Mijloc_Transport = Mijloc_Transport;
    }

    @JsonProperty("Capacitate") // Mapping the JSON property to "Capacitate"
    public int getCapacitate() {
        return Capacitate;
    }

    public void setCapacitate(int Capacitate) {
        this.Capacitate = Capacitate;
    }

    @JsonProperty("Nume_Companie") // Mapping the JSON property to "NumeCompanie"
    public String getNumeCompanie() {
        return Nume_Companie;
    }

    public void setNumeCompanie(String Nume_Companie) {
        this.Nume_Companie = Nume_Companie;
    }
}
