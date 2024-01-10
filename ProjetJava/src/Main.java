import Controler.ControlerArmes;
import Controler.ControlerPersonnages;
import Personnage.Classe.Samurai;

import static Controler.ControlerArmes.*;
import static Controler.ControlerPersonnages.*;
public class Main {
    public static void main(String[] args) {

        ControlerArmes.initArmes();
        ControlerPersonnages.initPersonnages();
        Personnage.Classe.Samurai samurai = Samurai;
        System.out.println(Samurai.getForce());
        samurai.setArmeEquiper(kunai);
        System.out.println(Samurai.getForce());
        samurai.retirerArme();
        System.out.println(Samurai.getForce());
        samurai.setArmeEquiper(ninjato);
        System.out.println(Samurai.getForce());



    }
}