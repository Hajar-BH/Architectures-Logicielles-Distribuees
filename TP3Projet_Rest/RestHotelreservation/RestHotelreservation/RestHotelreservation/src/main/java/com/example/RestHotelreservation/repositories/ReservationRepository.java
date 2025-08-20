package com.example.RestHotelreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestHotelreservation.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}