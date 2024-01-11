package Modele.Personnage;

import Controler.ControlerPersonnages;
import Modele.Personnage.Classe.*;
import Modele.Personnage.Objet.Arme.Arme;
import interfaces.Interactuable;
import Controler.ControlerPersonnages.*;

import java.util.Scanner;

import static Controler.ControlerPersonnages.*;
import static Controler.ControlerPersonnages.sentinelle;

public class Joueur extends Personnage implements Interactuable {
    private int xp;
    private Arme armeEquiper;
    private int or;
    private String description;

    public Joueur(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int xp, int or, String description) {

        super(nom, pointsDeVie, force, armure, chanceCrit);
        this.xp = xp;
        this.or = or;
        this.description = description;
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

    public void retirerArme(){
        this.setForce(this.getForce()-this.armeEquiper.getDegat());
    }
    public void setArmeEquiper(Arme armeEquiper) {
            this.armeEquiper = armeEquiper;
            this.setForce(this.getForce()+this.armeEquiper.getDegat());
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    void ramasserObjet(){

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

    @Override
    public void utiliserPotion() {

    }

    @Override
    public void ramasserLoot() {

    }

    @Override
    public void choisirClasse() {

        ControlerPersonnages.initPersonnages();
        System.out.println("Choisissez votre classe : ");

       try {
           Scanner scanner = new Scanner(System.in);
           int a = scanner.nextInt();
           if (a == 1) {
               ControlerPersonnages.player.add(ControlerPersonnages.samurai);
           }
           if (a == 2) {
               ControlerPersonnages.player.add(ControlerPersonnages.ninja);
           }
           if (a == 3) {
               ControlerPersonnages.player.add(ControlerPersonnages.sentinelle);
           }else if (a >3 || a<1){
               System.out.println("un effort messieur entre 1 et 3 quand même");
               System.out.println(
                       " Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() +" Pv - "+ samurai.getForce() + " Force - "+ samurai.getArmure() +" Armure - "+ samurai.getChanceCrit() + " Crit chance \n"+
                       " Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() +" Pv - "+ ninja.getForce() + " Force - "+ ninja.getArmure() +" Armure - "+ ninja.getChanceCrit() + " Crit chance \n"+
                       " Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() +" Pv - "+ sentinelle.getForce() + " Force - "+ sentinelle.getArmure() +" Armure - "+ sentinelle.getChanceCrit() + " Crit chance \n");

               choisirClasse();
           }
           scanner.close();
       }catch (Exception exception){
           System.out.println("Un chiffre please mister");
           System.out.println(
                   "Classe 1 Samurai : " + samurai.getDescription() + " Stat : " + samurai.getPointsDeVie() +" Pv - "+ samurai.getForce() + " Force - "+ samurai.getArmure() +" Armure - "+ samurai.getChanceCrit() + " Crit chance \n"+
                   "Classe 2 Ninja : " + ninja.getDescription() + " Stat : " + ninja.getPointsDeVie() +" Pv - "+ ninja.getForce() + " Force - "+ ninja.getArmure() +" Armure - "+ ninja.getChanceCrit() + " Crit chance \n"+
                   "Classe 3 Sentinelle : " + sentinelle.getDescription() + " Stat : " + sentinelle.getPointsDeVie() +" Pv - "+ sentinelle.getForce() + " Force - "+ sentinelle.getArmure() +" Armure - "+ sentinelle.getChanceCrit() + " Crit chance \n");

           choisirClasse();
        }


    }
}
