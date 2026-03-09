/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Creaza un cont de excursionist
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */
package com.example.demo.repository;

import com.example.demo.entity.DatePersonale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatePersonaleRepository extends JpaRepository<DatePersonale, Long> {
    //Default
}