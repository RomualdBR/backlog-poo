package Controler;

import Modele.Personnage.Classe.Ninja;
import Modele.Personnage.Classe.Samurai;
import Modele.Personnage.Classe.Sentinelle;
import Modele.Personnage.Ennemie.*;
import Modele.Personnage.Joueur;

import javax.naming.ldap.Control;
import java.util.ArrayList;
import java.util.Collections;
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
    public static ArrayList<Joueur> player= new ArrayList<Joueur>();

    public static void initPersonnages(){

        /*Joueur*/

        joueur = new Joueur(".", 50, 10, 0, 0, 5, 10, "", 50);

        /*Classes Joueur*/

        ninja = new Ninja("Ninja", 80, 25, 10, 25, 25,
                "Rigoureux et intrépide il n'a aucune pitier pour ses cibles.",10, 80);
        samurai = new Samurai("Samurai", 100, 15, 15, 15, 0,
                "Guerrier à fine lame, ayant pour principe l'honneur en combattant ses adversaire.", 10, 100);
        sentinelle = new Sentinelle("Sentinelle", 130, 15, 20, 5, 0,
                "Maître incontesté de la défense ils incarnent la quintessence de la résilience.", 20, 130);

        /*Personnages ennemies*/

        ashigaru = new Ashigaru("Gégé l'Ashigaru, spécial", 75, 12, 17, 5,
                "Soldat d'infanterie, souvent des paysans recruter en période de guerre.", 20);
        bandit = new Bandit("Pixelle le Bandit, au visage masqué car trop moche", 30, 5,0,0,
                "Homme masqué en voulant à votre peau", 10);
        empereur = new Empereur("L'empereur Stefan, l'ingénieux informaticien", 250, 50, 60, 15, 0,
                "L'empereur qui as commandité le meutre de votre mère, le responsable de toutes ces erreurs informatiques, l'ENNEMIE.");
        hatamoto = new Hatamoto("Tom le Hatamoto qui tricks", 145, 35, 25, 10, 55
                ,"Au service du shogun ce sombre guerrier skateur attend de défendre son seigneur fidélement.");
        roning = new Ronin("Ludwig, le sombre Ronin", 100, 25,15,8,35,
                "Sombre guerrier errant n'ayant aucun maître et ayant envie de croiser le fer.");
        shogun = new Shogun("Shogun Benilde, le gracieux", 170, 40,35,12, 70
                ,"Responsable des armées, dernier rempart de sa majesté");

    }
}
