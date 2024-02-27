public class Card {
    private int number;
    private Suit suit;

    public Card(int number, Suit suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        String faceValue;
        if (number == 11) faceValue = "J";
        else if (number == 12) faceValue = "Q";
        else if (number == 13) faceValue = "K";
        else if (number == 14) faceValue = "A";
        else faceValue = String.valueOf(number);

        return faceValue + " of " + suit.getColor() + " " + suit;
    }
}



