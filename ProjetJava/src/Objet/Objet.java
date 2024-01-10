package Objet;

public class Objet {
    private String nom;
    private int quantiter;
    private String rareter;
    private String description;

     private int prix;

    public Objet(String nom, int quantiter, String description, String rareter, int prix) {
        this.nom = nom;
        this.quantiter = quantiter;
        this.description = description;
        this.rareter = rareter;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantiter() {
        return quantiter;
    }

    public void setQuantiter(int quantiter) {
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

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
