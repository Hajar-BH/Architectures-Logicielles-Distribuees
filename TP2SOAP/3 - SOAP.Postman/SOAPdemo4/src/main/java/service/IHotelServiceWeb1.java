package service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;


@WebService
public interface IHotelServiceWeb1 {
    @WebMethod
    String rechercheDisponibilites(
        @WebParam(name = "dateArrivee") String dateArrivee,
        @WebParam(name = "dateDepart") String dateDepart,
        @WebParam(name = "nbPersonnes") int nbPersonnes,
        @WebParam(name = "prixMax") double prixMax
    );
}
