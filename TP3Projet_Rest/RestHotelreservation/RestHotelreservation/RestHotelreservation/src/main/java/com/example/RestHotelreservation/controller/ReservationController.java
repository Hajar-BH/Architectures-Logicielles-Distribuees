package com.example.RestHotelreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.RestHotelreservation.service.ReservationService;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController {
	
	@Autowired
    private ReservationService reservationService;

	@PostMapping("/reserver")
    public String reserverChambre(@RequestParam int chambreId, 
            					@RequestParam String nomClient, 
            					@RequestParam String clientEmail,
            					@RequestParam String identifiantReservation, 
            					@RequestParam String identifiantHotel,
            					@RequestParam String prenomClient, 
            					@RequestParam String carteBancaire,
            					@RequestParam String typeChambre) {
return reservationService.reserverChambre(identifiantHotel, identifiantReservation, nomClient, prenomClient, carteBancaire, typeChambre);
    }
}
