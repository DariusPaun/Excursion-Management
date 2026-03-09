/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Permite stergearea atractiilor
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.Atractii;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AttractionsDeleteRepository extends CrudRepository<Atractii, Integer> {

    @Transactional
    @Modifying
    @Query("DELETE FROM Atractii a WHERE a.Atractii_Id = :id")
    int deleteAttractionById(Integer id);
}
