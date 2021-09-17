package com.example.carddeck;

public class Card
{
    private Suit suit;
    private FaceValue value;

    public Card()
    {

    }

    public Card(Suit suit, FaceValue value)
    {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }

    public FaceValue getValue()
    {
        return value;
    }

    public void setValue(FaceValue value)
    {
        this.value = value;
    }

    @Override
    public String toString() {
        return  "{suit=" + suit +
                ", value=" + value +
                '}';
    }
}
