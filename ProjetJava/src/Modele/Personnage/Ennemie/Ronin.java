package Modele.Personnage.Ennemie;

public class Ronin extends Ennemi{
    private String description;

    public Ronin(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, description);
    }

    }
