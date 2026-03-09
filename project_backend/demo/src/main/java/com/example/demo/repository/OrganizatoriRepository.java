/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Pentru vizualizarea si stergerea angajatilor de catre organizator
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.dto.AngajatDTO;
import com.example.demo.entity.Organizatori;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizatoriRepository extends CrudRepository<Organizatori, Integer> {

    @Query("SELECT new com.example.demo.dto.AngajatDTO(dp.nume_complet, dp.varsta, dp.cnp, dp.nr_telefon, dp.email, o.Salariu, o.Organizatori_Id) " +
            "FROM Organizatori o " +
            "JOIN DatePersonale dp " +
            "ON dp.Persoana_Id = o.Date_Personale_Id " +
            "ORDER BY dp.nume_complet ASC")
    List<AngajatDTO> findAllAngajati();
}
