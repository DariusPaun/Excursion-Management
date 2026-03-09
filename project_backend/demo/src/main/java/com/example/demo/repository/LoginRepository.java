/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Transfera informatiile necesare pentru a realiza procesul de log-in ul
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.dto.LoginDTO;
import com.example.demo.entity.Excursionisti;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoginRepository extends CrudRepository<Excursionisti, Integer> {

    @Query("SELECT new com.example.demo.dto.LoginDTO(e.parola, e.Excursionisti_Id, e.Nr_excursii, e.bani_cheltuiti, dp.nume_complet) " +
            "FROM Excursionisti e " +
            "INNER JOIN DatePersonale dp ON e.date_personale_id = dp.Persoana_Id")
    List<LoginDTO> findAllLoginDetails();
}
