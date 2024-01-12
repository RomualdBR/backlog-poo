package Modele.Personnage.Action;

import Controler.ControlerArmes;
import Modele.Personnage.Joueur;

import java.util.Scanner;

public class ShopAndLevel {

    private Joueur joueur;
    public ShopAndLevel(Joueur joueur){
        this.joueur = joueur;
        ouvertureBoutique();
        levelUp();
    }
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
        try {
            if (choix == 1 && joueur.getOr() >= 15) {


                System.out.println("Êtes-vous sur d'acheter la potion de force ?");

                System.out.println("1 = oui");
                System.out.println("2 = non");

                int confirmationPotionDeForce = scanner.nextInt();

                if (confirmationPotionDeForce == 1) {
                    ControlerArmes.potiondeforce.setQuantiter(ControlerArmes.potiondeforce.getQuantiter() + 1);
                    joueur.setOr(joueur.getOr() - 15);
                    System.out.println("Vous avez acheté " + ControlerArmes.potiondeforce.getQuantiter() + "  potions de force");
                    System.out.println("Il vous reste " + joueur.getOr() + " or");

                }
                if (confirmationPotionDeForce == 2) {
                    ouvertureBoutique();
                }
            }
            if (choix == 2 && joueur.getOr() >= 15) {
                System.out.println("Êtes-vous sur d'acheter la potion d'armure ?");

                System.out.println("1 = oui");
                System.out.println("2 = non");

                int confirmationPotionArmure = scanner.nextInt();

                if (confirmationPotionArmure == 1) {
                    ControlerArmes.potionarmure.setQuantiter(ControlerArmes.potionarmure.getQuantiter() + 1);
                    joueur.setOr(joueur.getOr() - 15);

                    System.out.println("Vous avez acheté " + ControlerArmes.potionarmure.getQuantiter() + "  potions d'armure");
                    System.out.println("Il vous reste " + joueur.getOr() + " or");
                }
                if (confirmationPotionArmure == 2) {
                    ouvertureBoutique();
                }
            }

            if (choix == 3 && joueur.getOr() >= 15) {
                System.out.println("Êtes-vous sur d'acheter la potion de vie ?");

                System.out.println("1 = oui");
                System.out.println("2 = non");
                int confirmationPotionDeVie = scanner.nextInt();

                if (confirmationPotionDeVie == 1) {
                    ControlerArmes.potionDeVieCommun.setQuantiter(ControlerArmes.potionDeVieCommun.getQuantiter() + 1);
                    joueur.setOr(joueur.getOr() - 15);
                    System.out.println("Vous avez acheté 1 potions de vie, vous en avez maitenant " + ControlerArmes.potionDeVieCommun.getQuantiter());
                    System.out.println("Il vous reste " + joueur.getOr() + " or");

                }
            }
        }catch(Exception e){
            System.out.println("Entrer un chiffre et vérifier bien que vous avez assez d'or.");
        }finally {
            System.out.println("Entrer un chiffre et vérifier bien que vous avez assez d'or.");
            ouvertureBoutique();
        }
        if (choix == 4){
            levelUp();
        }
    }
        //fonction de level up qui augmente toutes les stats
    public void levelUp(){
        System.out.println("Bravo vous venez de gagner un niveau ! et certaines de vos stats ont augmenté !\n" +
                " pv "+joueur.getPointsDeVie()+" force "+joueur.getForce()+" armur "+joueur.getArmure()+" level "+joueur.getLevel());
        joueur.setVieMax(joueur.getVieMax()+10);
        joueur.setPointsDeVie(joueur.getVieMax());
        joueur.setForce(joueur.getForce()+10) ;
        joueur.setArmure(joueur.getArmure() + 10);
        joueur.setLevel(joueur.getLevel() + 1);
        System.out.println("Bravo vous venez de gagner un niveau ! et certaines de vos stats ont augmenté !\n" +
                " pv "+joueur.getPointsDeVie()+" force "+joueur.getForce()+" armur "+joueur.getArmure()+" xp "+joueur.getLevel());
    }
}
