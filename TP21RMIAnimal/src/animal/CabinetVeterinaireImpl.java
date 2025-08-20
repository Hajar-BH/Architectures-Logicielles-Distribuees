package animal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CabinetVeterinaireImpl extends UnicastRemoteObject implements ICabinetVeterinaire {
    private static final long serialVersionUID = 1L; 
    private List<IAnimal> listeAnimaux; 
    private final int[] seuils = {100, 500, 1000};
    
    
    // CONSTRUCTEUR
    public CabinetVeterinaireImpl() throws RemoteException { 
        this.listeAnimaux = new ArrayList<>(); // Initialisation de la liste des animaux
    }
 
    // Méthode pour rechercher un animal par son nom
    @Override
    public IAnimal rechercherAnimalParNom(String nom) throws RemoteException {
        for (IAnimal animal : listeAnimaux) {  
            if (animal.getNom().equalsIgnoreCase(nom)) {
                return animal; 
            }
        }
        return null; 
    }
    
    // Méthode pour ajouter un animal au Cabinet - Patient 
    @Override
    public void ajouterAnimal(IAnimal animal) throws RemoteException {
            this.listeAnimaux.add(animal); 
    }
 
    
    // Méthode pour obtenir la liste de tous les animaux
    @Override
    public List<IAnimal> getListeAnimaux() throws RemoteException {
        return listeAnimaux; 
    }
    
    // Méthode pour vérifier le seuil 
    public void verifierSeuilAlerte() throws RemoteException {
    	int nbPatients = this.listeAnimaux.size();
    	int[] seuils = {100, 500, 1000};
    	for (int seuil : seuils) {
    		if (nbPatients == seuil) {
    			System.out.println("Alerte : Le cabinet vétérinaire a atteint le seuil de " + seuil + "patients.");
    		}
    	}	
    }
}