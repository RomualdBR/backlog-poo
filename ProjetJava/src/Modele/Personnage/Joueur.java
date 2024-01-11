package Modele.Personnage;

import Controler.ControlerArmes;
import Controler.ControlerPersonnages;
import Modele.Personnage.Objet.Arme.Arme;
import interfaces.Interactuable;

import java.util.Scanner;

import static Controler.ControlerArmes.potionDeVieCommun;
import static Controler.ControlerPersonnages.*;

public class Joueur extends Personnage implements Interactuable {
    private int xp;
    private Arme armeEquiper;
    private int or;
    private String description;
    private int vieMax;
    Modele.Personnage.Joueur joueur = ControlerPersonnages.joueur;


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

    void ramasserObjet() {

    }


    @Override
    public void choixPotion() {

    }

    @Override
    public void coupCritique() {

    }

    @Override
    public void attaquer() {

    }

    @Override
    public void defendre() {

    }


    public static void ouvrirInventaire() {
        System.out.println("1 : " + potionDeVieCommun.getNom() + " | Quantité : " + potionDeVieCommun.getQuantiter() + " | Description : " + potionDeVieCommun.getDescription());
        System.out.println("2 : " + ControlerArmes.potiondeforce.getNom() + "| Quantité : " + ControlerArmes.potiondeforce.getQuantiter() + " | Description : " + ControlerArmes.potiondeforce.getDescription());
        System.out.println("3 : " + ControlerArmes.potionarmure.getNom() + "| Quantité : " + ControlerArmes.potionarmure.getQuantiter() + " | Description : " + ControlerArmes.potionarmure.getDescription());
        System.out.println("Souhaitez vous utilisez une potion? Si oui choisissez entre 1 et 3 la quel, sinon entrer le chiffre 4 pour quitter.");


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


    public static void utiliserPotionDeVie() {
        try {
            playyy.setPointsDeVie(playyy.getPointsDeVie()+ potionDeVieCommun.getHeal());
            if (playyy.getPointsDeVie() > playyy.vieMax) {
                playyy.setPointsDeVie(playyy.vieMax);
                System.out.println(playyy.getPointsDeVie());
            }
            if (playyy.getPointsDeVie() == playyy.vieMax) {
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

    }
    public static void utiliserPotionDeForce(){

    }

    @Override
    public void ramasserLoot() {

    }

    @Override
    public void choisirClasse() {

    }


    @Override
    public void commencerCombatBandit() {

    }
}