package Personnage.Classe;

import Personnage.Joueur;

public class Sentinelle extends Joueur {
    private String description;

    public Sentinelle(String nom, int pointsDeVie, int force, int armure, int xp, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, xp, chanceCrit);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    Sentinelle sentinelle = new Sentinelle("Sentinelle", 130, 15, 20, 0, 5,
            "Maître incontesté de la défense ils incarnent la quintessence de la résilience.");
}
