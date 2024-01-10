package Personnage.Classe;


import Personnage.Joueur;

public class Samurai extends Joueur {
    private String description;
    public Samurai(String nom, int pointsDeVie, int force, int armure, int xp, int chanceCrit, String description, int or) {
        super(nom, pointsDeVie, force, armure, xp, chanceCrit, or);
    }
    Samurai classSamurai = new Samurai("Samurai", 100, 15, 15, 0, 15,
            "Guerrier à fine lame, ayant pour principe l'honneur en combattant ses adversaire.", 10);
}
