package Modele.Personnage.Ennemie;

public class Hatamoto extends Ennemi{
    private String description;

    public Hatamoto(String nom, int pointsDeVie, int force, int armure, int chanceCrit, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, description);
    }

   }
