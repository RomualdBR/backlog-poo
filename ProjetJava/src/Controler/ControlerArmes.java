package Controler;

import Modele.Personnage.Joueur;
import Modele.Personnage.Objet.Arme.Katana;
import Modele.Personnage.Objet.Arme.*;
import Modele.Personnage.Objet.Arme.LongSabre;
import Modele.Personnage.Objet.Potion.PotionArmure;
import Modele.Personnage.Objet.Potion.PotionDeVie;
import Modele.Personnage.Objet.Potion.PotionForce;
import java.util.ArrayList;
import java.util.Random;

public class ControlerArmes {

    public static PotionArmure potionarmure;
    public static PotionDeVie potionDeVieCommun;
    public static PotionForce potiondeforce;
    public static Katana wakisashi;
    public static Katana katana;
    public static Kunai kunai;
    public static Kunai ninjato;
    public static LongSabre nodachi;
    public static LongSabre longsabre;
    private static ArrayList<Arme> listeArmes;
    public static void initArmes(){
        /*Potions*/


        potionarmure = new PotionArmure("Potion de bouclier",0, "Augmente l'armure de 5 de façon permanente", "Rare", 5, 30);
        potionDeVieCommun = new PotionDeVie("Potion de vie", 1, "Régénère la vie et rend 40 Pv sans pouvoir exceder les points de vie max", "Commun", 40, 20);
        potiondeforce = new PotionForce("Potion de force",0,"donne 5 de forces pour toujours","Rare",5,30);

        /*Armes*/

        /*Classe Samourai*/

        wakisashi = new Katana("Wakisashi",1,"Un sabre japonais similaire au katana mais de petite taille porté à la ceinture par les samourai.","Commun",10,0);
        katana = new Katana("Katana",1,"Armes courbé ayant un seul tranchant, cette arme est la plus utilisé par les samourai.","Rare",20,10);

        /*Classe Ninja*/

        kunai = new Kunai("Kunai rouillé",1,"Petite dague discrète rouillé qui a été usé par le temps de la guerre.","Commun",10,0);
        ninjato = new Kunai("Ninjato",1,"Arme blanche de 50 cm utilisé par les ninjas pour assassiner leurs cibles.","Rare",20,10);

        /*Classe Sentinelle*/

        nodachi = new LongSabre("Nodachi", 1,"Long sabre japonais que l'on manipule à 2 mains","Rare",20, 20 );
        longsabre = new LongSabre("Sabre rouillé", 1,"Sabre qui a déjà tranché et rouillé par le temps ", "Commun",10, 0);
    }
    public static void initialiserListeArmes() {
        listeArmes = new ArrayList<>();
        listeArmes.add(new Katana("Wakisashi", 1, "Un sabre japonais similaire au katana mais de petite taille porté à la ceinture par les samourai.", "Commun", 10, 0));
        listeArmes.add(new Katana("Katana", 1, "Armes courbé ayant un seul tranchant, cette arme est la plus utilisé par les samourai.", "Rare", 20, 10));
        listeArmes.add(new Kunai("Kunai rouillé", 1, "Petite dague discrète rouillé qui a été usé par le temps de la guerre.", "Commun", 10, 0));
        listeArmes.add(new Kunai("Ninjato", 1, "Arme blanche de 50 cm utilisé par les ninjas pour assassiner leurs cibles.", "Rare", 20, 10));
        listeArmes.add(new LongSabre("Nodachi", 1, "Long sabre japonais que l'on manipule à 2 mains", "Rare", 20, 20));
        listeArmes.add(new LongSabre("Sabre rouillé", 1, "Sabre qui a déjà tranché et rouillé par le temps", "Commun", 10, 0));
    }
    public static Arme choisirArmeAleatoire() {

        // Vérifiez que la liste n'est pas vide
        if (listeArmes.isEmpty()) {
            System.out.println("La liste d'armes est vide.");
            return null;
        }

        // Générez un indice aléatoire
        Random random = new Random();
        int indiceAleatoire = random.nextInt(listeArmes.size());

        // Récupérez l'arme correspondant à l'indice aléatoire
        Arme armeRandom = listeArmes.get(indiceAleatoire);

        // Retournez l'arme choisie
        return armeRandom;
    }


}
