import Controler.ControlerArmes;
import Controler.ControlerPersonnages;
import Modele.Personnage.Action.Bagarre;
import Modele.Personnage.Action.ShopAndLevel;
import Modele.Personnage.Joueur;
import static Controler.ControlerPersonnages.*;



public class Main {
    public static void main(String[] args) {
        ControlerArmes.initArmes();
        ControlerPersonnages.initPersonnages();

        //Instance de Joueur nommée joueur qui sert à implémenter la méthode surcharger sleep3s qui permet de mettre le jeu en pause
        Joueur joueur = new Joueur();
        //Menu du jeu
        Bagarre.menuDuJeu();
        joueur.sleep3s();
        // Selection de la classe et la stock dans la variable "playyy"
        ControlerPersonnages.choisirClasse();

        System.out.println("Vous avez choisis la classe "+playyy.getNom()+" félicitation, il n'y as plus de marche en arrière pour vous là, c'est trop tard pour les remords donc j'espère que vous ne le regretterez pas!");



        // Fonction mettant un délai de 3 seconde
        joueur.sleep3s();

        //Sert à avoir une arme aléatoire dans la liste qui est dans la méthode choisirArmeAleatoire(); et l'équipe à notre joueur
        ShopAndLevel.equiperRandomWeapon();

        joueur.sleep3s();

        //Dialogue 1//
        System.out.println("Après plusieurs années d'entrainement, c'est le jour final. Takeshi marche vers le chateau de l'empereur, son premier ennemi arrive");
        joueur.sleep3s();

        Bagarre bagarre1 = new Bagarre(playyy, ashigaru);
        // premier combat
        //Sert à instancier un combat

        bagarre1.sauvegarder("sauvegarde1.txt");
        System.out.println("début du combat");
        bagarre1.commencerCombatBandit();


        joueur.sleep3s();
        System.out.println("\n Félicitation pour votres premier combat, cela vous rapproche de plus en plus de la vengance. \n" +
                "Vous ramassez 15 gold par terre et gagnez un niveau.");
        playyy.setOr(playyy.getOr()+15);
        joueur.sleep3s();

        ShopAndLevel.levelUp();
        joueur.sleep3s();

        System.out.println("\n Ohhh mais n'est-ce pas la meilleur occasion pour vous introduire notre boutique? Tenez aller y faire un tour!");
        joueur.sleep3s();

        //Instancier le shop
        ShopAndLevel shop1 = new ShopAndLevel(playyy);
        shop1.ouvertureBoutique();

        joueur.sleep3s();


        System.out.println("Bon bah j'espère que vous avez fait le pleins, vous aurez l'occasion d'y refaire un tour toute façon!, enfin si vous survivez...");
        joueur.sleep3s();
        System.out.println("Après avoir tranché son premier ennemie, Takeshi a soif de tuer. Courant sur le pont du château, il... ");
        joueur.sleep3s();
        System.out.println("SAPERLIPOPETTE UN ENEMIE ENCORE, PREPAREZ VOUS! ");
        joueur.sleep3s();

        ShopAndLevel.equiperRandomWeapon();
        joueur.sleep3s();

        //deuxième combat
        Bagarre bagarre2 = new Bagarre(playyy, roning);
        bagarre2.sauvegarder("sauvegarde1.txt");


        bagarre2.commencerCombatBandit();

        System.out.println("\n Félicitation pour votres deuxième combat, cela vous rapproche de plus en plus de la vengance. \n" +
                "Vous ramassez 25 gold par terre et gagnez un niveau.");
        playyy.setOr(playyy.getOr()+25);

        joueur.sleep3s();
        ShopAndLevel.levelUp();

        joueur.sleep3s();
        ShopAndLevel shop2 = new ShopAndLevel(playyy);
        shop2.ouvertureBoutique();

        joueur.sleep3s();
        ShopAndLevel.equiperRandomWeapon();
        joueur.sleep3s();
        System.out.println("Le Ronin fut un adversaire redoutable, Takeshi est plus que motivé. Cependant son chemin vers la vengance est loin d'être fini car un redoutable ennemi bloque le passage");
        joueur.sleep3s();

        Bagarre bagarre3 = new Bagarre(playyy, shogun);
        bagarre3.sauvegarder("sauvegarde1.txt");
        bagarre3.commencerCombatBandit();

        System.out.println("\n Félicitation pour votres troisième combat, cela vous rapproche de plus en plus de la vengance. \n" +
                "Vous ramassez 30 gold par terre et gagnez un niveau.");
        playyy.setOr(playyy.getOr()+30);
        joueur.sleep3s();
        ShopAndLevel.levelUp();

        joueur.sleep3s();
        ShopAndLevel shop3 = new ShopAndLevel(playyy);
        shop3.ouvertureBoutique();

        joueur.sleep3s();
        ShopAndLevel.equiperRandomWeapon();
        joueur.sleep3s();

        joueur.sleep3s();

        Bagarre bagarre4 = new Bagarre(playyy, empereur);
        bagarre4.sauvegarder("sauvegarde1.txt");
        bagarre4.commencerCombatBandit();
        System.out.println("L'empereur Stefan a été vaincu, Takeshi pleurt et dit 'Maman, ma tendre maman, j'ai volé la vie de la personne qu'il te l'a prise de manière injuste. Je peux donc mourrir en paix");
        joueur.sleep3s();
        joueur.sleep3s();
        System.out.println("Takeshi brandit son katana et se trancha la gorge...");
        joueur.sleep3s();
        System.out.println(" ―――――――――――――――――――――――――――");
        System.out.println("                    FIN");












    }
}