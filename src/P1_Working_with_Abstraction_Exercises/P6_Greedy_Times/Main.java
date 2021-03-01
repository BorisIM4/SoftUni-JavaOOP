package P1_Working_with_Abstraction_Exercises.P6_Greedy_Times;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] input = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(bagCapacity);

        for (int i = 0; i < input.length; i += 2) {
            String item = input[i];
            long quantity = Long.parseLong(input[i + 1]);

            if (item.length() == 3) {
                //add cash to bag
                bag.addCash(item, quantity);
            } else if (item.toLowerCase().endsWith("gem")) {
                // add gems to bag
                bag.addGems(item, quantity);
            } else if (item.toLowerCase().equals("gold")) {
                // add gold to bag
                bag.addGold(quantity);
            }
        }

        bag.printContent();
    }
}