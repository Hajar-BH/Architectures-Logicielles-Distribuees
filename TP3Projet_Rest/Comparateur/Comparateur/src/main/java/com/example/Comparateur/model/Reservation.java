package com.example.Comparateur.model;

public class Reservation {
    private Offre offre;
    private String client;

    public Reservation(Offre offre, String client) {
        this.offre = offre;
        this.client = client;
    }

    // Getters
    public Offre getOffre() {
        return offre;
    }

    public String getClient() {
        return client;
    }
}