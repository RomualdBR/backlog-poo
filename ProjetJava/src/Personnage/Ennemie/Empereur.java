package Personnage.Ennemie;

public class Empereur extends Ennemi{
    private String description;

    public Empereur(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int orDonner, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, orDonner);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    }
