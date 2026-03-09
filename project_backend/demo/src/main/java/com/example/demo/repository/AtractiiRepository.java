/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Folosita pentru a vizualiza evenimentele
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.dto.AtractiiDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Atractii;
import java.util.List;

@Repository
public interface AtractiiRepository extends JpaRepository<Atractii, Integer> {

    // Custom query to get all attractions ordered by name and return DTO
    @Query("SELECT new com.example.demo.dto.AtractiiDTO(a.Atractii_Id, a.Nume_Atractie) FROM Atractii a ORDER BY a.Nume_Atractie ASC")
    List<AtractiiDTO> findAllAttractionsOrderedByName();
}

