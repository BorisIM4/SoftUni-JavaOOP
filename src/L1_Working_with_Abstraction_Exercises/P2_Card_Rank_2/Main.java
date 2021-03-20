package L1_Working_with_Abstraction_Exercises.P2_Card_Rank_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Card Ranks:");
        CardRank[] cardRanks = CardRank.values();
        for (CardRank cardRank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n" ,cardRank.ordinal() ,cardRank.name());
        }
    }
}
