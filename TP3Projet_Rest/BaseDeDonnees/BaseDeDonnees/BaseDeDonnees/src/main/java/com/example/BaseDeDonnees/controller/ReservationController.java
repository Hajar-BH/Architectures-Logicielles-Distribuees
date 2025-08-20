package com.example.BaseDeDonnees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.BaseDeDonnees.repository.ReservationRepository;

@Controller
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @GetMapping("/reservations")
    public String afficherReservations(Model model) {
        model.addAttribute("reservations", reservationRepository.findAll());
        return "reservations";
    }
}
