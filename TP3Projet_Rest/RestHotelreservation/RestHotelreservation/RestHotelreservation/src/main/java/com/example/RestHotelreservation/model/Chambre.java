package com.example.RestHotelreservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Version;

@Entity
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  
    private String typeChambre;  // (Simple, Double, Suite)
    private double prix;  
    private boolean disponible;  
    private int nbLits; 
    private int nbPersonnes;
    private String imageUrl;
    
    @Version
    private Long version;
    public Chambre() {}
    public Chambre(String typeChambre, double prix, boolean disponible, int nbLits, int nbPersonnes, String imageUrl) {
        this.typeChambre = typeChambre;
        this.prix = prix;
        this.disponible = disponible;
        this.nbLits = nbLits;
        this.nbPersonnes = nbPersonnes;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeChambre() {
        return typeChambre;
    }

    public void setTypeChambre(String typeChambre) {
        this.typeChambre = typeChambre;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getNbLits() {
        return nbLits;
    }

    public void setNbLits(int nbLits) {
        this.nbLits = nbLits;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }
    public Long getVersion() {
    	return version; 
    
    }
    public void setVersion(Long version) {
    	this.version = version;
    }
    public String getImageUrl() {
    	return imageUrl; 
    
    }
    public void setImageUrl(String imageUrl) {
    	this.imageUrl = imageUrl;
    }
    @Override
    public String toString() {
        return "Chambre{" +
                "id=" + id +
                ", typeChambre='" + typeChambre + '\'' +
                ", prix=" + prix +
                ", disponible=" + disponible +
                ", nbLits=" + nbLits +
                ", nbPersonnes=" + nbPersonnes +
                '}';
    }
}