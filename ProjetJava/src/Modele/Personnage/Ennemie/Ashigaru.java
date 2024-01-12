package Modele.Personnage.Ennemie;
import interfaces.Interactuable;

import java.io.Serializable;
import java.util.Collection;

public class Ashigaru extends Ennemi {

    private String description;

    public Ashigaru(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, description);
    }


}
