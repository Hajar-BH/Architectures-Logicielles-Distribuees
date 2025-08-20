package com.example.BaseDeDonnees.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BaseDeDonnees.model.Agence;
import com.example.BaseDeDonnees.model.Hotel;
import com.example.BaseDeDonnees.model.Offre;

@Repository
public interface OffreRepository extends  JpaRepository<Offre, Integer> {
	List<Offre> findByHotelVille(String ville);
	List<Offre> findByPrixProposeLessThanEqual(Double prix);
	List<Offre> findByHotelVilleAndPrixProposeLessThanEqual(String ville, Double prix);
}