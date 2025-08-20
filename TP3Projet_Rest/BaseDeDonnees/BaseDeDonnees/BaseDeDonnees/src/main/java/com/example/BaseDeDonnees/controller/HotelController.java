package com.example.BaseDeDonnees.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.BaseDeDonnees.model.Offre;
import com.example.BaseDeDonnees.repository.OffreRepository;
import com.example.BaseDeDonnees.service.HotelService;

@Controller
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @Autowired
    private OffreRepository offreRepository;

    @GetMapping("/offres")
    public String afficherOffres(
            @RequestParam(value = "ville", required = false) String ville,
            @RequestParam(value = "prix", required = false) Double prix,
            Model model) {

        List<Offre> offres;

        if (ville != null && !ville.isEmpty() && prix != null) {
            offres = offreRepository.findByHotelVilleAndPrixProposeLessThanEqual(ville, prix);
        } else if (ville != null && !ville.isEmpty()) {
            offres = offreRepository.findByHotelVille(ville);
        } else if (prix != null) {
            offres = offreRepository.findByPrixProposeLessThanEqual(prix);
        } else {
            offres = offreRepository.findAll();
        }

        model.addAttribute("offres", offres);
        return "offres";
    }
}