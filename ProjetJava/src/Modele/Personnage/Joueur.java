package Modele.Personnage;
import Modele.Personnage.Objet.Arme.Arme;
import interfaces.Interactuable;

import java.io.Serializable;

public class Joueur extends Personnage implements Interactuable, Serializable {
    private int level;
    private Arme armeEquiper;
    private int or;
    private String description;
    private int vieMax;


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


    /**
     *ajoute l'arme équiper à la force
     * @param armeEquiper
     */
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

    @Override
    /**
     * Sert à mettre le jeu en freeze pendant 3s
     */
    public void sleep3s(){
        try {
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("");
        }
        }
}