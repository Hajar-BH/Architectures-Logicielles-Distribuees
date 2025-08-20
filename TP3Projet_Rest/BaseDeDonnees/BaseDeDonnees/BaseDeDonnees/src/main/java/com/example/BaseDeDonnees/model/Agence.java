package com.example.BaseDeDonnees.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom", nullable = false, unique = true)
    private String nom;
    
    public Agence() {}

    public Agence(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

}