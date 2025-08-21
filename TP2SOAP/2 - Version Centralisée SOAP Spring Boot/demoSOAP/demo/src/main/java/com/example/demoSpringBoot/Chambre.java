package com.example.demoSpringBoot;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Chambre {
	private Hotel hotel;
	private String typeChambre; // "Simple" "Double", "Suite"
	private int chambreNum;
	private double prix;
	private double superficie;
	private int nbPersonne;
	private int etage;
	private List<Reservation> reservations; 
	
	public Chambre() {}
	public Chambre(Hotel hotel, String typeChambre, int chambreNum, double prix, double superficie, int nbPersonne, int etage){
		this.hotel = hotel;
		this.typeChambre = typeChambre;
		this.chambreNum = chambreNum;
		this.prix = prix;
		this.superficie = superficie;
		this.nbPersonne = nbPersonne;
		this.etage = etage;
		this.reservations = new ArrayList<>(); 
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	public String getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	
	public int getChambreNum() {
		return chambreNum;
	}
	public void setChambreNum(int chambreNum) {
		this.chambreNum = chambreNum;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getNbPersonne() {
		return nbPersonne;
	}
	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}

	public int getEtage() {;
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	public List<Reservation> getReservations() {
    	return reservations;
    }
	
		// Méthodes
    public boolean disponibleSurPeriode(Date dateArrivee, Date dateDepart) {
        return reservations.isEmpty();
   }
     public void ajoutReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    public String toString () {
		 return " Type : " + typeChambre +", Numero : " + chambreNum +", Prix : " + prix + " €" +", Capacité : " 
							+ nbPersonne +" personnes, " + "Superficie : " + superficie +" m2, Etage : " + etage;
}

}



