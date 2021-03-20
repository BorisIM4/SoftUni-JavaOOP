package L1_Working_with_Abstraction_Exercises.P6_Greedy_Times_2;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long vhod = Long.parseLong(scanner.nextLine());
        String[] seif = scanner.nextLine().split("\\s+");

        var bag = new LinkedHashMap<String, LinkedHashMap<String, Long>>();
        long gold = 0;
        long stone = 0;
        long money = 0;

        for (int i = 0; i < seif.length; i += 2) {
            String name = seif[i];
            long value = Long.parseLong(seif[i + 1]);

            String input = "";

            if (name.length() == 3) {
                input = "Cash";
            } else if (name.toLowerCase().endsWith("gem")) {
                input = "Gem";
            } else if (name.toLowerCase().equals("gold")) {
                input = "Gold";
            }

            if (input.equals("")) {
                continue;
            } else if (vhod < bag.values().stream().map(Map::values).flatMap(Collection::stream).mapToLong(e -> e).sum() + value) {
                continue;
            }

            switch (input) {
                case "Gem":
                    if (!bag.containsKey(input)) {
                        if (bag.containsKey("Gold")) {
                            if (isValueBigger(bag, value)) continue;
                        } else {
                            continue;
                        }
                    } else if (isGold(bag, value, input, "Gold")) {
                        continue;
                    }
                    break;
                case "Cash":
                    if (!bag.containsKey(input)) {
                        if (bag.containsKey("Gem")) {
                            if (isValueBigger(bag, value)) continue;
                        } else {
                            continue;
                        }
                    } else if (isGold(bag, value, input, "Gem")) {
                        continue;
                    }
                    break;
            }

            if (!bag.containsKey(input)) {
                bag.put((input), new LinkedHashMap<String, Long>());
            }

            if (!bag.get(input).containsKey(name)) {
                bag.get(input).put(name, 0L);
            }


            bag.get(input).put(name, bag.get(input).get(name) + value);
            if (input.equals("Gold")) {
                gold += value;
            } else if (input.equals("Gem")) {
                stone += value;
            } else if (input.equals("Cash")) {
                money += value;
            }
        }

        for (var x : bag.entrySet()) {
            Long sumValues = x.getValue().values().stream().mapToLong(l -> l).sum();

            System.out.println(String.format("<%s> $%s", x.getKey(), sumValues));

            x.getValue().entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));

        }
    }

    private static boolean isGold(LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long value, String input, String gold) {
        return bag.get(input).values().stream().mapToLong(e -> e).sum() + value > bag.get(gold).values().stream().mapToLong(e -> e).sum();
    }

    private static boolean isValueBigger(LinkedHashMap<String, LinkedHashMap<String, Long>> bag, long value) {
        if (value > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
            return true;
        }
        return false;
    }
}