/**
 * Clasa Service gestionează logica de afaceri a aplicației.
 *
 * @author Paun Darius Alexandru
 * @version 12 Ianuarie 2025
 */

package com.example.demo.service;

import com.example.demo.repository.ChangeOrgEventRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChangeOrgEventService {

    private final ChangeOrgEventRepository changeOrgEventRepository;

    public ChangeOrgEventService(ChangeOrgEventRepository changeOrgEventRepository) {
        this.changeOrgEventRepository = changeOrgEventRepository;
    }

    public int deleteEventOrganizers(Long eventId) {
        return changeOrgEventRepository.deleteEventOrganizers(eventId);
    }

    public int insertEventOrganizers(Long eventId, List<Long> selectedOrganizers) {
        return changeOrgEventRepository.insertEventOrganizers(eventId, selectedOrganizers);
    }
}
