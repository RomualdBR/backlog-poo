import Objet.Arme.LongSabre;
import Objet.Potion.PotionDeVie;
import Personnage.Ennemie.Ashigaru;
import Personnage.Joueur;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Joueur joueur = new Joueur(".", 50, 10, 0, 0, 5, 10);
        LongSabre nodachi = new LongSabre("Nodachi", 1,"Long sabre japonais que l'on manipule à 2 mains","Rare",10, 10 );

        LongSabre longsabre = new LongSabre("Sabre rouillé", 1,"Sabre qui a déjà tranché et rouillé par le temps ", "Commun",0, 10);joueur.setForce(joueur.getForce() + nodachi.getDegat()) ;
        System.out.println(joueur.getForce());
        Ashigaru ashigaru = new Ashigaru("Gégé l'Ashigaru, spécial", 75, 12, 17, 5,
                "Soldat d'infanterie, souvent des paysans recruter en période de guerre.", 20);

        PotionDeVie potionDeVieCommun = new PotionDeVie("Potion de vie", 1, "Régénère la vie et rend 40 Pv", "Commun",
                40, 20);
        System.out.println(ashigaru.getPointsDeVie());
        potionDeVieCommun.makeDamage(ashigaru);
        System.out.println(ashigaru.getPointsDeVie());
        System.out.println(ashigaru.getPointsDeVie() + " : " +ashigaru.getArmure());
        joueur.makeDamage(ashigaru);
        System.out.println(ashigaru.getPointsDeVie());
        System.out.println(ashigaru.getArmure());

    }
}