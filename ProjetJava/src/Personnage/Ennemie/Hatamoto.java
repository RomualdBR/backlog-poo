package Personnage.Ennemie;

public class Hatamoto extends Ennemi{
    private String description;

    public Hatamoto(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int orDonner, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, orDonner);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    Hatamoto hatamoto = new Hatamoto("Tom le Hatamoto qui tricks", 145, 35, 25, 10, 55
    ,"Au service du shogun ce sombre guerrier skateur attend de défendre son seigneur fidélement.");
}
