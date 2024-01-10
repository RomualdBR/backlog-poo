package Personnage.Ennemie;

public class Ashigaru extends Ennemi{

    private String description;

    public Ashigaru(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description, int orDonner) {
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
