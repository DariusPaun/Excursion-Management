/**
 * Clasa DTO (Data Transfer Object) este utilizată pentru a transfera date între sub-sisteme ale aplicației, în special între stratul de prezentare și server.
 * Creaza atractii pentru utilizarea lor in crearea evenimentelor
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.dto;

public class CreateAttractionDTO {
    private String name;
    private String description;
    private String imageUrl;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
