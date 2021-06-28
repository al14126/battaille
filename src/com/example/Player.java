package com.example;
import com.testEnum.Voiture;

import java.util.Random;

public class Player {
    /** atributs **/
    private String name;
    private Deck deck;

    /** méthodes **/
    public Card pullCard() {
        return deck.pullTopCard();
    }

    public void initCards(int nbCardsInDeck) {
    }

    /** getters and setters **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    /** constructeur **/
    //constructeur sans parametre
    public Player() {
        //appel d'un autre constructeur
        this("John Doe");
    }

    //constructeur surcharge
    public Player(String name) {
        //du cou toutes les constructeurs passeront par ici
        this.name = name;
    }

    //constructeur par recopie
    public Player(Player playerCopie) {
        this(playerCopie.name);
    }

    public void display() {
        System.out.println(this.name);
    }
}