package com.exemple;
import java.util.Random;

//public class Joueur {
//    public String nom;
//    public int [] deck = new int [13];
//
//
//    public void jouer() {
//        System.out.println(nom + " Oh, c'est à moi!!!");
//    }
//
//    public int [] initDeck(){
//        for (int i = 0; i<13; i++){
//            Random random = new Random();
//            deck[i]=random.nextInt(13)+1;
//            //deck[i]= (int)(Math.random()*13)+1 ;
//        }
//        return deck;
//    }
//
//    public int tirerCarte() {
//       // System.out.println(nom + "");
//        //Random random = new Random();
//        //int carte = random.nextInt(13);
//        //return carte;
//        Random random = new Random();
//        int carteindex = random.nextInt(deck.length-1);
//        int carte = deck[carteindex];
//        return carte;
//    }
//}

public class Joueur {

    /* ***** Attributs ********/
    protected int nbCard;
    public String nom = "test";
    private int[] jeuDeCartes = new int[13];
    /* ***** Méthodes ********/
    public void initJeuCartes()
    {
        for(int i=0; i<jeuDeCartes.length;i++)
        {
            jeuDeCartes[i] = i+1; // [0] = 1 'As' [1] = 2 ...
        }
    }
    public int tirerUneCarte()
    {
        Random lRand = new Random();
        int lIndexAlea = lRand.nextInt(jeuDeCartes.length);
        return jeuDeCartes[lIndexAlea];
    }
}