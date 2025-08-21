package classe;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;
import java.util.ArrayList;

@XmlRootElement(name = "hotel")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hotel {
	private int id;
	private String nom;
	private String adresse;
	private int nbEtoiles;
	private int capacite;
	private List<Chambre> chambres; 
public Hotel() {} 
	public Hotel(int id, String nom,String adresse, int nbEtoiles, int capacite) {
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.nbEtoiles = nbEtoiles;
		this.capacite = capacite;
		this.chambres = new ArrayList<>();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public Chambre getChambre(int chambreNum) {
	    for (Chambre chambre : chambres) {
	        if (chambre.getChambreNum() == chambreNum) {
	            return chambre;
	        }
	    }
	    return null; // Retourne null si aucune chambre ne correspond
	}
	
	public Reservation effectueReservation(Client client, int numeroChambre, Date dateDebut, Date dateFin) {
	    for (Chambre chambre : chambres) {
	        if (chambre.getChambreNum() == numeroChambre) {
	            // Vérification de la disponibilité
	            if (chambre.disponibleSurPeriode(dateDebut, dateFin)) {
	                // Création de la réservation
	                Reservation reservation = new Reservation();
	                reservation.setReservationId((int) (Math.random() * 10000)); // Exemple d'ID unique
	                reservation.setClient(client);
	                reservation.setChambre(chambre);
	                reservation.setDateArrivee(dateDebut);
	                reservation.setDateDepart(dateFin);
	                reservation.setPrix(chambre.getPrix());
	                chambre.ajoutReservation(reservation);
	                return reservation; // Retourner la réservation réussie
	            } else {
	                throw new RuntimeException("La chambre n'est pas disponible pour les dates sélectionnées.");
	            }
	        }
	    }
	    throw new RuntimeException("Chambre introuvable.");
	}
	
	
    public boolean estReservee(int numeroChambre, Date dateArrivee, Date dateDepart) {
        Chambre chambre = getChambre(numeroChambre);
        if (chambre != null) {
            for (Reservation reservation : chambre.getReservations()) {
                if (dateArrivee.before(reservation.getDateDepart()) && dateDepart.after(reservation.getDateArrivee())) {
                    return true; 
                }
            }
        }
        return false; 
    }
	
	public String toString() {
		return "Nom de l'hôtel : " + nom + "\n" +
				"Adresse : " + adresse + "\n" +
				"Nombre d'étoiles : " + nbEtoiles;
	}
}

