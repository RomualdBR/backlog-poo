package Personnage;

public class Joueur extends Personnage{
    private int xp;

    public Joueur(String nom, int pointsDeVie, int force, int armure, int xp) {

        super(nom, pointsDeVie, force, armure);
        this.xp = xp;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
