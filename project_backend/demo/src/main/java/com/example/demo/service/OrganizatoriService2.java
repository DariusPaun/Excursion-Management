/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 * Folosit pentru selectarea si vizualizarea organizatorilor pentru evenimente
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.dto.OrganizatoriAndEventsDTO;
import com.example.demo.dto.OrganizatorDTO;
import com.example.demo.dto.OrganizatoriEventsDTO;
import com.example.demo.repository.OrganizatoriRepository2;
import com.example.demo.repository.EvenimenteAEORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizatoriService2 {

    @Autowired
    private OrganizatoriRepository2 organizatoriRepository;

    @Autowired
    private EvenimenteAEORepository evenimenteAEORepository;

    public OrganizatoriAndEventsDTO getOrganizatoriAndEvents() {
        List<OrganizatorDTO> allOrganizatori = organizatoriRepository.findAllOrganizatori();
        List<OrganizatoriEventsDTO> organizatoriEvents = evenimenteAEORepository.findAllOrganizatoriEvents();

        OrganizatoriAndEventsDTO result = new OrganizatoriAndEventsDTO();
        result.setAllOrganizatori(allOrganizatori);
        result.setOrganizatoriEvents(organizatoriEvents);

        return result;
    }
}
