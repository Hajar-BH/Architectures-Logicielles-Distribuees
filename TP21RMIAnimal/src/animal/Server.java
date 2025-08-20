package animal;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public Server() {}

    public static void main(String args[]) {
        try {
        	
       // --------------------------- Version avec Animal distribué ---------------------------
        	
        	//IAnimal animal = new AnimalImpl ("Mimmy", "John Dupont", "Siamois", "Chat", 15);
        	//IDossierDeSuivi dossier = new DossierDeSuiviImpl("Vaccination à jour.");
        	//Espece espece = new Espece("Chat", 15);	
        	//Registry registry = LocateRegistry.createRegistry(1099);
             //if (registry == null) {
             	//System.err.println("Registry not found");
             //} else {
             //registry.bind("Animal", animal);
             //System.err.println("Server is ready");
             //}
         //} catch (Exception e) {
             //System.err.println("Server exception: " + e.toString());
             //e.printStackTrace();
         //}
    // }
//}
    // --------------------------- Derniere version avec CabinetVeterinaire distribué ---------------------------
        	
       
            ICabinetVeterinaire cabinet = new CabinetVeterinaireImpl();
            
       // Ajout de quelques animaux dans le cabinet 
            cabinet.ajouterAnimal(new AnimalImpl("Mimmy", "John Dupont", "Siamois", "Chat", 15));
            cabinet.ajouterAnimal(new AnimalImpl("Alex", "Martin Doe", "Golden Retriever", "Chien", 13));

       
            Registry registry = LocateRegistry.createRegistry(1099);
            if (registry == null) {
            	System.err.println("Registry not found");
            } else {
            registry.bind("CabinetVeterinaire", cabinet);
            System.err.println("Server is ready");
            }
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
    }
