package Personnage;

public class Joueur extends Personnage{
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

    Joueur joueur = new Joueur(".", 50, 10, 0, 0, 5, 10);
}
