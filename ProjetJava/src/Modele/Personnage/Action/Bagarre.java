package Modele.Personnage.Action;
import Controler.*;
import Modele.Personnage.Ennemie.Ennemi;
import Modele.Personnage.Joueur;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import static Controler.ControlerArmes.potionDeVieCommun;
import static Controler.ControlerPersonnages.*;

public class Bagarre implements Serializable {
    private Joueur joueur;
    private Ennemi ennemi;

    /**
     * Initialise le joueur et l'ennemi, permet aussi d'utiliser plus facilement le joueur et l'ennemi
     * @param joueur
     * @param ennemi
     */
    public Bagarre(Joueur joueur, Ennemi ennemi) {
        this.joueur = joueur;
        this.ennemi = ennemi;
        commencerCombatBandit();
    }

    /**
     * Fonction de combat qui print les stats du joueur et de l'ennemie
     * Peut aussi imprimer et faire appels aux fonctions d'attaque et celle de l'inventaire
     * check aussi si le joueur ou l'ennemie meurt.
     */
    public void commencerCombatBandit() {
        //boucle while pour que le combat dure jusqu'à ce que l'un des deux soit morts
        while (joueur.getPointsDeVie() > 0 && ennemi.getPointsDeVie() > 0) {
            System.out.println("Joueur Stat : " + joueur.getPointsDeVie() + " Pv - " + joueur.getForce() + " Force - " + joueur.getArmure() + " Armure - " + joueur.getChanceCrit() + " Crit chance "
                    + "                                                          " +
                   ennemi.getNom()+ " Stat : " + ennemi.getPointsDeVie() + " Pv - " + ennemi.getForce() + " Force - " + ennemi.getArmure() + " Armure - " + ennemi.getChanceCrit() + " Crit chance ");
            //sert à demander aux joueurs ce qu'ils veulent faire, attaquer ou ouvrir l'inventaire
            System.out.println("Que voulez vous faire : \n 1 : Attaquer \n 2 : Ouvrir l'inventaire de potion \n Choix : ");
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            try {
                //pas besoin de comment ouvrir inventaire ou menu attaque plus que sa c'est assez explicite
                if (a == 1) {
                    menuAttaque();
                }
                if (a == 2) {
                    ouvrirInventaire();
                }
                else {
                    System.out.println("");
                }

            }catch (Exception e){
                System.out.println("Rentrer un chiffre");

            }
        }
    }

    /**
     * Attaque aléatoire chance de rater, se blesser, s'infliger un malus ou ne rien faire
     */
    public void attaqueDeLaRoulette(){
        double forceDeBase = joueur.getForce();
        critFonction();
        Random r = new Random();
        int n = r.nextInt(4);
        if(n == 0)
        {
            System.out.println("Vous avez glisser, vous êtes sérieux ?");
        }
        if(n == 1){
            joueur.setForce((int) (joueur.getForce()*1.8));
            System.out.println("Tiens vous avez infligé un sacré coup à l'ennemie par chance!");
            attaqueEnemie();
        }if(n == 2){
            joueur.setPointsDeVie((int) (joueur.getPointsDeVie() - 5));
            System.out.println("Dommage Vous avez perdu 5 points de vie en vous frappant vous même!" );
        }if (n == 3){
            joueur.setArmure((int)(joueur.getArmure() - 3));
            System.out.println("Dommage Vous avez perdu 3 points d'armure, vous avez faillis vous couper les doigts!!");
        }
        joueur.setForce((int) forceDeBase);
    }

    /**
     * fonction pour faire des coup critique a chaque attaque
     */
    public void critFonction(){
        //fonction random pour les chances de crit, qui prend du random en fonction des chances de crit du joueur
        Random r = new Random();
        int n = r.nextInt(joueur.getChanceCrit()+1);
        if(n==1){
            System.out.println("Coup critique!!");
            joueur.setForce((int) (joueur.getForce()*1.5));
        }
    }

    /**
     * Menu qui peut faire appel aux différentes attaques
     */
    public void menuAttaque(){
        System.out.println("1 : Coup Puissant (130% des dégats d'attaques) \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 2 : L'attaque de la roulette (Advienne que pourras)\n" +
                           "3 : Attaque de base \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t 4 : Attaque Vampirique (Soigne un peu et fait un peu moins de dégat\n" +
                "\n 5 : Revenir en arrière" +
                "Quel attaque choississez vous");
        try {
            Scanner scannewr = new Scanner(System.in);
            int a = scannewr.nextInt();
            if(a == 1){
                coupPuissant();
                defenseJoueur();
            }
            if(a == 2){
                attaqueDeLaRoulette();
                defenseJoueur();
            }
            if(a == 3){
                attaqueEnemie();
                defenseJoueur();
            }
            if(a == 4){
                attaqueVampyrique();
                defenseJoueur();
            }
            if(a == 5){
                commencerCombatBandit();
            }
        }catch (Exception e){
            System.out.println("Rentrer un chiffre");
        }
    }

