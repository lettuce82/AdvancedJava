public enum Suit {
    SPADES("Black"), HEARTS("Red"), DIAMONDS("Red"), CLUBS("Black");

    private String color;

    private Suit(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}