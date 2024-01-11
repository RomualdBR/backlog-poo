package Modele.Personnage.Action;
import Controler.*;
import Modele.Personnage.Ennemie.Ennemi;
import Modele.Personnage.Joueur;
import java.util.Random;
import java.util.Scanner;

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


        while (joueur.getPointsDeVie() <= 0 || ennemi.getPointsDeVie() <= 0) {
            System.out.println("\n\n\nJoueur Stat : " + joueur.getPointsDeVie() + " Pv - " + joueur.getForce() + " Force - " + joueur.getArmure() + " Armure - " + joueur.getChanceCrit() + " Crit chance "
                    + "                                                          " +
                   ennemi.getNom()+ "Stat : " + ennemi.getPointsDeVie() + " Pv - " + ennemi.getForce() + " Force - " + ennemi.getArmure() + " Armure - " + ennemi.getChanceCrit() + " Crit chance ");

            System.out.println("Que voulez vous faire : \n 1 : Attaquer \n 2 : Ouvrir l'inventaire de potion \n Choix : ");

            try {
                Scanner scannewr = new Scanner(System.in);
                int a = scannewr.nextInt();
                if (a == 1) {
                    menuAttaque();
                }
                if (a == 2) {
                    Joueur.ouvrirInventaire();
                }
                else {
                    System.out.println("Rentrer un chiffre entre 1 et 2.");
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
        Random r = new Random();
        int n = r.nextInt(joueur.getChanceCrit()+1);
        if(n==1){
            System.out.println("Coup critique!!");
            joueur.setForce((int) (joueur.getForce()*1.5));
        }
    }
    public void menuAttaque(){
        System.out.println("1 : Coup Puissant (130% des dégats d'attaques) \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2 : Renforcement (Augmente l'armure mais tape moins fort)\n" +
                           "3 : Attaque de base \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4 : Attaque Vampirique (Soigne un peu et fait un peu moins de dégat");
        try {
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            if(a == 1){
                coupPuissant();
            }
            if(a == 2){
                renforcement();
            }
            if(a == 3){
                attaqueEnemie();
            }
            if(a == 4){
                coupPuissant();
            }
            if(a == 5){
                coupPuissant();
            }
        }catch (Exception e){
            System.out.println("Rentrer un chiffre");
        }
    }
    public void coupPuissant(){
        double forceDeBase = joueur.getForce();
        critFonction();
        joueur.setForce((int) (joueur.getForce() * 1.3));
        attaqueEnemie();
        joueur.setForce((int) forceDeBase);
    }
    public void attaqueEnemie(){
        ennemi.setPointsDeVie(ennemi.getPointsDeVie() - joueur.getForce());
    }
}
