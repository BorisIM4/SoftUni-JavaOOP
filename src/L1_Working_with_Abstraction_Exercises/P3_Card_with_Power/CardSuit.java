package L1_Working_with_Abstraction_Exercises.P3_Card_with_Power;

public enum CardSuit {
    //CLUBS - 0, DIAMONDS - 13, HEARTS - 26, SPADES - 39
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int value;

    CardSuit(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
