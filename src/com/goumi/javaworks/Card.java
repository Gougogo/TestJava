package com.goumi.javaworks;

import java.util.Objects;

public class Card{
    public int rank;
    public String suit;
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // o如果是null对象，或者o不是Card的子类
        if (o == null || !(o instanceof Card)) return false;
        Card card = (Card) o;
        return rank == card.rank && Objects.equals(suit, card.suit);
    }
}

class Main{
    public static void main(String[] args){
        Card c1 = new Card(1, "♠");
        Card c2 = new Card(1, "♠");;
        System.out.println(c1 .equals (c2) );
    }
}