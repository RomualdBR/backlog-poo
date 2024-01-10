package Objet;

public class Objet {
    private String nom;

    private String quantiter;

private String rareter;
    private String description;

    public Objet(String nom, String quantiter, String description, String rareter) {
        this.nom = nom;
        this.quantiter = quantiter;
        this.description = description;
        this.rareter = rareter;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getQuantiter() {
        return quantiter;
    }

    public void setQuantiter(String quantiter) {
        this.quantiter = quantiter;
    }

    public String getRareter() {
        return rareter;
    }

    public void setRareter(String rareter) {
        this.rareter = rareter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
