package com.example.RestHotelreservation.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Agence {
    @Id 
    private String identifiantAgence;
    private String nomAgence;
    private String motDePasse;

    // Getters et Setters
    public String getIdentifiantAgence() { return identifiantAgence; }
    public void setIdentifiantAgence(String identifiantAgence) { this.identifiantAgence = identifiantAgence; }
    
    public String getNomAgence() { return nomAgence; }
    public void setNomAgence(String nomAgence) { this.nomAgence = nomAgence; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }
}