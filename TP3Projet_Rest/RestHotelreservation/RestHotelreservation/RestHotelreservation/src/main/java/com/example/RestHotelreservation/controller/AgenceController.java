package com.example.RestHotelreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestHotelreservation.model.Chambre;
import com.example.RestHotelreservation.service.AgenceService;

@RestController
@RequestMapping("/api/agence")
public class AgenceController {

	@Autowired
    private AgenceService agenceService;

    @GetMapping("/disponibilite")
    public List<Chambre> getChambresDisponibilite(@RequestParam String typeChambre, @RequestParam boolean disponible) {
        return agenceService.consulterDisponibilite(typeChambre, disponible);
    }
}