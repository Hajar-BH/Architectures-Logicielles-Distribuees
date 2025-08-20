package com.example.BaseDeDonnees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BaseDeDonnees.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}