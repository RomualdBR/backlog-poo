package Modele.Personnage.Ennemie;
import interfaces.Interactuable;

public class Ashigaru extends Ennemi implements Interactuable {

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


    @Override
    public void choixPotion() {

    }

    @Override
    public void coupCritique() {

    }

    @Override
    public void attaquer() {

    }

    @Override
    public void defendre() {

    }

    @Override
    public void utiliserPotion() {

    }

    @Override
    public void ramasserLoot() {

    }

}
