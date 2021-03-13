package L1_Working_with_Abstraction_Exercises.P5_Jedi_Galaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] matrixDimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int matrixRows = matrixDimestions[0];
        int matrixColums = matrixDimestions[1];

        int[][] matrix = new int[matrixRows][matrixColums];

        int value = 0;
        for (int row = 0; row < matrixRows; row++) {
            for (int colum = 0; colum < matrixColums; colum++) {
                matrix[row][colum] = value++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] goodPLayerPossition = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPLayerPossition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilPlayerRow = evilPLayerPossition[0];
            int evilPLayerColum = evilPLayerPossition[1];

            while (evilPlayerRow >= 0 && evilPLayerColum >= 0) {
                if (isInBounds(matrix, evilPlayerRow, evilPLayerColum)) {
                    matrix[evilPlayerRow][evilPLayerColum] = 0;
                }

                evilPlayerRow--;
                evilPLayerColum--;
            }

            int goodPlayerRow = goodPLayerPossition[0];
            int goodPlayerColum = goodPLayerPossition[1];

            while (goodPlayerRow >= 0 && goodPlayerColum < matrix[1].length) {
                if (isInBounds(matrix, goodPlayerRow, goodPlayerColum)) {
                    sum += matrix[goodPlayerRow][goodPlayerColum];
                }

                goodPlayerColum++;
                goodPlayerRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static boolean isInBounds(int[][] matrix, int evilPlayerRow, int evilPLayerColum) {
        return evilPlayerRow >= 0 && evilPlayerRow < matrix.length && evilPLayerColum >= 0 && evilPLayerColum < matrix[0].length;
    }
}
