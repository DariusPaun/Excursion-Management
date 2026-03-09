/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Permite stergerea excursionistilor
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.repository.ExcursionistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExcursionistServices {

    @Autowired
    private ExcursionistRepository excursionistRepository;

    public boolean deleteExcursionist(int id) {
        if (excursionistRepository.existsById(id)) {
            excursionistRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
