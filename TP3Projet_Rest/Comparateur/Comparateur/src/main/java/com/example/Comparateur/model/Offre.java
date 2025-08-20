package com.example.Comparateur.model;

public class Offre {
    private Hotel hotel;
    private Agence agence;
    private double prixPropose;

    public Offre(Hotel hotel, Agence agence, double prixPropose) {
        this.hotel = hotel;
        this.agence = agence;
        this.prixPropose = prixPropose;
    }

    // Getters et setters
    public Hotel getHotel() {
        return hotel;
    }

    public Agence getAgence() {
        return agence;
    }

    public double getPrixPropose() {
        return prixPropose;
    }
}