package com.testEnum;

public class Voiture {
    private String marque;

    //constructeur sans parametre
    public Voiture() {
        //appel d'un autre constructeur
        this("Fiat");
    }

    //constructeur surcharge
    public Voiture(String marque) {
        //du cou toutes les constructeurs passeront par ici
        this.marque = marque;
    }

    //constructeur par recopie
    public Voiture(Voiture voitureCopie) {
        this(voitureCopie.marque);
    }

    public void display() {
        System.out.println(this.marque);
    }

}
