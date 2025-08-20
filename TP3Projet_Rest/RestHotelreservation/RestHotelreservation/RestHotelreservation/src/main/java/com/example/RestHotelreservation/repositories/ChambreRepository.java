package com.example.RestHotelreservation.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestHotelreservation.model.Chambre;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
	List<Chambre> findByTypeChambreAndDisponible(String typeChambre, boolean disponible);
	
}