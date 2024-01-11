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
        System.out.println("Choissisez votre classe entre ceux là \n" +
                        " 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() +" Pv - "+ samurai.getForce() + " Force - "+ samurai.getArmure() +" Armure - "+ samurai.getChanceCrit() + " Crit chance \n"+
                        " 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() +" Pv - "+ ninja.getForce() + " Force - "+ ninja.getArmure() +" Armure - "+ ninja.getChanceCrit() + " Crit chance \n"+
                        " 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() +" Pv - "+ sentinelle.getForce() + " Force - "+ sentinelle.getArmure() +" Armure - "+ sentinelle.getChanceCrit() + " Crit chance \n");
        Modele.Personnage.Joueur joueur=ControlerPersonnages.joueur;
        joueur.choisirClasse();
    }
}