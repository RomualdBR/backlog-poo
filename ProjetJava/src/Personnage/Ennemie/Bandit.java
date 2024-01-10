package Personnage.Ennemie;

public class Bandit extends Ennemi {
    private String description;

    public Bandit(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description, int orDonner) {
        super(nom, pointsDeVie, force, armure, chanceCrit, orDonner);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    Bandit bandit = new Bandit("Pixelle le Bandit, au visage masqué car trop moche", 30, 5,0,0,
            "Homme masqué en voulant à votre peau", 10);
}
