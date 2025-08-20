package com.example.BaseDeDonnees.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BaseDeDonnees.model.Agence;

public interface AgenceRepository extends JpaRepository<Agence, Integer> {
}