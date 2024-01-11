package Modele.Personnage.Ennemie;

public class Bandit extends Ennemi {
    private String description;

    public Bandit(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, description);
    }


}
