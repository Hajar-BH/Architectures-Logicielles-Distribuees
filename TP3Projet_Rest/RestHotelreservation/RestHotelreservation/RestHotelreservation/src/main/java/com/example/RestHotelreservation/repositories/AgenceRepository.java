package com.example.RestHotelreservation.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestHotelreservation.model.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Long> {
}