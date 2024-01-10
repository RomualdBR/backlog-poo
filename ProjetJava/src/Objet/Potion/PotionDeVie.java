package Objet.Potion;

import Objet.Objet;
import Objet.Interactuable;
import Personnage.Ennemie.Ennemi;

public class PotionDeVie extends Objet implements Interactuable {
    private int heal;

    public PotionDeVie(String nom, int quantiter, String description, String rareter, int heal, int prix) {
        super(nom, quantiter, description, rareter, prix);
        this.heal = heal;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }


    @Override
    public void makeDamage(Ennemi monEnnemi) {
        monEnnemi.setPointsDeVie(monEnnemi.getPointsDeVie()-10);
    }
}
