import Controler.ControlerArmes;
import Controler.ControlerPersonnages;
import Modele.Personnage.Action.Bagarre;
import Modele.Personnage.Action.ShopAndLevel;
import Modele.Personnage.Ennemie.Shogun;
import Modele.Personnage.Objet.Arme.Arme;
import interfaces.Interactuable;
import Modele.Personnage.Joueur;
import static Controler.ControlerArmes.katana;
import static Controler.ControlerPersonnages.*;
import static java.lang.Thread.sleep;


public class Main {
    public static void main(String[] args) {
        ControlerArmes.initArmes();
        ControlerPersonnages.initPersonnages();

        //Instance de Joueur nommée joueur qui sert à implémenter la méthode surcharger sleep3s qui permet de mettre le jeu en pause
        Joueur joueur = new Joueur();

        // Selection de la classe et la stock dans la variable "playyy"
        ControlerPersonnages.choisirClasse();

        System.out.println("Vous avez choisis la classe "+playyy.getNom()+" félicitation, il n'y as plus de marche en arrière pour vous là, c'est trop tard pour les remords donc j'espère que vous le regretterez pas!");

        // Fonction mettant un délai de 3 seconde
        joueur.sleep3s();

        //Sert à avoir une arme aléatoire dans la liste qui est dans la méthode choisirArmeAleatoire(); et l'équipe à notre joueur
        Arme armeRandom = ControlerArmes.choisirArmeAleatoire();
        if (armeRandom != null) {
            playyy.setArmeEquiper(armeRandom);

            System.out.println("\n Vous vous êtes équipez de votre fabuleuse arme tomber du ciel, le fameux : " + armeRandom.getNom() + " !! Qui est une " + armeRandom.getDescription() + " ce qui lui rajoute " + armeRandom.getDegat() + "point de dégat à tout ces coups.");
        }else {
            System.out.println("Problème avec les armes, aucune n'est disponibles.");
        }

        joueur.sleep3s();

        // premier combat
        System.out.println("début du combat");
        //Sert à instancier un combat
        Bagarre bagarre1 = new Bagarre(playyy, ashigaru);
        bagarre1.commencerCombatBandit();

        joueur.sleep3s();
        System.out.println("\n Félicitation pour votres premier combat, cela vous rapproche de plus en plus de la vengance. \n" +
                "Vous ramassez 15 gold par terre et gagnez un niveau.");
        playyy.setOr(playyy.getOr()+15);
        joueur.sleep3s();
        System.out.println("\n Ohhh mais n'est-ce pas la meilleur occasion pour vous introduire notre boutique? Tenez aller y faire un tour!");
        joueur.sleep3s();
        //Instancier le shop
        ShopAndLevel shop1 = new ShopAndLevel(playyy);
        shop1.ouvertureBoutique();

        System.out.println("Bon bah j'espère que vous avez fait le pleins, vous aurez l'occasion d'y refaire un tour toute façon!, enfin si vous survivez...");

        System.out.println("SAPERLIPOPETTE UN ENEMIE ENCORE ");
        //deuxième combat
        Bagarre bagarre2 = new Bagarre(playyy, roning);
        bagarre2.commencerCombatBandit();



        Bagarre bagarre3 = new Bagarre(playyy, shogun);
        bagarre3.commencerCombatBandit();



        Bagarre bagarre4 = new Bagarre(playyy, empereur);
        bagarre4.commencerCombatBandit();











    }
}