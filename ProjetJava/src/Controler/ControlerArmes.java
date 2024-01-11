package Controler;

import Modele.Personnage.Objet.Arme.Katana;
import Modele.Personnage.Objet.Arme.Kunai;
import Modele.Personnage.Objet.Arme.LongSabre;
import Modele.Personnage.Objet.Potion.PotionArmure;
import Modele.Personnage.Objet.Potion.PotionDeVie;
import Modele.Personnage.Objet.Potion.PotionForce;

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

    public static void initArmes(){
        /*Potions*/

        potionarmure = new PotionArmure("Potion de bouclier",1, "Augmente l'armure pendant 3 tour de 15", "Commun", 15, 15);
        potionDeVieCommun = new PotionDeVie("Potion de vie", 1, "Régénère la vie et rend 40 Pv", "Commun", 40, 20);
        potiondeforce = new PotionForce("Potion de force",1,"donne des dégats supplémentaire pendant 2 tours","Commun",10,10);

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


}
