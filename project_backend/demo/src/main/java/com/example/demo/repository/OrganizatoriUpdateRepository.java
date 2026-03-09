/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Permite modificarea de catere organizator a salariului
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.Organizatori;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface OrganizatoriUpdateRepository extends JpaRepository<Organizatori, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Organizatori o SET o.Salariu = :salariu WHERE o.Organizatori_Id = :id")
    void updateSalary(@Param("salariu") Double salariu, @Param("id") Long id);
}
