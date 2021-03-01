package P1_Working_with_Abstraction_Exercises.P2_Card_Rank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardRank[] cardsRank = CardRank.values();

        System.out.println("Card Ranks:");
        for (CardRank card : cardsRank) {
            int ordinal = card.ordinal();
            String name = card.name();
            System.out.println(String.format("Ordinal value: %d; Name value: %s" ,
                    ordinal,
                    name));
        }

    }
}
