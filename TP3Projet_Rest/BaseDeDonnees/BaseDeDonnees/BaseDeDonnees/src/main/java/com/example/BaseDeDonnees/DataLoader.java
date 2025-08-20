package com.example.BaseDeDonnees;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.BaseDeDonnees.model.Agence;
import com.example.BaseDeDonnees.model.Hotel;
import com.example.BaseDeDonnees.model.Offre;
import com.example.BaseDeDonnees.model.Reservation;
import com.example.BaseDeDonnees.repository.AgenceRepository;
import com.example.BaseDeDonnees.repository.HotelRepository;
import com.example.BaseDeDonnees.repository.OffreRepository;
import com.example.BaseDeDonnees.repository.ReservationRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final AgenceRepository agenceRepository;
    private final HotelRepository hotelRepository;
    private final OffreRepository offreRepository;
    private final ReservationRepository reservationRepository;

    public DataLoader(AgenceRepository agenceRepository, HotelRepository hotelRepository,
                      OffreRepository offreRepository, ReservationRepository reservationRepository) {
        this.agenceRepository = agenceRepository;
        this.hotelRepository = hotelRepository;
        this.offreRepository = offreRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Charger les agences
        Agence agence1 = new Agence("Agence GoVoyage");
        Agence agence2 = new Agence("Agence PromoVacances");
        Agence agence3 = new Agence("Agence TripInTouch");
        agenceRepository.saveAll(List.of(agence1, agence2, agence3));

        // Charger les hôtels
        Hotel hotel1 = new Hotel("Hôtel Royal Luxe", "Paris", 100.0);
        Hotel hotel2 = new Hotel("Grand Hôtel", "Paris", 150.0);
        Hotel hotel3 = new Hotel("Hôtel Relax", "Montpellier", 120.0);
        Hotel hotel4 = new Hotel("Hôtel Luxery", "Montpellier", 80.0);
        Hotel hotel5 = new Hotel("Hôtel Blanca", "Casablanca", 90.0);
        hotelRepository.saveAll(List.of(hotel1, hotel2, hotel3, hotel4, hotel5));

        // Charger les offres
        Offre offre1 = new Offre(hotel1, agence1, 90.0);
        Offre offre2 = new Offre(hotel2, agence2, 140.0);
        Offre offre3 = new Offre(hotel3, agence3, 115.0);
        Offre offre4 = new Offre(hotel4, agence3, 75.0);
        Offre offre5 = new Offre(hotel5, agence1, 90.0);
        offreRepository.saveAll(List.of(offre1, offre2, offre3, offre4, offre5));

        // Charger les réservations
        Reservation reservation1 = new Reservation(offre1, "Client A");
        Reservation reservation2 = new Reservation(offre2, "Client B");
        Reservation reservation3 = new Reservation(offre3, "Client C");
        reservationRepository.saveAll(List.of(reservation1, reservation2, reservation3));
    }
}