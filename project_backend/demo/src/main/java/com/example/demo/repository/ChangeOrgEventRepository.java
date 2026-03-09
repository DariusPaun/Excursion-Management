/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChangeOrgEventRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public int deleteEventOrganizers(Long eventId) {
        String deleteQuery = """
        DELETE FROM evenimente_a_e_o
        WHERE Evenitment_Id = ? AND Organizatori_Id IS NOT NULL
    """;

        Query query = entityManager.createNativeQuery(deleteQuery);
        query.setParameter(1, eventId); // Correctly set the parameter
        return query.executeUpdate();
    }


    public int insertEventOrganizers(Long eventId, List<Long> selectedOrganizers) {
        StringBuilder insertQuery = new StringBuilder("""
            INSERT INTO evenimente_a_e_o (Evenitment_Id, Organizatori_Id) VALUES
        """);

        for (int i = 0; i < selectedOrganizers.size(); i++) {
            insertQuery.append("(?, ?)");
            if (i < selectedOrganizers.size() - 1) {
                insertQuery.append(", ");
            }
        }

        Query query = entityManager.createNativeQuery(insertQuery.toString());
        int parameterIndex = 1;

        for (Long organizerId : selectedOrganizers) {
            query.setParameter(parameterIndex++, eventId);
            query.setParameter(parameterIndex++, organizerId);
        }

        return query.executeUpdate();
    }
}
