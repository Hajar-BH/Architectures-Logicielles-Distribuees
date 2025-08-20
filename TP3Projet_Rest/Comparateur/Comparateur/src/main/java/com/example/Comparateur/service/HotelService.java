package com.example.Comparateur.service;

import org.springframework.stereotype.Service;

import com.example.Comparateur.model.Agence;
import com.example.Comparateur.model.Hotel;
import com.example.Comparateur.model.Offre;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {

    private List<Offre> offres = new ArrayList<>();

    public HotelService() {
        Agence agence1 = new Agence("Agence GoVoyage");
        Agence agence2 = new Agence("Agence PromoVacances");
        Agence agence3 = new Agence("Agence TripInTouch");

        Hotel hotel1 = new Hotel(1, "Hôtel Royal Luxe", "Paris", 100);
        Hotel hotel2 = new Hotel(2, "Grand Hôtel", "Paris", 150);
        Hotel hotel3 = new Hotel(3, "Hotel Relax", "Montpellier", 120);
        Hotel hotel4 = new Hotel(4, "Hôtel Luxery", "Montpellier", 80);
        Hotel hotel5 = new Hotel(5, "Hôtel Blanca", "Casablanca", 90);


        offres.add(new Offre(hotel1, agence1, 90));
        offres.add(new Offre(hotel2, agence2, 140));
        offres.add(new Offre(hotel3, agence1, 115));
        offres.add(new Offre(hotel4, agence3, 75));
        offres.add(new Offre(hotel5, agence3, 100));
    }

    public List<Offre> getOffres() {
        return offres;
    }

    public List<Offre> comparerOffres(String ville, Double prix) {
        List<Offre> resultats = new ArrayList<>();
        for (Offre offre : offres) {
            if (offre.getHotel().getVille().equalsIgnoreCase(ville)) {
                if (prix == null || offre.getPrixPropose() <= prix) {
                    resultats.add(offre);
                }
            }
        }
        return resultats;
    }
}