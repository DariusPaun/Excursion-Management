/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Permite copiererea unui eveniment schimband perioada de desfasurare
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class CopyEventRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Long insertEvent(Long eventId, String startDatetime, String endDatetime) {
        String insertEventQuery = """
            INSERT INTO evenimente (Transport_Id, Data_Inceput, Data_Final, Descriere, Pret, Nume_eveniment, Ocupat)
            SELECT Transport_Id, ?, ?, Descriere, Pret, Nume_eveniment, 0
            FROM evenimente
            WHERE Eveniment_Id = ?
        """;

        Query query = entityManager.createNativeQuery(insertEventQuery);
        query.setParameter(1, startDatetime);
        query.setParameter(2, endDatetime);
        query.setParameter(3 ,eventId);
        query.executeUpdate();

        // Fetch the last inserted ID
        Query lastInsertIdQuery = entityManager.createNativeQuery("SELECT LAST_INSERT_ID()");
        return ((Number) lastInsertIdQuery.getSingleResult()).longValue();
    }

    public int copyEventAttractions(Long newEventId, Long originalEventId) {
        String copyAttractionsQuery = """
            INSERT INTO evenimente_a_e_o (Evenitment_Id, Atractii_Id)
            SELECT ?, Atractii_Id
            FROM evenimente_a_e_o
            WHERE Evenitment_Id = ? AND Atractii_Id IS NOT NULL
        """;

        Query query = entityManager.createNativeQuery(copyAttractionsQuery);
        query.setParameter(1, newEventId);
        query.setParameter(2, originalEventId);
        return query.executeUpdate();
    }
}
