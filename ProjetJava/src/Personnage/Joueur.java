package Personnage;

import Objet.Arme.Arme;
import Objet.Interactuable;
import Personnage.Ennemie.Ennemi;

public class Joueur extends Personnage implements Interactuable {
    private int xp;
    private int or;

    public Joueur(String nom, int pointsDeVie, int force, int armure, int xp, int chanceCrit, int or) {

        super(nom, pointsDeVie, force, armure, chanceCrit);
        this.xp = xp;
        this.or = or;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getOr() {
        return or;
    }

    public void setOr(int or) {
        this.or = or;
    }

    void ramasserObjet(){

    }

    @Override
    public void makeDamage(Ennemi monEnnemi) {
            monEnnemi.setPointsDeVie(monEnnemi.getPointsDeVie()-2);
            monEnnemi.setArmure(monEnnemi.getArmure()-12);

    }
}
