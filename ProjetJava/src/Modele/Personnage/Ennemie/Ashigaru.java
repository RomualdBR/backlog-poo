package Modele.Personnage.Ennemie;
import interfaces.Interactuable;

import java.util.Collection;

public class Ashigaru extends Ennemi implements Interactuable {

    private String description;

    public Ashigaru(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, description);
    }


    @Override
    public void choixPotion() {

    }

    @Override
    public void coupCritique() {

    }

    @Override
    public void attaquer() {

    }

    @Override
    public void defendre() {

    }


    public void ouvrirInventaire() {

    }


    public void utiliserPotionDeVie() {

    }


    public void utiliserPotionArmure() {

    }


    public void utiliserPotionDeForce() {

    }

    @Override
    public void sleep3s() {

    }

    @Override
    public void ramasserLoot() {

    }

    @Override
    public void choisirClasse() {

    }

    @Override
    public void commencerCombatBandit() {

    }
}
