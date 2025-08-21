package classe;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement; 

@XmlRootElement(name = "reservation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reservation {
	private int reservationId;
	private Date dateArrivee;
	private Date dateDepart;
	private double prix;
	private Hotel hotel;
	private Chambre chambre;
	private Client client;
	private String status; 
	private String referenceReservation; 

public Reservation() {}
public Reservation(int reservationId, Date dateArrivee, Date dateDepart, double prix, Hotel hotel, Chambre chambre, Client client, String status, String referenceReservation) {
	this.reservationId = reservationId;
	this.dateArrivee = dateArrivee;
	this.dateDepart = dateDepart;
	this.prix = prix;
	this.hotel = hotel;
	this.chambre = chambre;
	this.client = client;
	this.status = status;
	this.referenceReservation = referenceReservation;
	}
	
	public int getReservationId() {
		return reservationId;
	}
	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
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
	
	public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    public String getReferenceReservation() {
        return referenceReservation;
    }

    public void setReferenceReservation(String referenceReservation) {
        this.referenceReservation = referenceReservation;
    }
	public String toString() {
		return "Réservation pour " + client.getIdentifiant() + " " + client.getNomAgence() 
		+ " à l'hotel " + hotel.getNom() + " du " + dateArrivee + " au " + dateDepart + ", "
				+ "Prix : " + prix +" €";
	}
}
 