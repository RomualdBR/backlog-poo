package Objet.Potion;

import Objet.Objet;

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
    PotionArmure PotionArmure = new PotionArmure("Potion de bouclier",1, "Augmente l'armure pendant 3 tour de 15", "Commun",
            15, 15);
}
