package animal;
import java.io.Serializable;

// La classe Espece est sérialisable car nous devons la transmettre à distance
public class Espece implements Serializable {
	private static final long serialVersionUID = 1L;// Ajout du serialVersionUID qui est necessaire pour la serializable
	
	private String nomEspece;
	private int dureeDeVieMoyenne;

	// Constructeur pour initialiser les valeurs
	public Espece(String nomEspece, int dureeDeVieMoyenne) { // Constructeur pour initialiser les valeurs
		this.nomEspece = nomEspece;
		this.dureeDeVieMoyenne = dureeDeVieMoyenne;
	}
	// Getters 
	public String getNomEspece() { 
		return nomEspece;
	}
	public int getDureeDeVieMoyenne() {
		return dureeDeVieMoyenne;
	} 
	// Methode toString pour afficher les informations sous forme d'une chaine de caractere 
	public String toString() {
		return "Espèce : " + nomEspece +
			 ". La durée de vie moyenne :" + dureeDeVieMoyenne +  "ans";
	}
}
