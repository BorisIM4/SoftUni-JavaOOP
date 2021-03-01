package P1_Working_with_Abstraction.P1_Phombus_of_Stars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //test
        int rhombusSize = Integer.parseInt(scanner.nextLine());

        //top side
        for (int row = 1; row <= rhombusSize; row++) {
            getUpwarTriangle(row, rhombusSize);
        }
        //bot side
        for (int row = 1; row < rhombusSize; row++) {
            getDownwarTriangle(row, rhombusSize);
        }
    }

    public static void getDownwarTriangle(int row, int size) {
        printElement(row, " ");
        printElement(size - row, "* ");
        printElement(row, " ");
        System.out.println();

    }

    public static void getUpwarTriangle(int row, int size){
        printElement(size - row, " ");
        printElement(row, "* ");
        printElement(size - row - 1, " ");
        System.out.println();
    }

    public static void printElement(int count, String element) {
        for (int i = 0; i < count; i++) {
            System.out.print(element);
        }
    }
}
