package Personnage.Ennemie;

public class Empereur extends Ennemi{
    private String description;

    public Empereur(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int orDonner, String description) {
        super(nom, pointsDeVie, force, armure, chanceCrit, orDonner);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    Empereur empereur = new Empereur("L'empereur Stefan, l'ingénieux informaticien", 250, 50, 60, 15, 0,
            "L'empereur qui as commandité le meutre de votre mère, le responsable de toutes ces erreurs informatiques, l'ENNEMIE.");
}
