package com.example;

//public class Main {
//
//    public static void main(String [] args) {
//        Joueur joueur1 = new Joueur();
//        Joueur joueur2 = new Joueur();
//
//        //modif d'attribut
//        joueur1.nom = "Jo";
//        joueur2.nom = "Missy";
//
//
//        //appel de methodes
//        joueur1.jouer();
//        joueur2.jouer();
//
//        //nouvelle modif d'attribut
//        joueur1.nom += " Lafripouille ";
//
//        //nouvelle appel de methode
//        //joueur2.tirerCarte();
//       // joueur1.tirerCarte();
//
//
//        joueur1.initDeck();
//        joueur2.initDeck();
//        for(int i = 0; i<13;i++){
//            System.out.print(joueur1.deck[i]+", ");
//        }
//        System.out.println();
//        for(int i = 0; i<13;i++){
//            System.out.print(joueur2.deck[i]+", ");
//        }
//        System.out.println();
//        joueur1.jouer();
//        int carte1 = joueur1.tirerCarte();
//        System.out.println(carte1);
//        joueur2.jouer();
//        int carte2 = joueur2.tirerCarte();
//        System.out.println(carte2);
//
//    }
//
//}

public class Main {
    public static void main(String[] args) {
        Joueur leJoueur1 = new Joueur();
        leJoueur1.setNom("Jean");
        leJoueur1.initJeuCartes();
        System.out.println(leJoueur1.getNom() + " tire la carte " + leJoueur1.tirerUneCarte() + ".");
    }
}
