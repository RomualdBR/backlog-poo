package Objet.Arme;

import Objet.Objet;

public class Kunai extends Arme {

    public Kunai(String nom, int quantiter, String description, String rareter, int prix, int degat) {
        super(nom, quantiter, description, rareter, prix, degat );
    }
    Kunai kunai = new Kunai("Kunai rouillé",1,"Petite dague discrète rouillé qui a été usé par le temps de la guerre.","Commun",0,10);

    Kunai ninjato = new Kunai("Ninjato",1,"Arme blanche de 50 cm utilisé par les ninjas pour assassiner leurs cibles.","Rare",10,20);
}

