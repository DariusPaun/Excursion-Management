/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Afiseaza informatii despre un eveniment in functie de id-ul acesteia
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.Evenimente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EvenimentRepository extends JpaRepository<Evenimente, Long> {

    // Query to get event details and associated transport info for a specific event ID
    @Query("SELECT e.Eveniment_Id,e.Data_Inceput,e.Data_final,e.Nume_eveniment,e.Pret,e.Ocupat FROM Evenimente e JOIN FETCH Transport t ON t.Transport_ID=e.Transport_Id WHERE e.Eveniment_Id = :eventId")
    Optional<Evenimente> findEventWithTransportById(Long eventId);
}
