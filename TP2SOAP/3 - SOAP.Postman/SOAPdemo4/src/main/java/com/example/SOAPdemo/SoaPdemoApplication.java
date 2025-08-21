package com.example.SOAPdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EnableWs
public class SoaPdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoaPdemoApplication.class, args);
	}

}
