package com.exemple;

import com.example.Joueur;

public class Main {
    public static void main(String[] args) {
        com.example.Joueur leJoueur2 = new Joueur();
        leJoueur2.nom = "Missy";
        leJoueur2.initJeuCartes();
        System.out.println(leJoueur2.nom + " tire la carte " +
                leJoueur2.tirerUneCarte() + ".");
    }
}