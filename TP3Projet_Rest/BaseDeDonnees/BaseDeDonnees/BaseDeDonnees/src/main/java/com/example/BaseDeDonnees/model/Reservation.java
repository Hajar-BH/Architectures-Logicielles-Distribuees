package com.example.BaseDeDonnees.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Offre offre;
    private String client;

    
    public Reservation() {}
    public Reservation(Offre offre, String client) {
        this.offre = offre;
        this.client = client;
    }


    public Offre getOffre() {
        return offre;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}