import Controler.ControlerArmes;
import Controler.ControlerPersonnages;
import Modele.Personnage.Ennemie.Bandit;
import Modele.Personnage.Joueur;

import java.util.Scanner;

import static Controler.ControlerPersonnages.*;


public class Main {
    public static void main(String[] args) {

        ControlerArmes.initArmes();
        ControlerPersonnages.initPersonnages();
        Modele.Personnage.Joueur joueur = ControlerPersonnages.joueur;
        joueur.choisirClasse();
        Joueur p = player.getFirst();
        System.out.println(p.getNom());


        p.setPointsDeVie(p.getPointsDeVie()-10);






    }
}