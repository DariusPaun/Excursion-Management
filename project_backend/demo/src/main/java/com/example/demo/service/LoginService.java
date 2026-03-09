/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Transfera informatiile necesare pentru a realiza procesul de log-in ul
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.LoginDTO;
import com.example.demo.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private LoginRepository excursionistiRepository;

    public List<LoginDTO> getLoginDetails() {
        return excursionistiRepository.findAllLoginDetails();
    }
}
