import Controler.ControlerArmes;
import Controler.ControlerPersonnages;
import Modele.Personnage.*;
import interfaces.Interactuable;
import java.util.Scanner;

import static Controler.ControlerArmes.*;
import static Controler.ControlerPersonnages.*;
public class Main {
    public static void main(String[] args) {

        ControlerArmes.initArmes();
        ControlerPersonnages.initPersonnages();
        Modele.Personnage.Joueur joueur=ControlerPersonnages.joueur;
        System.out.println("Vous avez le choix entre ces classes :  \n" +
                " Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() +" Pv - "+ samurai.getForce() + " Force - "+ samurai.getArmure() +" Armure - "+ samurai.getChanceCrit() + " Crit chance \n"+
                " Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() +" Pv - "+ ninja.getForce() + " Force - "+ ninja.getArmure() +" Armure - "+ ninja.getChanceCrit() + " Crit chance \n"+
                " Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() +" Pv - "+ sentinelle.getForce() + " Force - "+ sentinelle.getArmure() +" Armure - "+ sentinelle.getChanceCrit() + " Crit chance \n");
        joueur.choisirClasse();
        Joueur p = player.getFirst();
        System.out.println(p.getNom());
    }
}