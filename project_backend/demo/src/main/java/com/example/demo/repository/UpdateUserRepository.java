/**
 * Clasa Repository oferă metode pentru accesul la baza de date, izolând logica specifică accesului la date de restul aplicației.
 * Permite modificarea statisticilor excursionistului dupa cupmparea unui bilet
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.repository;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UpdateUserRepository extends CrudRepository<Excursionisti, Integer> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE excursionisti e " +
            "INNER JOIN date_personale dp ON dp.Persoana_Id = e.date_personale_id " +
            "SET e.Nr_excursii = :nrExcursii, e.bani_cheltuiti = :baniCheltuiti " +
            "WHERE dp.nume_complet = :numeComplet AND e.parola = :parola",
            nativeQuery = true)
    int updateUserData(String numeComplet, String parola, int nrExcursii, double baniCheltuiti);
}
