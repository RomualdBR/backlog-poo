package Modele.Personnage.Ennemie;

import Modele.Personnage.Personnage;

import java.io.Serializable;

public abstract class Ennemi extends Personnage implements Serializable {
    private String description;
    public Ennemi(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
