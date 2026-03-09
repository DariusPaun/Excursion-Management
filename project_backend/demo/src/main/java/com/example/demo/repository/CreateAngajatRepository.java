/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Creez un profil de angajat in care se adauga informatiile despre noul angajat
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.DatePersonale;
import com.example.demo.entity.Organizatori;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreateAngajatRepository extends JpaRepository<Organizatori, Long> {
    // JpaRepository will handle most of the database operations
}
