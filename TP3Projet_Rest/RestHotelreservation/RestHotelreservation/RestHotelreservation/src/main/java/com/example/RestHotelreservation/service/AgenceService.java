package com.example.RestHotelreservation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestHotelreservation.model.Chambre;
import com.example.RestHotelreservation.repositories.ChambreRepository;
import jakarta.transaction.Transactional;

@Service
public class AgenceService {

	@Autowired
    private ChambreRepository chambreRepository;
    
    @Transactional
    public List<Chambre> consulterDisponibilite(String typeChambre, boolean disponible) {
        List<Chambre> chambresDisponibles = chambreRepository.findByTypeChambreAndDisponible(typeChambre, disponible);
        System.out.println("Chambres disponibles : " + chambresDisponibles.size());
        for (Chambre chambre : chambresDisponibles) {
            System.out.println("Chambre: " + chambre.getTypeChambre() + ", Disponible: " + chambre.isDisponible() + ", Image URL: " + chambre.getImageUrl());
        }
         
            return chambresDisponibles; 
        }
}
    
