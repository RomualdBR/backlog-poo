package Modele.Personnage;

import Controler.ControlerPersonnages;
import Modele.Personnage.Classe.*;
import Modele.Personnage.Objet.Arme.Arme;
import interfaces.Interactuable;
import Controler.ControlerPersonnages.*;

import java.util.Scanner;

public class Joueur extends Personnage implements Interactuable {
    private int xp;
    private Arme armeEquiper;
    private int or;

    public Joueur(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int xp, int or) {

        super(nom, pointsDeVie, force, armure, chanceCrit);
        this.xp = xp;
        this.or = or;
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
        Samurai j; "getDescription"
        Ninja o;
        Sentinelle m;

        ControlerPersonnages.initPersonnages();
        System.out.println("Choisissez votre classe : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a == 1) {
            j = ControlerPersonnages.samurai;
        }
        scanner.close();
        System.out.println(j.getDescription());
        System.out.println(o);
    }
}
