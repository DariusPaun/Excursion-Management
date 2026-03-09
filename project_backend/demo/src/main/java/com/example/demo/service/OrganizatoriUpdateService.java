/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Permite modificarea de catere organizator a salariului
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.repository.OrganizatoriRepository;
import com.example.demo.repository.OrganizatoriUpdateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizatoriUpdateService {

    @Autowired
    private OrganizatoriUpdateRepository organizatoriUpdateRepository;

    public boolean updateSalary(Long id, Double salariu) {
        if (organizatoriUpdateRepository.existsById(id)) {
            organizatoriUpdateRepository.updateSalary(salariu, id);
            return true;
        }
        return false;
    }
}
