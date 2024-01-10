package Personnage;

public class Personnage {

    private String nom;

    private int pointsDeVie;

    private int force;
    private int armure;

    public Personnage(String nom, int pointsDeVie, int force, int armure) {
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.force = force;
        this.armure = armure;
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

    void attaquer(){

    }
    void defendre(){

    }
}
