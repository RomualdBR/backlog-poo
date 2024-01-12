package Modele.Personnage.Objet.Arme;

import Modele.Personnage.Objet.Objet;

import java.io.Serializable;

public abstract class Arme extends Objet implements Serializable {
    private int degat;

    public Arme(String nom, int quantiter, String description, String rareter, int degat, int prix) {
        super(nom, quantiter, description, rareter, prix);
        this.degat = degat;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }
}
