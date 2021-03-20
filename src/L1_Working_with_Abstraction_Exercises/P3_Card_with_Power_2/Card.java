package L1_Working_with_Abstraction_Exercises.P3_Card_with_Power_2;

public class Card {
    private String suit;
    private String rank;
    private int power;

    public Card (String rank, String suit){
        this.setRank(rank);
        this.setSuit(suit);
        this.setPower(suit, rank);
    }

    private void setSuit(String suit) {
        this.suit = suit;
    }

    private void setRank(String rank) {
        this.rank = rank;
    }

    private void setPower(String suit, String rank){
        CardSuit cardSuit = CardSuit.valueOf(suit);
        int getCardSuitValue = cardSuit.getCardSuitValue;
        CardRank cardRank = CardRank.valueOf(rank);
        int getCardRankValue = cardRank.getCardRankValue;

        this.power = getCardSuitValue + getCardRankValue;

    }

    public String getSuit() {
        return this.suit;
    }

    public String getRank() {
        return this.rank;
    }

    public int getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d" ,getRank(), getSuit(), getPower());
    }
}
