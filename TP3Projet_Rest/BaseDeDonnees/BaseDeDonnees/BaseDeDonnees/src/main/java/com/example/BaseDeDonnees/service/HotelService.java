package com.example.BaseDeDonnees.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BaseDeDonnees.model.Offre;
import com.example.BaseDeDonnees.repository.OffreRepository;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private OffreRepository offreRepository;

    public List<Offre> getOffres() {
        return (List<Offre>) offreRepository.findAll();
    }
}