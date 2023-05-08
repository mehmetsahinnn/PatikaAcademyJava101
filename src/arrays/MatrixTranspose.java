package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of columns:");
        int columns = scanner.nextInt();
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();

        int[][] arr = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original array:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int[][] transposedArr = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                transposedArr[i][j] = arr[j][i];
            }
        }

        System.out.println("Transposed array:");
        for (int i = 0; i < columns; i++) {
            System.out.println(Arrays.toString(transposedArr[i]));
        }
    }
}
