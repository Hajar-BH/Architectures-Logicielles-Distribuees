package animal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Implementation de l'interface Animal
	public class AnimalImpl extends UnicastRemoteObject implements IAnimal {
		private String nom; 
		private String nomDuMaitre;
		private String race;
		//private String espece;
		private Espece espece;
		private IDossierDeSuivi dossierDeSuivi; 
	 
//Constructeur 
	
	//public AnimalImpl (String nom, String nomDuMaitre, String race, String espece) throws RemoteException {
	public AnimalImpl (String nom, String nomDuMaitre, String race, String especeNom, int dureeDeVieMoyenne) throws RemoteException {
		this.nom = nom;
		this.nomDuMaitre = nomDuMaitre;
		this.race = race;
		this.espece = new Espece(especeNom, dureeDeVieMoyenne);
        this.dossierDeSuivi = new DossierDeSuiviImpl ("Vaccination à jour, prochaine consultation prévue après 6 mois.");  
	}
	
	// Méthodes pour obtenir les informations de l'Animal
    public String getNom() throws RemoteException {
        return this.nom;
    }
    public String getNomDuMaitre() throws RemoteException {
        return this.nomDuMaitre;
    }
        public String getRace() throws RemoteException {
        return this.race;
    }
    @Override
    public Espece getEspece() throws RemoteException {
    	return this.espece;
    }
    public String getNomEspece() throws RemoteException {
    	return this.espece.getNomEspece();
    }
    public int getDureeDeMoyenneVie() throws RemoteException {
        return this.espece.getDureeDeVieMoyenne();
    }
    
    
   public String getNomComplet() throws RemoteException {
       return "Nom complet de l'animal : " + nom + ", " + nomDuMaitre + ", " + race + ", " 
    		   + espece.getNomEspece() + ", Durée de vie moyenne : " + espece.getDureeDeVieMoyenne() + " ans";
       		}
   @Override
   public void afficherNomComplet() throws RemoteException {
		System.out.println(getNomComplet());
	}

   public IDossierDeSuivi getDossierDeSuivi() throws RemoteException {
	   return this.dossierDeSuivi; 
   }
   
   public void setDossierDeSuivi(IDossierDeSuivi dossier) throws RemoteException {
	   this.dossierDeSuivi = dossier; 
   }  
}
	
	
	