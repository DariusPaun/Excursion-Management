/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.dto.ExcursionistiDetailsDTO;
import com.example.demo.entity.Excursionisti;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@Repository
public interface ExcursionistiRepository extends JpaRepository<Excursionisti, Integer> {

    @Query("SELECT new com.example.demo.dto.ExcursionistiDetailsDTO(dp.nume_complet, dp.varsta, dp.sex, e.Nr_excursii, e.bani_cheltuiti) " +
            "FROM Excursionisti e INNER JOIN DatePersonale dp ON e.date_personale_id = dp.Persoana_Id")
    List<ExcursionistiDetailsDTO> findExcursionistiDetails();
}
