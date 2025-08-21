package classe;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "chambre")
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
	public Chambre(Hotel hotel, String typeChambre, int chambreNum, double prix,  double superficie, int nbPersonne,int etage){
		this.hotel = hotel;
		this.typeChambre = typeChambre;
		this.chambreNum = chambreNum;
		this.prix = prix;
		this.superficie = superficie;
		this.nbPersonne = nbPersonne;
		this.etage = etage;
		this.reservations = new ArrayList<>(); 
	}
	@XmlElement 
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	@XmlElement 
	public String getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	@XmlElement 
	public int getChambreNum() {
		return chambreNum;
	}
	public void setChambreNum(int chambreNum) {
		this.chambreNum = chambreNum;
	}
	@XmlElement 
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@XmlElement
	public double getSuperficie() {
		return superficie;
	}
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	@XmlElement
	public int getNbPersonne() {
		return nbPersonne;
	}
	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	@XmlElement
	public int getEtage() {;
		return etage;
	}
	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	public List<Reservation> getReservations() {
    	return reservations;
    }
	
		
	public boolean disponibleSurPeriode(Date dateDebut, Date dateFin) {
        for (Reservation reservation : reservations) {
            if (dateDebut.before(reservation.getDateDepart()) && dateFin.after(reservation.getDateArrivee())) {
                return false; 
            }
        }
        return true; 
    }
    public void ajoutReservation(Reservation reservation) {
        reservations.add(reservation);
    }
    @Override
    public String toString () {
		 return " Hotel : " + hotel.getNom() +",Type : " + typeChambre +", Numero : " + chambreNum +", Prix : " + prix + " €" +", Capacité : " 
							+ nbPersonne +" personnes, " + "Superficie : " + superficie +" m2, Etage : " + etage;
}

}



