package Modele.Personnage.Objet.Potion;

import Modele.Personnage.Objet.Objet;

public class PotionArmure extends Objet {

    private int bonusArmure;
    public PotionArmure(String nom, int quantiter, String description, String rareter, int bonusArmure, int prix) {
        super(nom, quantiter, description, rareter, prix);
        this.bonusArmure = bonusArmure;
    }

    public int getBonusArmure() {
        return bonusArmure;
    }

    public void setBonusArmure(int bonusArmure) {
        this.bonusArmure = bonusArmure;
    }

}
