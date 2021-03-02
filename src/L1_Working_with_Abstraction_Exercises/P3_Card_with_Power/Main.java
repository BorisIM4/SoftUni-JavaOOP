package L1_Working_with_Abstraction_Exercises.P3_Card_with_Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cardRank = scanner.nextLine();
        String cardtSuit = scanner.nextLine();

        Card card = new Card(CardRank.valueOf(cardRank),
                CardSuit.valueOf(cardtSuit));

        System.out.println(card.toString());

    }
}
