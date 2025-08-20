package animal;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface IDossierDeSuivi extends Remote {
	 // Méthode pour obtenir les détails du dossier sous forme de chaîne de caractères
    String getDetails() throws RemoteException; 
    void setDetails(String details) throws RemoteException; 
}