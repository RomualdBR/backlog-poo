package Modele.Personnage.Classe;

import Modele.Personnage.Joueur;

public class Ninja extends Joueur {
    private String description;
    public Ninja(String nom, int pointsDeVie, int force, int armure, int xp, int chanceCrit, String description,int or) {
        super(nom, pointsDeVie, force, armure, xp, chanceCrit,or);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
