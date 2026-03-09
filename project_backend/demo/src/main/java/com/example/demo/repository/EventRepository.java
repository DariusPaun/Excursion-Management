/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Folosit pentru vizualizarea tuturor evenimente trecute/in desfasurare/ viitoare
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.dto.EventResponseDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Evenimente;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Evenimente, Integer> {

    @Query("SELECT new com.example.demo.dto.EventResponseDTO(e.Eveniment_Id, e.Nume_eveniment, e.Data_Inceput, e.Data_final) " +
            "FROM Evenimente e WHERE e.Data_Inceput > :now ORDER BY e.Data_Inceput ASC")
    List<EventResponseDTO> findUpcomingEvents(LocalDateTime now);

    @Query("SELECT new com.example.demo.dto.EventResponseDTO(e.Eveniment_Id, e.Nume_eveniment, e.Data_Inceput, e.Data_final) " +
            "FROM Evenimente e WHERE e.Data_Inceput <= :now AND e.Data_final >= :now ORDER BY e.Data_Inceput ASC")
    List<EventResponseDTO> findOngoingEvents(LocalDateTime now);

    @Query("SELECT new com.example.demo.dto.EventResponseDTO(e.Eveniment_Id, e.Nume_eveniment, e.Data_Inceput, e.Data_final) " +
            "FROM Evenimente e WHERE e.Data_final < :now ORDER BY e.Data_Inceput ASC")
    List<EventResponseDTO> findPastEvents(LocalDateTime now);
}
