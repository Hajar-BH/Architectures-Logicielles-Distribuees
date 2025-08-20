package animal;
import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface pour l'objet Animal distribué  
public interface IAnimal extends Remote {
	
		String getNom () throws RemoteException; 
		String getNomDuMaitre() throws RemoteException;
		String getRace () throws RemoteException;
		//String getEspece() throws RemoteException;
		Espece getEspece() throws RemoteException; 
		String getNomComplet() throws RemoteException;
		IDossierDeSuivi getDossierDeSuivi() throws RemoteException; 
	void setDossierDeSuivi(IDossierDeSuivi dossier) throws RemoteException; 
	void afficherNomComplet() throws RemoteException; 
}

