package tpSoapReservation;

import java.util.List; 
import java.util.Date;
import java.util.ArrayList;


public class Hotel {
	private String nom;
	private String adresse;
	private int nbEtoiles;
	private int capacite;
	private List<Chambre> chambres; 
public Hotel() {} 
	public Hotel(String nom,String adresse, int nbEtoiles, int capacite) {
		this.nom = nom;
		this.adresse = adresse;
		this.nbEtoiles = nbEtoiles;
		this.capacite = capacite;
		this.chambres = new ArrayList<>();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbEtoiles() {
		return nbEtoiles;
	}

	public void setNbEtoiles(int nbEtoiles) {
		this.nbEtoiles = nbEtoiles;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
	this.capacite = capacite;
	}
	
	public List<Chambre> getChambres() {
    	return chambres;
    }
	
	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

	public void ajoutChambre(Chambre chambre) {
			chambres.add(chambre);
		}
	// Methodes 
	public List<Chambre> rechercheDisponibilites(Date dateArrivee, Date dateDepart, double prixMax, int nbPersonnes) {
		List<Chambre> chambresDisponibles = new ArrayList<>();
		for (Chambre chambre : chambres) {
			if (chambre.getPrix() <= prixMax && chambre.getNbPersonne() >= nbPersonnes && 
				chambre.disponibleSurPeriode(dateArrivee, dateDepart)) {
				chambresDisponibles.add(chambre);
			}
		}
		return chambresDisponibles;
	} 
	public String toString() {
		return "Nom de l'hôtel : " + nom + "\n" +
				"Adresse : " + adresse + "\n" +
				"Nombre d'étoiles : " + nbEtoiles;
	}
}

