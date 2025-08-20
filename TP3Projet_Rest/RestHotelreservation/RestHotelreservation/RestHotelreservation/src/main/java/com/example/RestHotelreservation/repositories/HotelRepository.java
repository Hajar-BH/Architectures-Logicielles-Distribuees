package com.example.RestHotelreservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestHotelreservation.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}