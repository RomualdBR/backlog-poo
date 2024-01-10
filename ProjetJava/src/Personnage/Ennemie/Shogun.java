package Personnage.Ennemie;

public class Shogun extends Ennemi{
    private String description;

    public Shogun(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int orDonner, String description) {
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
