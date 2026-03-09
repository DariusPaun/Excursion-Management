/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Se modifica tabelul many-to-many cand un profil de excursionist participa la un eveniment
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.EvenimenteAEO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenimenteExcursionistiRepository extends JpaRepository<EvenimenteAEO, Long> {

    @Query("SELECT e.nr_bilete FROM EvenimenteAEO e WHERE e.Evenitment_Id = :eventId AND e.Excursionisti_Id = :userId")
    Integer findTicketsByEventAndUser(@Param("eventId") Long eventId, @Param("userId") Long userId);

    @Modifying
    @Query("UPDATE EvenimenteAEO e SET e.nr_bilete = :ticketCount WHERE e.Evenitment_Id = :eventId AND e.Excursionisti_Id = :userId")
    void updateTicketCount(@Param("ticketCount") int ticketCount, @Param("eventId") Long eventId, @Param("userId") Long userId);

    // Use save() for inserts
}
