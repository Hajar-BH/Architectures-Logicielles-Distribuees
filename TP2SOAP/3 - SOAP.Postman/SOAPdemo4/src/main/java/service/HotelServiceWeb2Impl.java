package service;

import javax.jws.WebParam;

import javax.jws.WebService;

import classe.Chambre;
import classe.Client;
import classe.Hotel;
import classe.Reservation;

import java.util.Date;
import java.util.List;
@WebService(endpointInterface = "service.IHotelServiceWeb2")
public class HotelServiceWeb2Impl implements IHotelServiceWeb2 {

    private List<Hotel> hotels;

    public HotelServiceWeb2Impl(List<Hotel> hotels) {
        this.hotels = hotels;
    }
    @Override
    public String effectueReservation(
        @WebParam(name = "password") String password,
        @WebParam(name = "numeroChambre") int numeroChambre,
        @WebParam(name = "nom") String nom,
        @WebParam(name = "email") String email,
        @WebParam(name = "telephone") String telephone,
        @WebParam(name = "dateArrivee") Date dateArrivee,
        @WebParam(name = "dateDepart") Date dateDepart
    ) {
        
        if (!password.equals("passwordAgence")) {
            throw new RuntimeException("Authentification échouée.");
        }

       
        for (Hotel hotel : hotels) {
            Chambre chambre = hotel.getChambre(numeroChambre);
            if (chambre != null && chambre.disponibleSurPeriode(dateArrivee, dateDepart)) {
            	if (hotel.estReservee(numeroChambre, dateArrivee, dateDepart)) {
            		return "La chambre est déja réservée pour cette période.";
            	}
              
                Reservation reservation = new Reservation();
                reservation.setClient(new Client(nom, password, "LuxuryAgency",email, telephone));
                reservation.setChambre(chambre);
                reservation.setDateArrivee(dateArrivee);
                reservation.setDateDepart(dateDepart);
                chambre.ajoutReservation(reservation);
                return "Réservation confirmée avec la référence : " + reservation.getReservationId();
            }
        }
        throw new RuntimeException("La chambre est déja réservée pour cette période.");
    }
}

