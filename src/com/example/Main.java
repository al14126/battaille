package com.example;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("John");
        System.out.println(player1.getName());
        Card card1 = new Card(Card.Name.ACE, Card.Color.SPADE);
        System.out.println(card1.getName() + " of " + card1.getColor() + " (valeur = " + card1.getValue() + ")");
    }
}