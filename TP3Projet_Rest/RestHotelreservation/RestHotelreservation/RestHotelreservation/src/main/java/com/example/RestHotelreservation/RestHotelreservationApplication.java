package com.example.RestHotelreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = {
		"com.example.RestHotelreservation.repositories",
	    "com.example.RestHotelreservation.controller", 
        "com.example.RestHotelreservation.service",  
        "com.example.RestHotelreservation.model",
        "com.example.RestHotelreservation.data",
        "com.example.RestHotelreservation.config"
        })

public class RestHotelreservationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RestHotelreservationApplication.class, args);
	}

}
