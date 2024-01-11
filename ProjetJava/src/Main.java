import Controler.ControlerArmes;
import Controler.ControlerPersonnages;
import Modele.Personnage.Action.Bagarre;
import Modele.Personnage.Classe.Samurai;
import Modele.Personnage.Ennemie.Ashigaru;
import Modele.Personnage.Ennemie.Ennemi;
import Modele.Personnage.Joueur;

import java.util.ArrayList;

import static Controler.ControlerPersonnages.*;


public class Main {
    public static void main(String[] args) {

        ControlerArmes.initArmes();
        ControlerPersonnages.initPersonnages();
        ControlerPersonnages.choisirClasse();
        System.out.println(playyy.getNom());










    }
}