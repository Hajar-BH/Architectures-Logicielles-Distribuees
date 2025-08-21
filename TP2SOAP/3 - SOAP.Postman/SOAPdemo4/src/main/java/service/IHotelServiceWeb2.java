package service;

import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface IHotelServiceWeb2 {	
    @WebMethod
    public String effectueReservation (
       	 @WebParam(name = "password") String password,
            @WebParam(name = "numeroChambre") int numeroChambre,
            @WebParam(name = "nom") String nom,
            @WebParam(name = "email") String email,
            @WebParam(name = "telephone") String telephone,
            @WebParam(name = "dateArrivee") Date dateArrivee,
            @WebParam(name = "dateDepart") Date dateDepart
       	);

       }
