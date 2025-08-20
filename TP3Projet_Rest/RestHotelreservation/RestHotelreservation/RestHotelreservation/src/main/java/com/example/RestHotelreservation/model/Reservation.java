package com.example.RestHotelreservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id
    private String identifiantReservation;
    private String identifiantHotel;
    private String nomClient;
    private String prenomClient;
    private String carteBancaire;

    public Reservation(String identifiantReservation, String identifiantHotel, String nomClient,
			String prenomClient, String carteBancaire) {
	}
	// Getters et Setters
    public String getIdentifiantReservation() { return identifiantReservation; }
    public void setIdentifiantReservation(String identifiantReservation) { this.identifiantReservation = identifiantReservation; }
    
    public String getIdentifiantHotel() { return identifiantHotel; }
    public void setIdentifiantHotel(String identifiantHotel) { this.identifiantHotel = identifiantHotel; }
    
    public String getNomClient() { return nomClient; }
    public void setNomClient(String nomClient) { this.nomClient = nomClient; }

    public String getPrenomClient() { return prenomClient; }
    public void setPrenomClient(String prenomClient) { this.prenomClient = prenomClient; }
    
    public String getCarteBancaire() { return carteBancaire; }
    public void setCarteBancaire(String carteBancaire) { this.carteBancaire = carteBancaire; }
}