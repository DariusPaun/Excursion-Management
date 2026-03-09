/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Creez un profil de angajat in care se adauga informatiile despre noul angajat
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.CreateAngajatRequestDTO;
import com.example.demo.entity.DatePersonale;
import com.example.demo.entity.Organizatori;
import com.example.demo.repository.DatePersonaleRepository;
import com.example.demo.repository.CreateAngajatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreateAngajatService {

    private final DatePersonaleRepository datePersonaleRepository;
    private final CreateAngajatRepository createAngajatRepository;

    public CreateAngajatService(DatePersonaleRepository datePersonaleRepository, CreateAngajatRepository createAngajatRepository) {
        this.datePersonaleRepository = datePersonaleRepository;
        this.createAngajatRepository = createAngajatRepository;
    }

    @Transactional
    public void createAngajat(CreateAngajatRequestDTO requestDTO) {
        // Step 1: Save into date_personale table
        DatePersonale datePersonale = new DatePersonale();
        datePersonale.setNume_complet(requestDTO.getNume());
        datePersonale.setCnp(requestDTO.getCnp());
        datePersonale.setSex(requestDTO.getSex());
        datePersonale.setNr_telefon(requestDTO.getNumarTelefon());
        datePersonale.setEmail(requestDTO.getEmail());
        datePersonale.setVarsta(requestDTO.getVarsta());

        int savedDatePersonale = datePersonale.getPersoana_Id();

        // Step 2: Save into organizatori table
        Organizatori organizatori = new Organizatori();
        organizatori.setData_Angajarii(requestDTO.getAdresaAngajare());
        organizatori.setSalariu(requestDTO.getSalariu());
        organizatori.setDate_Personale_Id(savedDatePersonale);

        createAngajatRepository.save(organizatori);
    }
}
