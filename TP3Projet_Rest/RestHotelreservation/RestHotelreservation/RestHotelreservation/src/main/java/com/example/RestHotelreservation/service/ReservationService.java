package com.example.RestHotelreservation.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestHotelreservation.model.Chambre;
import com.example.RestHotelreservation.repositories.ChambreRepository;

import jakarta.transaction.Transactional;

@Service
public class ReservationService {
 
	 @Autowired
	    private ChambreRepository chambreRepository;


	    @Transactional
	    public String reserverChambre(String identifiantHotel, String identifiantReservation, String nomClient, String prenomClient, String carteBancaire, String typeChambre) {
	        List<Chambre> chambresDisponibles = chambreRepository.findByTypeChambreAndDisponible(typeChambre, true);

	        if (chambresDisponibles.isEmpty()) {
	            return "Aucune chambre disponible pour ce type";
	        }

	        Chambre chambre = chambresDisponibles.get(0); // Prendre la première chambre disponible
	        chambre.setDisponible(false); 
	        chambreRepository.save(chambre);

	        return "Réservation réussie pour " + nomClient + " " + prenomClient + " dans la chambre " + typeChambre;
	    }
	}
