package com.example.demoSpringBoot;

public class Client {
	private String numCin;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
public Client() {}
public Client (String numCin, String nom, String prenom, String email, String telephone) {
	this.numCin = numCin;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.telephone = telephone;
}

	 public String getNumCin() {
		 return numCin;
	}
	 public void setNumCin(String numCin) {
		 this.numCin = numCin;
	}
	 
	 public String getNom() {
		return nom;
	}
	void setNom(String nom) {
		this.nom = nom;
 	}
 
	public String getPrenom() {
	    return prenom;
		}
	 void setPrenom(String prenom) {
	    this.prenom = prenom;
	 	}

	 public String getEmail() {
		 return email;
	}
	 public void setEmail(String email) {
		 this.email = email;
	}

	 public String getTelephone() {
		 return telephone;
	}
	 public void setTelephone(String telephone) {
		 this.telephone = telephone;
	}
}
