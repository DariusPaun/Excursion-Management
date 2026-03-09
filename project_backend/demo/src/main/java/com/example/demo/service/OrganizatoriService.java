/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Pentru vizualizarea angajatilor de catre organizator
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.AngajatDTO;
import com.example.demo.repository.OrganizatoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizatoriService {

    @Autowired
    private OrganizatoriRepository organizatoriRepository;

    public List<AngajatDTO> getAllAngajati() {
        return organizatoriRepository.findAllAngajati();
    }
}
