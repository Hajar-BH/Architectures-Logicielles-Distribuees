package com.example.demoSpringBoot;

import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demoSpringBoot.Chambre;
import com.example.demoSpringBoot.Client;
import com.example.demoSpringBoot.Hotel;
import com.example.demoSpringBoot.Reservation;

@SpringBootApplication
public class DemoSoapApplication {

	public static void main(String[] args) throws ParseException {
		SpringApplication.run(DemoSoapApplication.class, args);
		Hotel hotel = new Hotel("Hotel du Soleil", "123 Rue du Paradis, 34090 Montpellier, France", 5, 200);
        System.out.println("Bienvenue dans notre hôtel, une experience unique vous attend.");
        System.out.println("-------------------------------------------------------------");
        System.out.println(hotel);
    
        Chambre chambreSimple = new Chambre(hotel, "Simple", 10, 120.0, 25.0, 1, 2);
        Chambre chambreDouble = new Chambre(hotel, "Double", 7, 150.0, 37.0, 2, 1);
        Chambre suite = new Chambre(hotel,  "Suite", 5, 450.0, 50.0, 3, 1);
        Chambre dortoir = new Chambre(hotel,"Dortoir", 9, 90.0, 20.0, 2, 3);
        hotel.ajoutChambre(chambreSimple);
        hotel.ajoutChambre(chambreDouble);
        hotel.ajoutChambre(suite);
        hotel.ajoutChambre(dortoir);
        
        double prixMax = 170.0;
        int nbPersonnes = 2;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dateArrivee = dateFormat.parse ("25/12/2024");
        Date dateDepart = dateFormat.parse("05/01/2024");
         
        List<Chambre> chambresDisponibles = hotel.rechercheDisponibilites(dateArrivee, dateDepart, prixMax, nbPersonnes);
         if (chambresDisponibles.isEmpty()) {
            System.out.println("Aucune chambre n'est disponible pour vos critères.");
            }else{
            System.out.println("Voici les chambres disponibles dans l'hôtel " + hotel.getNom() + " :");
            for (int i = 0; i < chambresDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + chambresDisponibles.get(i).toString());
               }  
             }   
                
                Scanner scanner = new Scanner(System.in);
                System.out.println("Veuillez entrer le numéro correspondant à votre choix :");
                int choix = scanner.nextInt();
                if (choix > 0 && choix <= chambresDisponibles.size()) {
                    Chambre chambreSelectionnee = chambresDisponibles.get(choix - 1);
                    System.out.println("Vous avez choisi la chambre : " + chambreSelectionnee.getTypeChambre());
                    System.out.println("Veuillez saisir vos coordonnées bancaires :"); 
                    scanner.nextLine();
                    String coordonneesBancaires = scanner.nextLine();
                    
                    Client client = new Client("A123456789", "Hajar", "Boumezgane", "boumezganehajar@gmail.com", "07 53 55 25 15");
                    Reservation reservation = new Reservation();
                    boolean r = reservation.effectueReservation(client, chambreSelectionnee, dateArrivee, dateDepart, coordonneesBancaires);
                    if (r) {
                        int reservationNum = 19631970;  
                        System.out.println("Réservation confirmée avec le numéro : " + reservationNum + " pour " 
                        		+ client.getNom() + " " + client.getPrenom() + " à l'hôtel " + hotel.getNom() + 
                        		" du " + dateFormat.format(dateArrivee) + " au " + dateFormat.format(dateDepart) + ".");
                    } else {
                        System.out.println("Réservation échouée. Les coordonnées bancaires saisies sont incorrectes");
                    }
                } else {
                    System.out.println("La chambre est déjà réservée. Veuillez essayer avec d'autres dates.");
                }
            }
    	}
