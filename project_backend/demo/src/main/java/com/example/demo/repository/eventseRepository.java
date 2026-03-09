/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Folosit pentru vizualizarea evenimentelor pentru excursionisti
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.Evenimente;
import com.example.demo.dto.eventDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface eventseRepository extends JpaRepository<Evenimente, Long> {

    @Query("SELECT new com.example.demo.dto.eventDTO(e.Eveniment_Id, e.Data_Inceput, e.Data_final, e.Nume_eveniment, e.Descriere, e.Pret, a.Atractii_Id, a.Nume_Atractie, a.Descriere_Atractie, a.URL_Poza) " +
            "FROM Evenimente e " +
            "JOIN EvenimenteAEO eo ON e.Eveniment_Id = eo.Evenitment_Id " +
            "JOIN Atractii a ON eo.Atractii_Id = a.Atractii_Id")
    List<eventDTO> findAllEventsWithAttractions();
}
