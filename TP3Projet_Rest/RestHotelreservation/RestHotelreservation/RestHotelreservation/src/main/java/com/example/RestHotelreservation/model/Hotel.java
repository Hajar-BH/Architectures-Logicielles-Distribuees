package com.example.RestHotelreservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String adresse;
    private int etoiles;
    private int nombreChambres;
    
    private Long version;
    public Hotel() {}
    public Hotel(long id, String nom, String adresse, int etoiles, int nombreChambres) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.etoiles = etoiles;
        this.nombreChambres = nombreChambres;
    }

    public Long getId() 
    	{ return id; }
    public void setId(long id) 
    	{ this.id = id; }
    
    public String getNom() 
    	{ return nom; }
    public void setNom(String nom) 
    	{ this.nom = nom; }

    public String getAdresse() 
    	{ return adresse; }
    public void setAdresse(String adresse) 
    	{ this.adresse = adresse; }
    
    public int getEtoiles() 
    	{ return etoiles; }
    public void setEtoiles(int etoiles) 
    	{ this.etoiles = etoiles; }
    
    public int getNombreDeLits() 
    	{ return nombreChambres; }
    public void setNombreChambres(int nombreChambres) 
    	{ this.nombreChambres = nombreChambres; }
    public Long getVersion() {
    	return version; 
    
    }
    public void setVersion(Long version) {
    	this.version = version;
    }
}