import Controler.ControlerArmes;
import Controler.ControlerPersonnages;

import static Controler.ControlerArmes.*;
import static Controler.ControlerPersonnages.*;
public class Main {
    public static void main(String[] args) {

        ControlerArmes.initArmes();
        ControlerPersonnages.initPersonnages();
        System.out.println("Choissisez votre classe entre ceux là \n" +
                        " 1 Barbare  \n" +
                        " 2 Ninja : " + ControlerPersonnages.ninja.getDescription() + "Stat : " + ControlerPersonnages.ninja.getPointsDeVie() +"Pv - "+ ControlerPersonnages.ninja.getForce() + "Force - "+ ControlerPersonnages.ninja.getArmure() +"Armure - "+ ControlerPersonnages.ninja.getChanceCrit() + "Crit chance "+
                "\n 3 = Sentinelle" );
    }
}