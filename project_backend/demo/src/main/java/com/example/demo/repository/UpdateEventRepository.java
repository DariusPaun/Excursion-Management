/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Dupa cumpararea unui bilet creste cat de ocupat este acel eveniment
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UpdateEventRepository extends JpaRepository<Evenimente, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Evenimente e SET e.Ocupat = :ocupat WHERE e.Eveniment_Id = :eventId")
    int updateOcupat(@Param("ocupat") Integer ocupat, @Param("eventId") Long eventId);
}
