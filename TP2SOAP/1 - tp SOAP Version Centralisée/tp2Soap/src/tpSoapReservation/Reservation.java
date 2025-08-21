package tpSoapReservation;

import java.util.Date;

public class Reservation {
	private int reservationNum;
	private Date dateArrivee; // 
	private Date dateDepart;
	private double prix;
	private Hotel hotel;
	private Chambre chambre;
	private Client client;

public Reservation() {}
public Reservation(int reservationNum, Date dateArrivee, Date dateDepart, double prix, Hotel hotel, Chambre chambre, Client client) {
	this.reservationNum = reservationNum;
	this.dateArrivee = dateArrivee;
	this.dateDepart = dateDepart;
	this.prix = prix;
	this.hotel = hotel;
	this.chambre = chambre;
	this.client = client;
	}

	public int getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}
	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	
	public Date getDateDepart() {
		return dateDepart;
	}
	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Chambre getChambre() {
		return chambre;
	}
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	// Methodes
	public boolean effectueReservation(Client client, Chambre chambre, Date dateArrivee, Date dateDepart, String carteCredit) {
		if (chambre.getReservations().isEmpty()) {
				this.client = client;
				this.chambre = chambre; 
				this.dateArrivee = dateArrivee;
				this.dateDepart = dateDepart;
				this.prix = chambre.getPrix();
				this.hotel = chambre.getHotel();
			chambre.getReservations().add(this);
			return true;
		}else {
			return false;
    }
}
	public String toString() {
		return "Réservation pour " + client.getNom() + " " + client.getPrenom() 
		+ " à l'hotel " + hotel.getNom() + " du " + dateArrivee + " au " + dateDepart + ", "
				+ "Prix : " + prix +" €";
	}
}
 