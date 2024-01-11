package interfaces;

import Modele.Personnage.Ennemie.Ennemi;

public interface Interactuable {
    void choixPotion();
    void coupCritique();
    void attaquer();
    void defendre();
    void ouvrirInventaire();
    void utiliserPotionDeVie();
    void utiliserPotionArmure();
    void utiliserPotionDeForce();
    void ramasserLoot();
    void choisirClasse();


    void critMaybe();
    void bandiAttack();

    void menuCombat();
}