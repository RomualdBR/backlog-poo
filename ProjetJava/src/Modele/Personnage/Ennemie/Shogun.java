package Modele.Personnage.Ennemie;

public class Shogun extends Ennemi{
    private String description;

    public Shogun(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, description);
    }

   }
