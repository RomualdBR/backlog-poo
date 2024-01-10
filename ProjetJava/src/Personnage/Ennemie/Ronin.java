package Personnage.Ennemie;

public class Ronin extends Ennemi{
    private String description;

    public Ronin(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int orDonner, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, orDonner);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    Ronin roning = new Ronin("Ludwig, le sombre Ronin", 100, 25,15,8,35,
            "Sombre guerrier errant n'ayant aucun maître et ayant envie de croiser le fer.");
}
