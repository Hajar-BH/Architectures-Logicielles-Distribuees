package com.example.BaseDeDonnees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BaseDeDonnees.model.Offre;
import com.example.BaseDeDonnees.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	}
