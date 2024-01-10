package Objet;

public class Arme extends Objet {
    private int degat;

    public Arme(String nom, String quantiter, String description, String rareter, int degat) {
        super(nom, quantiter, description, rareter);
        this.degat = degat;
    }


}
