package com.example.BaseDeDonnees.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    private Hotel hotel;
    @ManyToOne
    private Agence agence;
    
    private double prixPropose;
    
    public Offre() {}
    public Offre(Hotel hotel, Agence agence, double prixPropose) {
        this.hotel = hotel;
        this.agence = agence;
        this.prixPropose = prixPropose;
    }
    
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public double getPrixPropose() {
        return prixPropose;
    }

    public void setPrixPropose(double prixPropose) {
        this.prixPropose = prixPropose;
    }
}