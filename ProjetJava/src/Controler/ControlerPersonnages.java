package Controler;

import Modele.Personnage.Classe.Ninja;
import Modele.Personnage.Classe.Samurai;
import Modele.Personnage.Classe.Sentinelle;
import Modele.Personnage.Ennemie.*;
import Modele.Personnage.Joueur;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ControlerPersonnages {

    public static Joueur joueur;
    public static Ninja ninja;
    public static Samurai samurai;
    public static Sentinelle sentinelle;
    public static Ashigaru ashigaru;
    public static Bandit bandit;
    public static Empereur empereur;
    public static Hatamoto hatamoto;
    public static Ronin roning;
    public static Shogun shogun;
    public static Joueur playyy;
    public static ArrayList<Ennemi> ennemy= new ArrayList<Ennemi>();


    public static void initPersonnages(){
        /*liste enemy*/
        ennemy.add(bandit);ennemy.add(ashigaru);ennemy.add(empereur);ennemy.add(roning);ennemy.add(shogun);ennemy.add(hatamoto);

        /*Joueur*/

        joueur = new Joueur(".", 50, 10, 0, 0, 5, 10, "", 50);

        /*Classes Joueur*/

        ninja = new Ninja("Ninja", 80, 25, 10, 3, 25,
                "Rigoureux et intrépide il n'a aucune pitier pour ses cibles.",10, 80);
        samurai = new Samurai("Samurai", 100, 15, 15, 7, 0,
                "Guerrier à fine lame, ayant pour principe l'honneur en combattant ses adversaire.", 10, 100);
        sentinelle = new Sentinelle("Sentinelle", 130, 15, 20, 20, 0,
                "Maître incontesté de la défense ils incarnent la quintessence de la résilience.", 20, 130);

        /*Personnages ennemies*/

        ashigaru = new Ashigaru("Gégé l'Ashigaru, spécial", 75, 12, 17, 5,
                "Soldat d'infanterie, souvent des paysans recruter en période de guerre." );
        bandit = new Bandit("Pixelle le Bandit, au visage masqué car trop moche", 30, 5,0,1110,
                "Homme masqué en voulant à votre peau");
        empereur = new Empereur("L'empereur Stefan, l'ingénieux informaticien", 250, 50, 60, 10,
                "L'empereur qui as commandité le meutre de votre mère, le responsable de toutes ces erreurs informatiques, l'ENNEMIE.");
        hatamoto = new Hatamoto("Tom le Hatamoto qui tricks", 145, 35, 25, 100
                ,"Au service du shogun ce sombre guerrier skateur attend de défendre son seigneur fidélement.");
        roning = new Ronin("Ludwig, le sombre Ronin", 100, 25,15,80,
                "Sombre guerrier errant n'ayant aucun maître et ayant envie de croiser le fer.");
        shogun = new Shogun("Shogun Benilde, le gracieux", 170, 40,35,12
                ,"Responsable des armées, dernier rempart de sa majesté");

    }
    public static void choisirClasse() {

        initPersonnages();
        System.out.println("Vous avez le choix entre ces classes :  \n" +
                " Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() + " Pv - " + samurai.getForce() + " Force - " + samurai.getArmure() + " Armure - " + samurai.getChanceCrit() + " Crit chance \n" +
                " Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() + " Pv - " + ninja.getForce() + " Force - " + ninja.getArmure() + " Armure - " + ninja.getChanceCrit() + " Crit chance \n" +
                " Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() + " Pv - " + sentinelle.getForce() + " Force - " + sentinelle.getArmure() + " Armure - " + sentinelle.getChanceCrit() + " Crit chance \n");

        System.out.println("Choisissez votre classe : ");

        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 1) {
                playyy = samurai;
            }
            if (a == 2) {
                playyy = ninja;
            }
            if (a == 3) {
                playyy = sentinelle;
            } else if (a > 3 || a < 1) {
                System.out.println("un effort messieur entre 1 et 3 quand même");
                System.out.println(
                        " Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() + " Pv - " + samurai.getForce() + " Force - " + samurai.getArmure() + " Armure - " + samurai.getChanceCrit() + " Crit chance \n" +
                                " Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() + " Pv - " + ninja.getForce() + " Force - " + ninja.getArmure() + " Armure - " + ninja.getChanceCrit() + " Crit chance \n" +
                                " Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() + " Pv - " + sentinelle.getForce() + " Force - " + sentinelle.getArmure() + " Armure - " + sentinelle.getChanceCrit() + " Crit chance \n");

                choisirClasse();
            }

        } catch (Exception exception) {
            System.out.println("Un chiffre please mister");
            System.out.println(
                    "Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() + " Pv - " + samurai.getForce() + " Force - " + samurai.getArmure() + " Armure - " + samurai.getChanceCrit() + " Crit chance \n" +
                            "Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() + " Pv - " + ninja.getForce() + " Force - " + ninja.getArmure() + " Armure - " + ninja.getChanceCrit() + " Crit chance \n" +
                            "Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() + " Pv - " + sentinelle.getForce() + " Force - " + sentinelle.getArmure() + " Armure - " + sentinelle.getChanceCrit() + " Crit chance \n");

            choisirClasse();
        }


    }
}
