/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Folosit pentru vizualizarea tuturor evenimente trecute/in desfasurare/ viitoare
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

import java.time.LocalDateTime;

public class EventResponseDTO {
    private int evenimentId;
    private String numeEveniment;
    private LocalDateTime dataInceput;
    private LocalDateTime dataFinal;

    // Constructor
    public EventResponseDTO(int evenimentId, String numeEveniment, LocalDateTime dataInceput, LocalDateTime dataFinal) {
        this.evenimentId = evenimentId;
        this.numeEveniment = numeEveniment;
        this.dataInceput = dataInceput;
        this.dataFinal = dataFinal;
    }

    // Getters and Setters
    public int getEvenimentId() {
        return evenimentId;
    }

    public void setEvenimentId(int evenimentId) {
        this.evenimentId = evenimentId;
    }

    public String getNumeEveniment() {
        return numeEveniment;
    }

    public void setNumeEveniment(String numeEveniment) {
        this.numeEveniment = numeEveniment;
    }

    public LocalDateTime getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(LocalDateTime dataInceput) {
        this.dataInceput = dataInceput;
    }

    public LocalDateTime getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDateTime dataFinal) {
        this.dataFinal = dataFinal;
    }
}
