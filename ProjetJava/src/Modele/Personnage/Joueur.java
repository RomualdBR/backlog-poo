package Modele.Personnage;

import Controler.ControlerArmes;
import Modele.Personnage.Objet.Arme.Arme;
import interfaces.Interactuable;
import java.util.Random;
import java.util.Scanner;

import static Controler.ControlerPersonnages.*;

public class Joueur extends Personnage implements Interactuable {
    private int xp;
    private Arme armeEquiper;
    private int or;
    private String description;
    private int vieMax;


    public Joueur(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int xp, int or, String description, int vieMax) {
        super(nom, pointsDeVie, force, armure, chanceCrit);
        this.xp = xp;
        this.or = or;
        this.description = description;
        this.vieMax = vieMax;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public int getOr() {
        return or;
    }

    public void setOr(int or) {
        this.or = or;
    }

    public Arme getArmeEquiper() {
        return armeEquiper;
    }

    public void retirerArme() {
        this.setForce(this.getForce() - this.armeEquiper.getDegat());
    }

    public void setArmeEquiper(Arme armeEquiper) {
        this.armeEquiper = armeEquiper;
        this.setForce(this.getForce() + this.armeEquiper.getDegat());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public void choixPotion() {

    }

    @Override
    public void coupCritique() {

    }

    @Override
    public void attaquer() {
        Joueur p = player.getFirst();

    }





    @Override
    public void menuAttaquer() {
        try {
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            System.out.println("1 : Attaque de base                    2 : 1 ère compétence \n3 : 2 ème compétence                   4 : 3ème compétence");
            if (a == 1){
                coupPuissant();
            }if (a == 2){

            }if (a == 3){

            }if (a == 4){

            }if (a == 5){
                menuCombat();
            }else{
                System.out.println("Veuillez mettre un chiffre valide.");
            }
        }catch(Exception e){

        }
    }




    @Override
    public void critMaybe() {
        Joueur p = player.getFirst();
        Random r = new Random();
        int n = r.nextInt(p.getChanceCrit()+1);
        if(n==1){
            p.setForce(getForce()*1.5);
        }
    }

    @Override
    public void defendre() {

    }

    @Override
    public void utiliserPotionDeVie() {
        Joueur p = player.getFirst();
        p.setPointsDeVie(p.getPointsDeVie() + ControlerArmes.potionDeVieCommun.getHeal());
        try {
            if (p.getPointsDeVie() > p.vieMax) {
                p.setPointsDeVie(p.vieMax);
                System.out.println(p.getPointsDeVie());
            }
            if (p.getPointsDeVie() == p.vieMax) {
                System.out.println("Vous ne pouvez pas vous soignez si vous êtes full vie.");
                ouvrirInventaire();
            }
        }catch(Exception exception){
            System.out.println("Problème avec la potion de soin.");
            ouvrirInventaire();
        }
        System.out.println(p.getPointsDeVie());
        ouvrirInventaire();
    }

    @Override
    public void ramasserLoot() {

    }

    @Override
    public void choisirClasse() {

        initPersonnages();
        System.out.println("Vous avez le choix entre ces classes :  \n" +
                " Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() + " Pv - " + samurai.getForce() + " Force - " + samurai.getArmure() + " Armure - " + samurai.getChanceCrit() + " Crit chance \n" +
                " Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() + " Pv - " + ninja.getForce() + " Force - " + ninja.getArmure() + " Armure - " + ninja.getChanceCrit() + " Crit chance \n" +
                " Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() + " Pv - " + sentinelle.getForce() + " Force - " + sentinelle.getArmure() + " Armure - " + sentinelle.getChanceCrit() + " Crit chance \n");

        System.out.println("Choisissez votre classe : ");

        try {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if (a == 1) {
                player.add(samurai);
            }
            if (a == 2) {
                player.add(ninja);
            }
            if (a == 3) {
                player.add(sentinelle);
            } else if (a > 3 || a < 1) {
                System.out.println("un effort messieur entre 1 et 3 quand même");
                System.out.println(
                        " Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() + " Pv - " + samurai.getForce() + " Force - " + samurai.getArmure() + " Armure - " + samurai.getChanceCrit() + " Crit chance \n" +
                                " Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() + " Pv - " + ninja.getForce() + " Force - " + ninja.getArmure() + " Armure - " + ninja.getChanceCrit() + " Crit chance \n" +
                                " Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() + " Pv - " + sentinelle.getForce() + " Force - " + sentinelle.getArmure() + " Armure - " + sentinelle.getChanceCrit() + " Crit chance \n");

                choisirClasse();
            }

        } catch (Exception exception) {
            System.out.println("Un chiffre please mister");
            System.out.println(
                    "Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() + " Pv - " + samurai.getForce() + " Force - " + samurai.getArmure() + " Armure - " + samurai.getChanceCrit() + " Crit chance \n" +
                            "Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() + " Pv - " + ninja.getForce() + " Force - " + ninja.getArmure() + " Armure - " + ninja.getChanceCrit() + " Crit chance \n" +
                            "Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() + " Pv - " + sentinelle.getForce() + " Force - " + sentinelle.getArmure() + " Armure - " + sentinelle.getChanceCrit() + " Crit chance \n");

            choisirClasse();
        }


    }





    public void menuCombat() {
        Joueur p = player.getFirst();
        while (p.getPointsDeVie()<=0 || bandit.getPointsDeVie()<= 0){


            System.out.println( "\n\n\nJoueur Stat : " + p.getPointsDeVie() + " Pv - " + p.getForce() + " Force - " + p.getArmure() + " Armure - " + p.getChanceCrit() + " Crit chance "
                    +  "                                                          " +
                    "Bandit Stat : " + .getPointsDeVie() + " Pv - " + .getForce() + " Force - " + .getArmure() + " Armure - " + .getChanceCrit() + " Crit chance " );

            System.out.println("Que voulez vous faire : \n 1 : Attaquer \n 2 : Ouvrir l'inventaire de potion \n Choix : ");
            Scanner scannetr = new Scanner(System.in);
            int a = scannetr.nextInt();
            try {
                if (a == 1) {
                    menuAttaquer();
                }
                if (a == 2) {
                    ouvrirInventaire();
                }
                else {
                    System.out.println("rentrer un chiffre entre 1 et 2 ");
                }
            }catch(Exception e){
                System.out.println("Rentrez un chiffre s'il vous plait.");

            }
        }
    }


    public void coupPuissant() {
        Joueur p = player.getFirst();
        int stockAttack = p.getForce();
        critMaybe();
        double attaqueSpeciale = p.setForce(p.getForce() * 1.3);
        .setPointsDeVie((int) (.getPointsDeVie() - attaqueSpeciale));
        p.setForce(stockAttack);
        bandiAttack();
    }



    public void ouvrirInventaire() {

        System.out.println("1 : " + ControlerArmes.potionDeVieCommun.getNom() + " | Quantité : " + ControlerArmes.potionDeVieCommun.getQuantiter() + " | Description : " + ControlerArmes.potionDeVieCommun.getDescription());
        System.out.println("2 : " + ControlerArmes.potiondeforce.getNom() + "| Quantité : " + ControlerArmes.potiondeforce.getQuantiter() + " | Description : " + ControlerArmes.potiondeforce.getDescription());
        System.out.println("3 : " + ControlerArmes.potionarmure.getNom() + "| Quantité : " + ControlerArmes.potionarmure.getQuantiter() + " | Description : " + ControlerArmes.potionarmure.getDescription());
        System.out.println("Souhaitez vous utilisez une potion? Si oui choisissez entre 1 et 3 la quel, sinon entrer le chiffre 4 pour quitter.");


        try {
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            if (a == 1) {
                if (ControlerArmes.potionDeVieCommun.getQuantiter() > 0) {
                    ControlerArmes.potionDeVieCommun.setQuantiter(ControlerArmes.potionDeVieCommun.getQuantiter() - 1);
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
               ;
                // Code pour quitter
            } else {
                System.out.println("Veuillez choisir un nombre entre 1 et 4.");
            }
        } catch (Exception e) {
            System.out.println(e);
            //System.out.println("Entrer un chiffre s'il vous plait");
            //ouvrirInventaire();
        }
    }
    public void utiliserPotionArmure(){

    }
    public void utiliserPotionDeForce(){

    }
    @Override
    public void bandiAttack(){
        Joueur p = player.getFirst();
        p.setPointsDeVie(p.getPointsDeVie()- ashigaru.getForce());
    }
}