package Objet.Potion;

import Objet.Objet;

public class PotionDeVie extends Objet {
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
    PotionDeVie PotionDeVieCommun = new PotionDeVie("Potion de vie", 1, "Régénère la vie et rend 40 Pv", "Commun",
            40, 20);
}
