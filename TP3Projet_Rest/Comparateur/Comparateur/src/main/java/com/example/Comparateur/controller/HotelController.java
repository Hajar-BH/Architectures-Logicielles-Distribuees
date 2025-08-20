package com.example.Comparateur.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Comparateur.model.Offre;
import com.example.Comparateur.model.Reservation;
import com.example.Comparateur.service.HotelService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    private List<Reservation> reservations = new ArrayList<>();
 
    @GetMapping("/offres")
    public List<Offre> getOffres() {
        return hotelService.getOffres();
    }

    @GetMapping("/comparaison")
    public List<Offre> comparerOffres(@RequestParam String ville, @RequestParam(required = false) Double prix) {
        return hotelService.comparerOffres(ville, prix);
    }

    @PostMapping("/reservations")
    public String reserver(@RequestBody Reservation reservation) {
        reservations.add(reservation);
        return "Réservation effectuée pour " + reservation.getClient() + " à " + reservation.getOffre().getHotel().getNom();
    }
}