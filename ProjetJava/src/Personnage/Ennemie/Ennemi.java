package Personnage.Ennemie;

import Personnage.Personnage;

public class Ennemi extends Personnage {
    private int orDonner;
    public Ennemi(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int orDonner) {

        super(nom, pointsDeVie, force, armure, chanceCrit);
        this.orDonner = orDonner;
    }

    public int getOrDonner() {
        return orDonner;
    }

    public void setOrDonner(int orDonner) {
        this.orDonner = orDonner;
    }
}
