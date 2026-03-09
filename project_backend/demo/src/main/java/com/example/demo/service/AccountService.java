/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Creaza un cont de excursionist
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.CreateAccountRequestDTO;
import com.example.demo.entity.DatePersonale;
import com.example.demo.entity.Excursionisti;
import com.example.demo.repository.ExcursionistiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {



    @Autowired
    private ExcursionistiRepository excursionistiRepository;

    @Transactional
    public String createAccount(CreateAccountRequestDTO request) {
        try {
            // Step 1: Insert into DatePersonale table
            DatePersonale datePersonale = new DatePersonale();
            datePersonale.setNume_complet(request.getNume());
            datePersonale.setCnp(request.getCnp());
            datePersonale.setSex(request.getSex());
            datePersonale.setNr_telefon(request.getNumarTelefon());
            datePersonale.setEmail(request.getEmail());
            datePersonale.setVarsta(request.getVarsta());

            int savedDatePersonale = datePersonale.getPersoana_Id();

            // Step 2: Insert into Excursionisti table
            Excursionisti excursionisti = new Excursionisti();
            excursionisti.setParola(request.getParola());
            excursionisti.setDate_personale_id(savedDatePersonale);

            excursionistiRepository.save(excursionisti);

            return "Account created successfully";
        } catch (Exception e) {
            throw new RuntimeException("Account creation failed", e);
        }
    }
}
