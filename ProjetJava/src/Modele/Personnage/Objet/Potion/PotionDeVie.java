package Modele.Personnage.Objet.Potion;

import Modele.Personnage.Objet.Objet;

public class PotionDeVie extends Objet{
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

}
