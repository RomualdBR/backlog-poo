package Modele.Personnage.Action;
import Controler.*;
import Modele.Personnage.Ennemie.Ennemi;
import Modele.Personnage.Joueur;
import java.util.Random;
import java.util.Scanner;
import Controler.ControlerArmes.*;

import static Controler.ControlerArmes.katana;
import static Controler.ControlerArmes.potionDeVieCommun;
import static Controler.ControlerPersonnages.*;

public class Bagarre {
    private Joueur joueur;
    private Ennemi ennemi;

    public Bagarre(Joueur joueur, Ennemi ennemi) {
        this.joueur = joueur;
        this.ennemi = ennemi;
        commencerCombatBandit();
    }
    public void commencerCombatBandit() {
        //boucle while pour que le combat dure jusqu'à ce que l'un des deux soit morts
        while (joueur.getPointsDeVie() > 0 && ennemi.getPointsDeVie() > 0) {
            System.out.println("Joueur Stat : " + joueur.getPointsDeVie() + " Pv - " + joueur.getForce() + " Force - " + joueur.getArmure() + " Armure - " + joueur.getChanceCrit() + " Crit chance "
                    + "                                                          " +
                   ennemi.getNom()+ " Stat : " + ennemi.getPointsDeVie() + " Pv - " + ennemi.getForce() + " Force - " + ennemi.getArmure() + " Armure - " + ennemi.getChanceCrit() + " Crit chance ");
            //sert à demander aux joueurs ce qu'ils veulent faire, attaquer ou ouvrir l'inventaire
            System.out.println("Que voulez vous faire : \n 1 : Attaquer \n 2 : Ouvrir l'inventaire de potion \n Choix : ");
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            try {
                //pas besoin de comment ouvrir inventaire ou menu attaque plus que sa c'est assez explicite
                if (a == 1) {
                    menuAttaque();
                }
                if (a == 2) {
                    ouvrirInventaire();
                }
                else {
                    System.out.println("");
                }

            }catch (Exception e){
                System.out.println("Rentrer un chiffre");

            }
        }
    }
    public void renforcement(){
        double forceDeBase = joueur.getForce();
        critFonction();
        joueur.setForce((int) (joueur.getForce()*0.6));
        joueur.setArmure(joueur.getArmure()+30);
        attaqueEnemie();
        joueur.setForce((int) forceDeBase);
    }
    public void critFonction(){
        //fonction random pour les chances de crit, qui prend du random en fonction des chances de crit du joueur
        Random r = new Random();
        int n = r.nextInt(joueur.getChanceCrit()+1);
        if(n==1){
            System.out.println("Coup critique!!");
            joueur.setForce((int) (joueur.getForce()*1.5));
        }
    }
    public void menuAttaque(){
        System.out.println("1 : Coup Puissant (130% des dégats d'attaques) \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2 : Renforcement (Augmente l'armure mais tape moins fort)\n" +
                           "3 : Attaque de base \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4 : Attaque Vampirique (Soigne un peu et fait un peu moins de dégat\n" +
                "\n 5 : Revenir en arrière" +
                "Quel attaque choississez vous");
        try {
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            if(a == 1){
                coupPuissant();
                defenseJoueur();
            }
            if(a == 2){
                renforcement();
                defenseJoueur();
            }
            if(a == 3){
                attaqueEnemie();
                defenseJoueur();
            }
            if(a == 4){
                attaqueVampyrique();
                defenseJoueur();
            }
            if(a == 5){
                commencerCombatBandit();
            }
        }catch (Exception e){
            System.out.println("Rentrer un chiffre");
        }
    }
    //compétence
    public void coupPuissant(){
        double forceDeBase = joueur.getForce();
        critFonction();
        joueur.setForce((int) (joueur.getForce() * 1.3));
        attaqueEnemie();
        joueur.setForce((int) forceDeBase);

    }
    public void attaqueVampyrique(){
        double forceDeBase = joueur.getForce();
        critFonction();
        joueur.setForce((int)(joueur.getForce()*0.7));
        attaqueEnemie();
        joueur.setPointsDeVie((int) (joueur.getPointsDeVie()+15));;
        if(joueur.getPointsDeVie()>joueur.getVieMax()){
            joueur.setPointsDeVie(joueur.getVieMax());
        }if (joueur.getPointsDeVie() == joueur.getVieMax()) {
            System.out.println("Vous ne pouvez pas vous soignez si vous êtes full vie.");
        }
    }
    public void attaqueEnemie(){
        //méthode qui prend la force du joueur pour infliger des dégat à l'ennemie.
        ennemi.setPointsDeVie(ennemi.getPointsDeVie()+ennemi.getArmure());
        ennemi.setPointsDeVie(ennemi.getPointsDeVie()-joueur.getForce());
        double damageCalculator = joueur.getForce() - ennemi.getArmure();
        System.out.println("Vous avez infligez : " + damageCalculator + "points de dégat");
    }
    public void defenseJoueur(){
        //sert à ce que l'ennemie nous attaque
        if (ennemi.getPointsDeVie() == 0 || ennemi.getPointsDeVie() <=0){
            System.out.println("Félicitation, vous avez gagnez le combat contre " + ennemi.getNom() + "!!");
        }
        if (joueur.getPointsDeVie()>0) {
            joueur.setPointsDeVie(joueur.getPointsDeVie() + joueur.getArmure());
            joueur.setPointsDeVie(joueur.getPointsDeVie() - ennemi.getForce());
            double damageCalculator = ennemi.getForce() - joueur.getArmure();
            System.out.println("Vous avez subis : " + damageCalculator + "points de dégat");
            if (joueur.getPointsDeVie() == 0 || joueur.getPointsDeVie() <=0){
                System.out.println("Vous avez perdu contre " + ennemi.getNom() + "!!");
                System.out.println("Mais courage, nous feront comme si nous n'avions rien vue.");
            }
        }
    }
    public void ouvrirInventaire() {
        System.out.println("1 : " + potionDeVieCommun.getNom() + " | Quantité : " + potionDeVieCommun.getQuantiter() + " | Description : " + potionDeVieCommun.getDescription());
        System.out.println("2 : " + ControlerArmes.potiondeforce.getNom() + "| Quantité : " + ControlerArmes.potiondeforce.getQuantiter() + " | Description : " + ControlerArmes.potiondeforce.getDescription());
        System.out.println("3 : " + ControlerArmes.potionarmure.getNom() + "| Quantité : " + ControlerArmes.potionarmure.getQuantiter() + " | Description : " + ControlerArmes.potionarmure.getDescription());
        System.out.println("Souhaitez vous utilisez une potion? Si oui choisissez entre 1 et 3 la quel, sinon entrer le chiffre 4 pour quitter.");

        //sert à choisir une potentielle potion à utiliser s'il y as une quantité intéressante
        try {
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            if (a == 1) {
                if (potionDeVieCommun.getQuantiter() > 0) {
                    potionDeVieCommun.setQuantiter(potionDeVieCommun.getQuantiter() - 1);
                    utiliserPotionDeVie();
                } else {
                    System.out.println("Vous n'avez plus de potion de vie commune.");
                    ouvrirInventaire();
                }
            } else if (a == 2) {
                if (ControlerArmes.potiondeforce.getQuantiter() > 0) {
                    ControlerArmes.potiondeforce.setQuantiter(ControlerArmes.potiondeforce.getQuantiter() - 1);
                    utiliserPotionDeForce();
                } else {
                    System.out.println("Vous n'avez plus de potion de force.");
                    ouvrirInventaire();
                }
            } else if (a == 3) {
                if (ControlerArmes.potionarmure.getQuantiter() > 0) {
                    ControlerArmes.potionarmure.setQuantiter(ControlerArmes.potionarmure.getQuantiter() - 1);
                    utiliserPotionArmure();
                } else {
                    System.out.println("Vous n'avez plus de potion d'armure.");
                    ouvrirInventaire();
                }
            } else if (a == 4) {
                commencerCombatBandit();
                // Code pour quitter
            } else {
                System.out.println("Veuillez choisir un nombre entre 1 et 4.");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Entrer un chiffre s'il vous plait");
            ouvrirInventaire();
        }
    }
    public void utiliserPotionDeVie() {
        try {
            playyy.setPointsDeVie(playyy.getPointsDeVie()+ potionDeVieCommun.getHeal());
            //sert à ne pas exceder les points de vie max qu'on as au début du combat
            if (playyy.getPointsDeVie() > playyy.getVieMax()) {
                playyy.setPointsDeVie(playyy.getVieMax());
                System.out.println("Vous vous êtes soigner de 40 Pv, vous avez maintenant : " +playyy.getPointsDeVie()+ "Pv.");
            }//vérifie qu'on est pas déjà full vie
            if (playyy.getPointsDeVie() == playyy.getVieMax()) {
                System.out.println("Vous ne pouvez pas vous soignez si vous êtes full vie.");
                ouvrirInventaire();
            }
        }catch(Exception exception){
            System.out.println("Problème avec la potion de soin.");
            ouvrirInventaire();
        }
        System.out.println(playyy.getPointsDeVie());
        ouvrirInventaire();

    }
    public static void utiliserPotionArmure(){
        try {
            playyy.setArmure(playyy.getArmure() + ControlerArmes.potionarmure.getBonusArmure());

        } catch (Exception e){
            System.out.println("Erreur avec la potion d'armure");
        }
    }
    public static void utiliserPotionDeForce(){
        try {
            playyy.setForce(playyy.getForce() + ControlerArmes.potiondeforce.getBonusForce());
        }catch (Exception e){
            System.out.println("Erreur avec la potion de force");
        }
        }
    public static void menuDuJeu() {

        System.out.println("  THE VENGANCE OF TAKESHI  ");
        System.out.println("―――――――――――――――――――――――――――");
        System.out.println("      1. Jouer ");
        System.out.println("      2. Charger ");
        System.out.println("      3. Sauvegarder");
        System.out.println("      4. Quitter");
        System.out.println("―――――――――――――――――――――――――――");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        if ( a == 1){
            debutHistoire();

        }


    }


    public static void debutHistoire() {
        System.out.println("Il était une fois, dans le Japon ancien, un jeune homme du nom de Takeshi vivait paisiblement dans le village au côté de sa tendre mère");
        System.out.println("Sa vie paisible fut bouleversée lorsqu'un groupe de bandits, engagés par l'empereur lui-même attaqua sa mère et la TUA !");
       try{
           Thread.sleep(4000);
       }catch(Exception e){
           System.out.println("");
       }
        System.out.println("Impuissant face à cette scène macabre, Takeshi parvient à tuer l'un des 5 bandits et s'enfuit. ");
        System.out.println("Nourrit par la haine et le soif de vengance, Takeshi décida de se lancer dans une quête pour devenir un monstre redoutable et affronter ceux qui avaient pris la vie de sa mère. \n");



    }


}
