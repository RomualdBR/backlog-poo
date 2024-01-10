package Personnage.Classe;

import Personnage.Joueur;

public class Sentinelle extends Joueur {
    private String description;

    public Sentinelle(String nom, int pointsDeVie, int force, int armure, int xp, int chanceCrit, String description, int or) {
        super(nom, pointsDeVie, force, armure, xp, chanceCrit, or);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
