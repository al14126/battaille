package com.example;



public class Card {

    public enum Color {
        SPADE, CLUB, HEART, DIAMOND
    }

    public enum Name {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    private int value;
    private Color color;
    private Name name;

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public Name getName() {
        return name;
    }

    public Card(Name name, Color color) {
        this.name = name;
        this.color = color;
        switch (this.name) {
            case ACE -> this.value = 14;
            case TWO -> this.value = 2;
            case THREE -> this.value = 3;
            case FOUR -> this.value = 4;
            case FIVE -> this.value = 5;
            case SIX -> this.value = 6;
            case SEVEN -> this.value = 7;
            case EIGHT -> this.value = 8;
            case NINE -> this.value = 9;
            case TEN -> this.value = 10;
            case JACK -> this.value = 11;
            case QUEEN -> this.value = 12;
            case KING -> this.value = 13;
        }
    }

}
