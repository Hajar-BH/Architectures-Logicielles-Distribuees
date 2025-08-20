package com.example.RestHotelreservation.data;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.RestHotelreservation.model.Chambre;
import com.example.RestHotelreservation.model.Hotel;
import com.example.RestHotelreservation.repositories.ChambreRepository;
import com.example.RestHotelreservation.repositories.HotelRepository;

@Configuration
public class HotelData {
 
    private static final Logger logger = LoggerFactory.getLogger(HotelData.class);

    @Bean
    public CommandLineRunner initDatabase(HotelRepository hotelRepository, ChambreRepository chambreRepository) {
        return args -> {
            logger.info("Preloading database with hotels");
            hotelRepository.save(new Hotel(13579L, "Hotel Lux", "123 Rue de la Ville", 5, 2));
            hotelRepository.save(new Hotel(13555L, "Hotel Relax", "456 Avenue de Paris", 4, 3));
            logger.info("Preloading complete");
     
            logger.info("Preloading database with rooms");
            //(String typeChambre, double prix, boolean disponible, int nbLits, int nbPersonnes)
                chambreRepository.save(new Chambre("double", 500, true, 1, 1, "https://ibb.co/8sH2gDV"));
                chambreRepository.save(new Chambre("simple", 300, true, 1, 1, "https://ibb.co/gvvmzff"));
                chambreRepository.save(new Chambre("double", 300, false, 1, 2, "https://ibb.co/j4L0Tvf" ));
                chambreRepository.save(new Chambre("single", 100, true, 1, 1, "https://ibb.co/kcCcbDR")); 
                chambreRepository.save(new Chambre("double", 500, true, 2, 4, "https://ibb.co/747ny1W"));
                logger.info("Preloading database with rooms");
            };
        }
    
    }
