import java.util.Scanner;

public class Hints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scoreCounter = 1;
        double sum = 4;

        for (int i = 2; i <= 10; i++) {
            sum += 6;
            scoreCounter++;
            double average = sum / scoreCounter;
            System.out.printf("For %d courses, average score is %.2f" ,i , average);
            System.out.println();
        }

    }
}