    /**
     * Compétence de base qui augmente les dégats de 130%
     */
    public void coupPuissant(){
        double forceDeBase = joueur.getForce();
        critFonction();
        joueur.setForce((int) (joueur.getForce() * 1.3));
        attaqueEnemie();
        joueur.setForce((int) forceDeBase);
    }

    /**
     * Attaque qui régénère la santé du joueur
     */
    public void attaqueVampyrique(){
        double forceDeBase = joueur.getForce();
        critFonction();
        joueur.setForce((int)(joueur.getForce()*0.7));
        attaqueEnemie();
        joueur.setPointsDeVie((int) (joueur.getPointsDeVie()+15));;
        if(joueur.getPointsDeVie()>joueur.getVieMax()){
            joueur.setPointsDeVie(joueur.getVieMax());
        }if (joueur.getPointsDeVie() == joueur.getVieMax()) {
            System.out.println("Vous ne pouvez pas vous soignez si vous êtes full vie.");
        }
        joueur.setForce((int) forceDeBase);
    }

    /**
     * méthode qui est appeler à chaque compétences, sort la force du joueur dans les méthode d'attaque
     * pour pouvoir déduire les points de vie ennemie de la force du joueur
     */
    public void attaqueEnemie(){
        //méthode qui prend la force du joueur pour infliger des dégat à l'ennemie.
        ennemi.setPointsDeVie(ennemi.getPointsDeVie()+ennemi.getArmure());
        ennemi.setPointsDeVie(ennemi.getPointsDeVie()-joueur.getForce());
        double damageCalculator = joueur.getForce() - ennemi.getArmure();
        System.out.println("Vous avez infligez : " + damageCalculator + "points de dégat");
    }

    /**
     * Méthode qui permet à l'ennemie d'attaquer le joueur
     */
    public void defenseJoueur(){
        //sert à ce que l'ennemie nous attaque
        if (ennemi.getPointsDeVie() == 0 || ennemi.getPointsDeVie() <=0){
            System.out.println("Félicitation, vous avez gagnez le combat contre " + ennemi.getNom() + "!!");
        }
        if (joueur.getPointsDeVie()>0) {
            Random r = new Random();
            int n = r.nextInt(ennemi.getChanceCrit()+1);
            if(n==1) {
                System.out.println("Coup critique de l'ennemie !!");
                ennemi.setForce((int) (ennemi.getForce() * 1.5));
            }
            joueur.setPointsDeVie(joueur.getPointsDeVie() + joueur.getArmure());
            joueur.setPointsDeVie(joueur.getPointsDeVie() - ennemi.getForce());
            double damageCalculator = ennemi.getForce() - joueur.getArmure();
            System.out.println("Vous avez subis : " + damageCalculator + "points de dégat");
            if (joueur.getPointsDeVie() == 0 || joueur.getPointsDeVie() <=0){
               if (ennemi.getNom().equals("L'empereur Stefan, l'ingénieux informaticien")){
                   System.out.println("Vous avez perdu contre " + ennemi.getNom() + "!!");
                System.out.println("Mais courage, nous feront comme si nous n'avions rien vue.");
               }
            else{
                System.out.println("Vous avez perdu contre " + ennemi.getNom() + "!!");
                   System.out.println("Mais courage, nous feront comme si nous n'avions rien vue.");
               }
            }
        }
    }

