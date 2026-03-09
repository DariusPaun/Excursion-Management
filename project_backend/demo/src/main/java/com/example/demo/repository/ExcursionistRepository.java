/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Pentru vizualizarea si stergerea tuturor excursionistilor de catre Organizator
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.dto.ExcursionistDTO;
import com.example.demo.entity.Excursionisti;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExcursionistRepository extends CrudRepository<Excursionisti, Integer> {

    @Query("SELECT new com.example.demo.dto.ExcursionistDTO(dp.nume_complet, dp.varsta, dp.cnp, dp.nr_telefon, dp.email, e.Excursionisti_Id) " +
            "FROM Excursionisti e " +
            "JOIN DatePersonale dp " +
            "ON dp.Persoana_Id = e.date_personale_id " +
            "ORDER BY dp.nume_complet ASC" )
    List<ExcursionistDTO> findAllExcursionists();
}
