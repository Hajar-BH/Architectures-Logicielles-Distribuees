package animal;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface ICabinetVeterinaire extends Remote {
    
  // Methode pour rechercher un animal par son nom
    IAnimal rechercherAnimalParNom(String nom) throws RemoteException;
    
  // Methode pour obtenir la liste de tous les animaux du cabinet veterinaire
    List<IAnimal> getListeAnimaux() throws RemoteException;
    
  // Methode pour ajouter d'un Animal au cabinet - Patient 
    void ajouterAnimal(IAnimal animal) throws RemoteException;

  // Methode pour vérifier le seuil d'alerte
	void verifierSeuilAlerte() throws RemoteException;;

    }
