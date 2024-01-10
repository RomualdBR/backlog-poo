package Objet.Arme;

public class Katana extends Arme {
    public Katana(String nom, int quantiter, String description, String rareter, int degat, int prix) {
        super(nom, quantiter, description, rareter, degat, prix);
    }
    Katana wakisashi = new Katana("Wakisashi",1,"Un sabre japonais similaire au katana mais de petite taille porté à la ceinture par les samourai.","Commun",10,0);
    Katana katana = new Katana("Katana",1,"Armes courbé ayant un seul tranchant, cette arme est la plus utilisé par les samourai.","Rare",20,10);
}
