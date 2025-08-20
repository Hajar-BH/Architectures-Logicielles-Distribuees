package animal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DossierDeSuiviImpl extends UnicastRemoteObject implements IDossierDeSuivi {
    
    private static final long serialVersionUID = 1L;
    private String details; 

    public DossierDeSuiviImpl(String details) throws RemoteException {
        this.details = details;
    } 
    
    // Getters 
    public String getDetails() throws RemoteException {
        return details; 
    }
    // Setters 
    public void setDetails(String details) throws RemoteException {
        this.details = details;
}
    // Methode toString pour afficher les details du dossier de suivi
    public String toString() {
    	return "Dossier de suivi : " + details;
    }
}