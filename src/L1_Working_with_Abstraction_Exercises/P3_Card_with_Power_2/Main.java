package L1_Working_with_Abstraction_Exercises.P3_Card_with_Power_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        Card card = new Card(rank, suit);
        System.out.println(card.toString());

    }
}
