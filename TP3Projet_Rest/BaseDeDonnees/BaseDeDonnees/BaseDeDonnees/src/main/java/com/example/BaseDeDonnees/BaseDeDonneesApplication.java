package com.example.BaseDeDonnees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.BaseDeDonnees",

"com.example.BaseDeDonnees.controller", 
"com.example.BaseDeDonnees.service",
"com.example.BaseDeDonnees.repository",
"com.example.BaseDeDonnees.model"}
)
public class BaseDeDonneesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaseDeDonneesApplication.class, args);
	}

}
