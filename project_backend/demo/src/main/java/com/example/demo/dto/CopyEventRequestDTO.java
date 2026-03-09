/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class CopyEventRequestDTO {
    private Long id;
    private String startDatetime;
    private String endDatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getEndDatetime() {
        return endDatetime;
    }

    public void setEndDatetime(String endDatetime) {
        this.endDatetime = endDatetime;
    }
}
