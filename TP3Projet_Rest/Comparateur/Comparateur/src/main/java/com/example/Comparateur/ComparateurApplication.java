package com.example.Comparateur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {
"com.example.Comparateur.controller", 
"com.example.Comparateur.service",  
"com.example.Comparateur.model"}
)

public class ComparateurApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComparateurApplication.class, args);
	}

}
 