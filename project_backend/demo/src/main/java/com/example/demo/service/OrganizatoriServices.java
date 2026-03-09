/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Permite stergeraea organizatorilor
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.repository.OrganizatoriRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizatoriServices {

    @Autowired
    private OrganizatoriRepository organizatoriRepository;

    public boolean deleteOrganizatori(int id) {
        if (organizatoriRepository.existsById(id)) {
            organizatoriRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
