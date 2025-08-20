package com.example.BaseDeDonnees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.BaseDeDonnees.model.Agence;
import com.example.BaseDeDonnees.model.Hotel;
import com.example.BaseDeDonnees.model.Offre;
import com.example.BaseDeDonnees.repository.AgenceRepository;
import com.example.BaseDeDonnees.repository.HotelRepository;
import com.example.BaseDeDonnees.repository.OffreRepository;

@Controller
public class OffreController {

    @Autowired
    private HotelRepository hotelRepository;

    @Autowired
    private AgenceRepository agenceRepository;

    @Autowired
    private OffreRepository offreRepository;

    // Afficher le formulaire pour ajouter une offre
    @GetMapping("/offres/ajouter")
    public String afficherFormulaireAjout(Model model) {
        model.addAttribute("hotels", hotelRepository.findAll());
        model.addAttribute("agences", agenceRepository.findAll());
        return "ajouterOffre"; // Le nom du fichier HTML
    }

    // Ajouter une nouvelle offre
    @PostMapping("/offres/ajouter")
    public String ajouterOffre(@RequestParam("hotelId") Integer hotelId,
                               @RequestParam("agenceId") Integer agenceId,
                               @RequestParam("prix") Double prix) {
        Hotel hotel = hotelRepository.findById(hotelId)
        		.orElseThrow(() -> new RuntimeException("Hôtel non trouvé"));
        Agence agence = agenceRepository.findById(agenceId)
        		.orElseThrow(() -> new RuntimeException("Agence non trouvée"));

        Offre nouvelleOffre = new Offre(hotel, agence, prix);
        offreRepository.save(nouvelleOffre);

        return "redirect:/offres"; 
    }
}