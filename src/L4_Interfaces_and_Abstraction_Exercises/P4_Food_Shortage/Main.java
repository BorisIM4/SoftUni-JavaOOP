package L4_Interfaces_and_Abstraction_Exercises.P4_Food_Shortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"<name> <age> <id> <birthdate>"
        //"<name> <age><group>"

        List<Citizen> citizens = new ArrayList<>();
        List<Rebel> rebels = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            int numberOfElementsInToken = tokens.length;
            switch (numberOfElementsInToken) {
                case 4:
                    int ageCitizen = Integer.parseInt(tokens[1]);
                    Citizen citizen = new Citizen(tokens[0], ageCitizen, tokens[2], tokens[3]);
                    citizens.add(citizen);
                    break;
                case 3:
                    int ageRebel = Integer.parseInt(tokens[1]);
                    Rebel rebel = new Rebel(tokens[0],ageRebel, tokens[2]);
                    rebels.add(rebel);
                    break;
            }
        }

        fillLists(scanner, citizens, rebels);

        int food = 0;
        for (Citizen citizen : citizens) {
            food += citizen.getFood();
        }
        for (Rebel rebel : rebels) {
            food += rebel.getFood();
        }
        System.out.println(food);


    }

    private static void fillLists(Scanner scanner, List<Citizen> citizens, List<Rebel> rebels) {
        String line = "";
        while (!"End".equals(line = scanner.nextLine())) {
            String nameOfPersonBuyer = line;

            boolean flag = false;
            flag = isCitizen(citizens, nameOfPersonBuyer, flag);
            if (flag){
                continue;
            }
            isRebel(rebels, nameOfPersonBuyer);
        }
    }

    private static void isRebel(List<Rebel> rebels, String nameOfPersonBuyer) {
        for (Rebel rebel : rebels) {
            String nameRebel = rebel.getName();
            if (nameRebel.equals(nameOfPersonBuyer)) {
                rebel.buyFood();
                break;
            }
        }
    }

    private static boolean isCitizen(List<Citizen> citizens, String nameOfPersonBuyer, boolean flag) {
        for (Citizen citizen : citizens) {
            String name = citizen.getName();
            if (name.equals(nameOfPersonBuyer)) {
                citizen.buyFood();
                flag = true;
                break;
            }
        }
        return flag;
    }
}
