package L1_Working_with_Abstraction_Exercises.P1_Card_Suit_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CardSuits[] values = CardSuits.values();

        System.out.println("Card Suits:");
        for (CardSuits card : values) {
            System.out.printf("Ordinal value: %d; Name value: %s%n" ,card.ordinal(), card.name());
        }
    }
}
