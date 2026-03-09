/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class CopyEventResponseDTO {
    private int newEventId;
    private int copiedRows;

    public CopyEventResponseDTO(int newEventId, int copiedRows) {
        this.newEventId = newEventId;
        this.copiedRows = copiedRows;
    }
}

