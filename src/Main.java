import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[] {12, 320, 130, 440, 50, 170};
        System.out.print("Numbers are: ");
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
        System.out.println();

        int[] sortedNumbers = bubbleSort(numbers);
        System.out.print("Sorted numbers are: ");
        Arrays.stream(sortedNumbers).forEach(n -> System.out.print(n + " "));
        System.out.println();



        while (true) {
            System.out.println("Enter number: ");
            String input = "";
            if ("end".equals(input = scanner.nextLine())) {
                break;
            }
            int usernumber = Integer.parseInt(input);
            int indexOfFoundValue = binarySearch(sortedNumbers, usernumber);

            isFound(indexOfFoundValue, usernumber);
        }
    }

    private static void isFound(int indexOfFoundValue, int number) {
        if (indexOfFoundValue < 0) {
            System.out.println("Number was not found!");
        } else {
            System.out.printf("Number %d was found ot position %d%n" ,number ,indexOfFoundValue);
        }

    }

    private static int binarySearch(int[] sortedNumbers, int number) {
        int startIndex = 0;
        int endIndex = sortedNumbers.length - 1;

        while (startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex) / 2;
            int midIndexValue = sortedNumbers[midIndex];

            if (number == midIndexValue) {
                return midIndex;
            } else if (number < midIndexValue) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }

        }

        return -1;
    }

    private static int[] bubbleSort(int[] numbers) {
        int[] sortedNumbers = numbers;

        for (int i = 0; i < sortedNumbers.length; i++) {
            for (int j = 1; j < sortedNumbers.length - i; j++) {

                if (sortedNumbers[j - 1] > sortedNumbers[j]) {

                    int currentNumber = sortedNumbers[j - 1];
                    sortedNumbers[j - 1] = sortedNumbers[j];
                    sortedNumbers[j] = currentNumber;
                }

            }
        }

        return sortedNumbers;
    }
}
