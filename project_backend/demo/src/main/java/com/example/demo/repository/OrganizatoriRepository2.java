/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Folosit pentru selectarea si vizualizarea organizatorilor pentru evenimente
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.dto.OrganizatorDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Organizatori;

import java.util.List;

@Repository
public interface OrganizatoriRepository2 extends CrudRepository<Organizatori, Integer> {

    @Query("SELECT new com.example.demo.dto.OrganizatorDTO(o.Organizatori_Id, dp.nume_complet) " +
            "FROM Organizatori o " +
            "JOIN DatePersonale dp " +
            "ON o.Date_Personale_Id = dp.Persoana_Id ")
    List<OrganizatorDTO> findAllOrganizatori();
}
