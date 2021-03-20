package L1_Working_with_Abstraction_Exercises.P3_Card_with_Power_2;

public enum CardSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    CardSuit(int value){
        this.getCardSuitValue = value;
    }

    public int getCardSuitValue;
}
