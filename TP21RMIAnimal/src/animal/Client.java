package animal;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.Scanner;
 

public class Client {
	private Client() {
	}
	public static void main(String[] args) {
	        String host = (args.length < 1) ? null : args[0];
	        try { 
	// --------------------------- Partie de l'Animal distribué ---------------------------  
	        	
           // Registry registry = LocateRegistry.getRegistry("localhost", 1099);
        // Connexion à l'objet distant Animal
            //IAnimal stub = (IAnimal) registry.lookup("Animal");
            //IAnimal animal = (IAnimal) registry.lookup("Animal");
           
            //Espece espece = animal.getEspece();
            //System.out.println("Espèce de l'animal : " + espece.getNomEspece() + ". Durée de vie moyenne : " + espece.getDureeDeVieMoyenne() + " ans");
            
            //IDossierDeSuivi dossier = animal.getDossierDeSuivi();
            //System.out.println("Dossier de suivi : " + dossier.getDetails());
        
       
    // -------------------------------- Partie du Cabinet Vétérinaire --------------------------------
            
            
	        	Registry registry = LocateRegistry.getRegistry("localhost", 1099);
	        // Récupération d l'objet CabinetVeterinaire distant et Connexion au registre RMI
	        	ICabinetVeterinaire cabinet = (ICabinetVeterinaire) registry.lookup("CabinetVeterinaire");

            	// Recherche d'un animal dans le cabinet par nom
            IAnimal animal = cabinet.rechercherAnimalParNom("Mimmy");
            if (animal != null) {
                System.out.println("Animal trouvé: " + animal.getNomComplet());
            } else {
                System.out.println("Animal non trouvé");
            }
         
            	// Affichage de la liste de tous les animaux dans le cabinet
            List<IAnimal> listeAnimaux = cabinet.getListeAnimaux();
            System.out.println("Liste des animaux dans le cabinet:");
            System.out.println(" --------------- ---------------");
            for (IAnimal animalDansCabinet : listeAnimaux) {
                System.out.println(animalDansCabinet.getNomComplet());
                
               // Affichage des détails du dossier de suivi
            if (animalDansCabinet.getDossierDeSuivi() != null) {
                System.out.println("Dossier de suivi : " + animalDansCabinet.getDossierDeSuivi().getDetails());
            } else {
                System.out.println("Aucun dossier de suivi.");
                }
            }
                    
            	// Ajout d'un nouveau patient (Animal) avec le Scanner 
           
            Scanner scanner = new Scanner(System.in);
          
            System.out.println("Ajouter un nouveau patient");
            System.out.println(" --------------- ---------------");
            System.out.print("Nom de l'animal : ");
            String nom = scanner.nextLine();

            System.out.print("Nom du maître : ");
            String nomDuMaitre = scanner.nextLine();

            System.out.print("Espèce : ");
            String especeNom = scanner.nextLine();

            System.out.print("Durée de vie moyenne : ");
            int dureeDeVieMoyenne = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Race : ");
            String race = scanner.nextLine();

        
            IAnimal nouveauPatient = new AnimalImpl(nom, nomDuMaitre, race, especeNom, dureeDeVieMoyenne);
        
            cabinet.ajouterAnimal(nouveauPatient);
            System.out.println("Nouveau patient ajouté au cabinet avec succès : " + nouveauPatient.getNomComplet());
            
            cabinet.verifierSeuilAlerte();
            // Affichage de la liste des patients pour vérifier l'ajout
            System.out.println("Liste des patients après ajout:");
            System.out.println(" --------------- ---------------");
            for (IAnimal animalDansCabinet : cabinet.getListeAnimaux()) {
                System.out.println(animalDansCabinet.getNomComplet());
            }
            		
        } catch (RemoteException | NotBoundException e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
