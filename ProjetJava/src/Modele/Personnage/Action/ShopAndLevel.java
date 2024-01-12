package Modele.Personnage.Action;

import Controler.ControlerArmes;
import Modele.Personnage.Joueur;
import Modele.Personnage.Objet.Arme.Arme;

import java.util.Scanner;

import static Controler.ControlerPersonnages.playyy;

public class ShopAndLevel {

    private Joueur joueur;

    /**
     * Initialise le joueur aux fonctions pour être utiliser plus facilement
     * @param joueur
     */
    public ShopAndLevel(Joueur joueur){
        this.joueur = joueur;
        ouvertureBoutique();
        joueur.sleep3s();
    }

    /**
     * Ouvre la boutique et permet d'acheter les potions et d'y déduire l'or du joueur
     */
    public void ouvertureBoutique() {
        //designe du print
        System.out.println("\t\t\t\t+==============================+");
        System.out.println("\t\t\t\t             BOUTIQUE"           );
        System.out.println("\t\t\t\t   Potions :"                    );
        System.out.println("\t\t\t\t   1. Potion de force     15pc  ");
        System.out.println("\t\t\t\t   2. Potion d'armure     15pc  ");
        System.out.println("\t\t\t\t   3. Potion de vie       15pc  ");
        System.out.println("\t\t\t\t   4.FERMER                     ");
        System.out.println("\t\t\t\t+==============================+");
        System.out.println("Vous avez actuellement : " + joueur.getOr());
        System.out.println("Que décidez-vous d'acheter ?");

        //vérification et demande d'achat
        Scanner scanner = new Scanner(System.in);
        int choix = scanner.nextInt();

            if (choix == 1 ) {


                System.out.println("Êtes-vous sur d'acheter la potion de force ?");

                System.out.println("1 = oui");
                System.out.println("2 = non");

                int confirmationPotionDeForce = scanner.nextInt();

                if (confirmationPotionDeForce == 1 && joueur.getOr() >= 15) {
                    ControlerArmes.potiondeforce.setQuantiter(ControlerArmes.potiondeforce.getQuantiter() + 1);
                    joueur.setOr(joueur.getOr() - 15);
                    System.out.println("Vous avez acheté " + ControlerArmes.potiondeforce.getQuantiter() + "  potions de force");
                    System.out.println("Il vous reste " + joueur.getOr() + " or");

                }
                if (confirmationPotionDeForce == 2) {
                    ouvertureBoutique();
                }
                else {
                    System.out.println("vous n'avez pas assez d'argent");
                    ouvertureBoutique();
                }
            }
            if (choix == 2) {
                System.out.println("Êtes-vous sur d'acheter la potion d'armure ?");

                System.out.println("1 = oui");
                System.out.println("2 = non");

                int confirmationPotionArmure = scanner.nextInt();

                if (confirmationPotionArmure == 1 && joueur.getOr() >=15) {
                    ControlerArmes.potionarmure.setQuantiter(ControlerArmes.potionarmure.getQuantiter() + 1);
                    joueur.setOr(joueur.getOr() - 15);

                    System.out.println("Vous avez acheté " + ControlerArmes.potionarmure.getQuantiter() + "  potions d'armure");
                    System.out.println("Il vous reste " + joueur.getOr() + " or");
                }
                if (confirmationPotionArmure == 2) {
                    ouvertureBoutique();
                }else {
                    System.out.println("vous n'avez pas assez d'argent");
                    ouvertureBoutique();
                }
            }

            if (choix == 3) {
                System.out.println("Êtes-vous sur d'acheter la potion de vie ?");

                System.out.println("1 = oui");
                System.out.println("2 = non");
                int confirmationPotionDeVie = scanner.nextInt();

                if (confirmationPotionDeVie == 1 & joueur.getOr() >=15) {
                    ControlerArmes.potionDeVieCommun.setQuantiter(ControlerArmes.potionDeVieCommun.getQuantiter() + 1);
                    joueur.setOr(joueur.getOr() - 15);
                    System.out.println("Vous avez acheté 1 potions de vie, vous en avez maitenant " + ControlerArmes.potionDeVieCommun.getQuantiter());
                    System.out.println("Il vous reste " + joueur.getOr() + " or");
                }
                if (confirmationPotionDeVie == 2) ouvertureBoutique();
                else {
                    System.out.println("vous n'avez pas assez d'argent");
                    ouvertureBoutique();
                }
            }

        if (choix == 4){
            System.out.println("Bonne journée!");

        }
    }

    /**
     * méthode qui augmente les stats du joueur généralement appeler apres un combat
     */
    public static void levelUp(){
        playyy.setVieMax(playyy.getVieMax()+10);
        playyy.setPointsDeVie(playyy.getVieMax());
        playyy.setForce(playyy.getForce()+10) ;
        playyy.setArmure(playyy.getArmure() + 10);
        playyy.setLevel(playyy.getLevel() + 1);
        System.out.println("Bravo vous venez de gagner un niveau ! et certaines de vos stats ont augmenté !\n" +
                " pv "+playyy.getPointsDeVie()+" force "+playyy.getForce()+" armur "+playyy.getArmure()+" xp "+playyy.getLevel());
    }

    /**
     * méthode pour équiper aleatoirement une arme
     */
    public static void equiperRandomWeapon(){
        ControlerArmes.initialiserListeArmes();
        Arme armeRandom = ControlerArmes.choisirArmeAleatoire();

        if (armeRandom != null) {

            if (playyy.getArmeEquiper()!= null){
                retirerArme();
                System.out.println("\n d'une manière totalement aléatoire vous avez perdu votre arme, mais que faire?");
                System.out.println("\n Vous vous êtes équipez d'une nouvelle arme tomber du ciel, el famoso : " + armeRandom.getNom() + " !! Qui est une " + armeRandom.getDescription() + " ce qui lui rajoute " + armeRandom.getDegat() + "point de dégat à tout ces coups.");
                playyy.setArmeEquiper(armeRandom);
            }
            else {
                playyy.setArmeEquiper(armeRandom);
                System.out.println("\n Vous vous êtes équipez de votre fabuleuse arme tomber du ciel, le fameux : " + armeRandom.getNom() + " !! Qui est une " + armeRandom.getDescription() + " ce qui lui rajoute " + armeRandom.getDegat() + " point de dégat à tout ces coups.");
            }
        }else {
            System.out.println("Problème avec les armes, aucune n'est disponibles.");
        }
    }

    /**
     * méthode permettant de retirer l'arme du joueur et de rez la force
     */
    public static void retirerArme() {

        playyy.setForce(playyy.getForce() - playyy.getArmeEquiper().getDegat());
    }
}
