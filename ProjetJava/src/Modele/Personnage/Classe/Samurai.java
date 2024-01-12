package Modele.Personnage.Classe;


import Modele.Personnage.Joueur;

public class Samurai extends Joueur {
    private String description;
    public Samurai(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int level, String description,int or, int vieMax) {
        super(nom, pointsDeVie, force, armure, chanceCrit, level, or, description, vieMax);
    }


}
