package Modele.Personnage;

public abstract class Personnage {

    private String nom;

    private int pointsDeVie;

    private int force;
    private int armure;
    private int chanceCrit;

    public Personnage(String nom, int pointsDeVie, int force, int armure, int chanceCrit) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
        this.armure = armure;
        this.chanceCrit = chanceCrit;
    }

    public int getArmure() {
        return armure;
    }

    public void setArmure(int armure) {
        this.armure = armure;
    }

    public int getChanceCrit() {
        return chanceCrit;
    }

    public void setChanceCrit(int chanceCrit) {
        this.chanceCrit = chanceCrit;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
