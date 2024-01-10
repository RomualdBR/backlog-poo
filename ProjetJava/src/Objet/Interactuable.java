package Objet;

import Personnage.Ennemie.Ennemi;

public interface Interactuable {
    int degat = 5;

    /**
     * cette méthode doit être utilisé pour infligé des dégats.
     */
    void makeDamage(Ennemi monEnnemi);
}
