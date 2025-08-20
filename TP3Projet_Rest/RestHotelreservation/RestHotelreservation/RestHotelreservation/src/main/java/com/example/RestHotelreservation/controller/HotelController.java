package com.example.RestHotelreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestHotelreservation.exception.HotelNotFoundException;
import com.example.RestHotelreservation.model.Hotel;
import com.example.RestHotelreservation.repositories.HotelRepository;

@RestController
@RequestMapping("/api/hotels")
public class HotelController {
	
	@Autowired
	private HotelRepository hotelRepository;

 // Endpoint pour récupérer un hôtel par ID
    @GetMapping("/{id}")
    public Hotel getHotelById(long id) throws HotelNotFoundException {
        return hotelRepository.findById(id)
        		.orElseThrow(() -> new HotelNotFoundException("Error : could not find employee with ID " + id));
    }

    @PostMapping("/add")
    public String ajouterHotel(@RequestParam long id, @RequestParam String nom, @RequestParam String adresse,
                               @RequestParam int etoiles, @RequestParam int nombreChambres) {
        hotelRepository.save(new Hotel(id, nom, adresse, etoiles, nombreChambres));
        return "Hotel ajouté!";
    }
    
}