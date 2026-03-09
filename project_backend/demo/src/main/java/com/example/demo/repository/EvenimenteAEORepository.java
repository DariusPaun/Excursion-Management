/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Folosit pentru selectarea si vizualizarea organizatorilor pentru evenimente in tabelul many to many
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.EvenimenteAEO;
import com.example.demo.dto.OrganizatoriEventsDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvenimenteAEORepository extends CrudRepository<EvenimenteAEO, Integer> {

    @Query("SELECT new com.example.demo.dto.OrganizatoriEventsDTO(e.Evenitment_Id, e.Organizatori_Id) " +
            "FROM EvenimenteAEO e " +
            "WHERE e.Organizatori_Id IS NOT NULL")
    List<OrganizatoriEventsDTO> findAllOrganizatoriEvents();
}
