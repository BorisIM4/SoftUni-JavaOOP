package L1_Working_with_Abstraction_Exercises.P1_Card_Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardSuit[] cardsValues = CardSuit.values();

        System.out.println("Card Suits:");
        for (CardSuit card : cardsValues) {
            int ordinal = card.ordinal();
            String name = card.name();
            System.out.println(String.format("Ordinal value: %d; Name value: %s" ,
                    ordinal,
                    name));
        }

    }
}
