package com.example.Comparateur.model;

public class Hotel {
    private int id;
    private String nom;
    private String ville;
    private double prix;

    public Hotel(int id, String nom, String ville, double prix) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.prix = prix;
    }

    // Getters et setters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getVille() {
        return ville;
    }

    public double getPrix() {
        return prix;
    }
}