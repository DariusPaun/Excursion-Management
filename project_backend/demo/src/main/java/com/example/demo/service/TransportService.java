/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Folosit pentru a vizualiza toate transporturile pentru crearea evenimentelor
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.entity.Transport;
import com.example.demo.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportService {

    @Autowired
    private TransportRepository transportRepository;

    // Method to retrieve all transport data
    public List<Transport> getAllTransports() {
        return transportRepository.findAll();
    }
}
