package service;

import javax.jws.WebService;
import classe.Chambre;
import classe.Hotel;

import javax.jws.WebParam;
import javax.jws.WebMethod;
import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

@WebService(endpointInterface = "service.IHotelServiceWeb1")
public class HotelServiceWeb1Impl implements IHotelServiceWeb1 {

    private List<Hotel> hotels;

    public HotelServiceWeb1Impl(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    @Override
    @WebMethod
    public String rechercheDisponibilites(
        @WebParam(name = "dateArrivee") String dateArriveeStr,
        @WebParam(name = "dateDepart") String dateDepartStr,
        @WebParam(name = "nbPersonnes") int nbPersonnes,
        @WebParam(name = "prixMax") double prixMax)  {

        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateArrivee = LocalDate.parse(dateArriveeStr, formatter);  
        LocalDate dateDepart = LocalDate.parse(dateDepartStr, formatter);   
        
    
        Date dateArriveeDate = Date.from(dateArrivee.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date dateDepartDate = Date.from(dateDepart.atStartOfDay(ZoneId.systemDefault()).toInstant());
      
        System.out.println("Recherche de chambres pour les dates : " + dateArrivee + " à " + dateDepart);
        System.out.println("Nombre de personnes : " + nbPersonnes + " | Prix max : " + prixMax);

        // Liste des chambres disponibles
        Hotel hotel;
         hotel = this.hotels.get(0);
        List<Chambre> chambresDisponibles = hotel.getChambres();

            for (Chambre chambre : hotel.getChambres()) {
                if (chambre.getNbPersonne() >= nbPersonnes && 
                    chambre.getPrix() <= prixMax &&
                    chambre.disponibleSurPeriode(dateArriveeDate, dateDepartDate)) {
                    chambresDisponibles.add(chambre);
                
                    System.out.println(" - Chambre disponible : " + hotel.getNom() + " - Numéro de chambre : " + chambre.getChambreNum());
                    System.out.println("Chambre disponible : " + chambre.toString());
                }
            return chambre.toString(); 
        } 
    return "Aucune chambre trouvée";
  }
}
