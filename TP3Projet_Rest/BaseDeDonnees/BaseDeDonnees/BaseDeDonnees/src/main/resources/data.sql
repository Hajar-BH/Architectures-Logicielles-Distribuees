-- Insertion dans AGENCE
INSERT INTO AGENCE (id, nom) VALUES (1, 'Agence GoVoyage');
INSERT INTO AGENCE (id, nom) VALUES (2, 'Agence PromoVacances');
INSERT INTO AGENCE (id, nom) VALUES (3, 'Agence TripInTouch');

-- Insertion dans HOTEL
INSERT INTO HOTEL (id, nom, ville, prix) VALUES (1, 'Hôtel Royal Luxe', 'Paris', 100.0);
INSERT INTO HOTEL (id, nom, ville, prix) VALUES (2, 'Grand Hôtel', 'Paris', 150.0);
INSERT INTO HOTEL (id, nom, ville, prix) VALUES (3, 'Hôtel Relax', 'Montpellier', 120.0);
INSERT INTO HOTEL (id, nom, ville, prix) VALUES (4, 'Hôtel Luxery', 'Montpellier', 80.0);
INSERT INTO HOTEL (id, nom, ville, prix) VALUES (5, 'Hôtel Blanca', 'Casablanca', 90.0);

-- Insertion dans OFFRE
INSERT INTO OFFRE (id, prix_propose, hotel_id, agence_id) VALUES (1, 90.0, 1, 1);
INSERT INTO OFFRE (id, prix_propose, hotel_id, agence_id) VALUES (2, 140.0, 2, 2);
INSERT INTO OFFRE (id, prix_propose, hotel_id, agence_id) VALUES (3, 115.0, 3, 3);
INSERT INTO OFFRE (id, prix_propose, hotel_id, agence_id) VALUES (4, 75.0, 4, 3);
INSERT INTO OFFRE (id, prix_propose, hotel_id, agence_id) VALUES (5, 90.0, 5, 1);