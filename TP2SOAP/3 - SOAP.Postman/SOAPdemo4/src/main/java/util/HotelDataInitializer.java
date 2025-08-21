package util;

import java.util.ArrayList;
import java.util.List;

import classe.Chambre;
import classe.Hotel;

public class HotelDataInitializer {
    public static List<Hotel> initialiserHotels() {
        List<Hotel> hotels = new ArrayList<>();

	Hotel hotel1 = new Hotel(1197, "Hotel du Soleil", "123 Rue du Paradis, 34090 Montpellier, France", 5, 2);
    hotel1.ajoutChambre(new Chambre(hotel1, "Simple", 101, 75.0, 20.0, 1, 1));
    hotel1.ajoutChambre(new Chambre(hotel1, "Double", 102, 100.0, 25.0, 2, 3));
    hotel1.ajoutChambre(new Chambre(hotel1, "Suite", 201, 150.0, 35.0, 4, 2));
	
	
	Hotel hotel2 = new Hotel(11300, "Hotel Luxury", "123 Rue des rivieres, 34070 Montpellier, France", 3, 3);
	hotel2.ajoutChambre(new Chambre(hotel2, "Simple", 30, 90.0, 22.0, 1, 1));
    hotel2.ajoutChambre(new Chambre(hotel2, "Double", 35, 130.0, 30.0, 2, 1));
    hotel2.ajoutChambre(new Chambre(hotel2, "Suite", 100, 200.0, 40.0, 4, 3));
	
	
	Hotel hotel3 = new Hotel(5577, "Hotel Grand Rêve", "150 Rue Fes , 34000 Montpellier, France", 4, 2);
    hotel3.ajoutChambre(new Chambre(hotel3, "Simple", 301, 110.0, 25.0, 1, 1));
    hotel3.ajoutChambre(new Chambre(hotel3, "Double", 302, 160.0, 35.0, 2, 2));
    hotel3.ajoutChambre(new Chambre(hotel3, "Suite", 401, 250.0, 50.0, 4, 4));
   
    hotels.add(hotel1);
    hotels.add(hotel2);
    hotels.add(hotel3);

    return hotels;
    }
}
