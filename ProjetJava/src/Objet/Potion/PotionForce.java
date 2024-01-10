package Objet.Potion;

import Objet.Objet;

public class PotionForce extends Objet {
    private int bonusForce;

    public PotionForce(String nom, int quantiter, String description, String rareter, int bonusForce, int prix) {
        super(nom, quantiter, description, rareter, prix);
        this.bonusForce = bonusForce;
    }

    public int getBonusForce() {
        return bonusForce;
    }

    public void setBonusForce(int bonusForce) {
        this.bonusForce = bonusForce;
    }
}
