package L1_Working_with_Abstraction_Exercises.P4_Traffic_Lights_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lightTokens = scanner.nextLine().split("\\s+");
        int numberOfRotation = Integer.parseInt(scanner.nextLine());

        State state = new State(lightTokens);

        state.rotateNTimes(numberOfRotation);
    }
}
