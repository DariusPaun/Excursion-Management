/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Permite modificarea statisticilor excursionistului dupa cupmparea unui bilet
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.repository.UpdateUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UpdateUserService {

    @Autowired
    private UpdateUserRepository excursionistiRepository;

    @Transactional
    public int updateUser(String numeComplet, String parola, int nrExcursii, double baniCheltuiti) {
        return excursionistiRepository.updateUserData(numeComplet, parola, nrExcursii, baniCheltuiti);
    }
}
