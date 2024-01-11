package Modele.Personnage.Classe;

import Modele.Personnage.Joueur;

public class Sentinelle extends Joueur {
    private String description;

    public Sentinelle(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int xp, String description,int or) {
        super(nom, pointsDeVie, force, armure, chanceCrit, xp, or);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
