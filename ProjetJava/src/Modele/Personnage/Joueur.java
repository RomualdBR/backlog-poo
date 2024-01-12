package Modele.Personnage;

import Controler.ControlerPersonnages;
import Modele.Personnage.Objet.Arme.Arme;
import interfaces.Interactuable;

public class Joueur extends Personnage implements Interactuable {
    private int level;
    private Arme armeEquiper;
    private int or;
    private String description;
    private int vieMax;
    Modele.Personnage.Joueur joueur = ControlerPersonnages.joueur;


    public Joueur(String nom, int pointsDeVie, int force, int armure, int chanceCrit, int level, int or, String description, int vieMax) {
        super(nom, pointsDeVie, force, armure, chanceCrit);
        this.level = level;
        this.or = or;
        this.description = description;
        this.vieMax = vieMax;
    }

    public Joueur() {
        super();
    }

    public int getVieMax() {
        return vieMax;
    }

    public int setVieMax(int vieMax) {
        this.vieMax = vieMax;
        return vieMax;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int xp) {
        this.level = xp;
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



    public void setArmeEquiper(Arme armeEquiper) {
        this.armeEquiper = armeEquiper;
        //sert à que l'arme équiper ajouter ces dégats à la force du joueur
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


    @Override
    public void sleep3s(){
        try {
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("");
        }
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