    /**
     * Méthode qui permet de citer les potions, avoir leurs quantité, et description.
     * Et qui permet aussi de les utilisers
     */
    public void ouvrirInventaire() {
        System.out.println("1 : " + potionDeVieCommun.getNom() + " | Quantité : " + potionDeVieCommun.getQuantiter() + " | Description : " + potionDeVieCommun.getDescription());
        System.out.println("2 : " + ControlerArmes.potiondeforce.getNom() + "| Quantité : " + ControlerArmes.potiondeforce.getQuantiter() + " | Description : " + ControlerArmes.potiondeforce.getDescription());
        System.out.println("3 : " + ControlerArmes.potionarmure.getNom() + "| Quantité : " + ControlerArmes.potionarmure.getQuantiter() + " | Description : " + ControlerArmes.potionarmure.getDescription());
        System.out.println("Souhaitez vous utilisez une potion? Si oui choisissez entre 1 et 3 la quel, sinon entrer le chiffre 4 pour quitter.");

        //sert à choisir une potentielle potion à utiliser s'il y as une quantité intéressante
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
                commencerCombatBandit();
                // Code pour quitter
            } else {
                System.out.println("Veuillez choisir un nombre entre 1 et 4.");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Entrer un chiffre s'il vous plait");
            ouvrirInventaire();
        }
    }

    /**
     * permet d'utiliser la potion de vie et de rajouter des pv au joueurs sans dépasser le seuil maximal de pv
     */
    public void utiliserPotionDeVie() {
        try {
            playyy.setPointsDeVie(playyy.getPointsDeVie()+ potionDeVieCommun.getHeal());
            //sert à ne pas exceder les points de vie max qu'on as au début du combat
            if (playyy.getPointsDeVie() > playyy.getVieMax()) {
                playyy.setPointsDeVie(playyy.getVieMax());
                System.out.println("Vous vous êtes soigner de 40 Pv, vous avez maintenant : " +playyy.getPointsDeVie()+ "Pv.");
            }//vérifie qu'on est pas déjà full vie
            if (playyy.getPointsDeVie() == playyy.getVieMax()) {
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

    /**
     * méthode de potier d'armure qui augmente l'armure de façon permanente
     */
    public static void utiliserPotionArmure(){
        try {
            playyy.setArmure(playyy.getArmure() + ControlerArmes.potionarmure.getBonusArmure());

        } catch (Exception e){
            System.out.println("Erreur avec la potion d'armure");
        }
    }

    /**
     * potion de force qui augmente de façon permanente la force du joueur
     */
    public static void utiliserPotionDeForce(){
        try {
            playyy.setForce(playyy.getForce() + ControlerArmes.potiondeforce.getBonusForce());
        }catch (Exception e){
            System.out.println("Erreur avec la potion de force");
        }
        }

    /**
     * menu du jeu afficher lorsqu'on lance le code au début, qui permet de jouer, ou de charger
     * une sauvegarde, ainsi que de quitter et d'arrêter le code.
     */
    public static void menuDuJeu() {
        System.out.println("          ＴＨＥ　ＶＥＮＧＡＮＣＥ　ＯＦ　ＴＡＫＥＳＨＩ　ク永悪で  ");
        System.out.println("          ―――――――――――――――――――――――――――");
        System.out.println("             1. Jouer ");
        System.out.println("             2. Charger ");
        System.out.println("             3. Quitter");
        System.out.println("          ―――――――――――――――――――――――――――");
        System.out.println("Votre choix :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();


        if ( a == 1){
            debutHistoire();
        }
        if ( a == 2) {
            chargerSauvegarde();
        } if ( a == 3) {
            System.out.println("Vous avez quitté le jeu 'The vengance of TAKESHI'");
            System.exit(0);
        }

    }

    /**
     * Suposer charger la sauvegarde
     */
    public static void chargerSauvegarde() {
        Bagarre bagarreChargee = Bagarre.charger("sauvegarde1.txt");
        if (bagarreChargee != null) {
            bagarreChargee.commencerCombatBandit();
        }
    }
    /**
     * Permet de print plusieurs ligne qui sert à l'histoire limitant le flood du main
     */
    public static void debutHistoire() {
        System.out.println("Il était une fois, dans le Japon ancien, un jeune homme du nom de Takeshi vivait paisiblement dans le village au côté de sa tendre mère");
        System.out.println("Sa vie paisible fut bouleversée lorsqu'un groupe de bandits, engagés par l'empereur lui-même attaqua sa mère et la TUA !");
       try{
           Thread.sleep(4000);
       }catch(Exception e){
           System.out.println("");
       }
        System.out.println("Impuissant face à cette scène macabre, Takeshi parvient à tuer l'un des 5 bandits et s'enfuit. ");
        System.out.println("Nourrit par la haine et le soif de vengance, Takeshi décida de se lancer dans une quête pour devenir un monstre redoutable et affronter ceux qui avaient pris la vie de sa mère. \n");
        try{
            Thread.sleep(8000);
        }catch(Exception e){
            System.out.println("");
        }


    }


    /**
     * senser sauvegarder mais ne fonctionne pas
     * @param nomFichier
     */
    public void sauvegarder(String nomFichier) {
        try (ObjectOutputStream sortie = new ObjectOutputStream(new FileOutputStream(nomFichier))) {
            sortie.writeObject(this);
            System.out.println("Sauvegarde réussie !");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * charge la sauvegarde
     * @param nomFichier
     * @return
     */
    public static Bagarre charger(String nomFichier) {
        try (ObjectInputStream entree = new ObjectInputStream(new FileInputStream(nomFichier))) {
            Bagarre bagarre = (Bagarre) entree.readObject();
            System.out.println("Chargement réussi !");
            return bagarre;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}
