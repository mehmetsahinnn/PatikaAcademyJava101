package Diger;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MineSweeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of columns : ");
        int columns = scanner.nextInt();
        System.out.print("Enter number of rows : ");
        int rows = scanner.nextInt();
        int mines = (columns * rows) / 4;
        boolean game = true;

        String[][] arr = new String[rows][columns];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == null) {
                    arr[i][j] = "-";
                }
            }
        }


        System.out.println("Mine Field : ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int mine_row;
        int mine_column;
        for (int m = 0; m < mines; m++) {
            System.out.print("Enter number of mine_row : ");
            mine_row = scanner.nextInt();
            System.out.print("Enter number of mine_column : ");
            mine_column = scanner.nextInt();

            arr[mine_row][mine_column] = "x";
        }

        while (game) {


            System.out.print("column number : ");
            int sut = scanner.nextInt();
            System.out.print("row number : ");
            int sat = scanner.nextInt();


            if (Objects.equals(arr[sat][sut], "x")) {
                System.out.println("GAME OVER !");
                game = false;


            } else {
                if (Objects.equals(arr[sat][sut], "-")) {
                    int count = 0;
                    for (int i = Math.max(0, sat - 1); i <= Math.min(arr.length - 1, sat + 1); i++) {
                        for (int j = Math.max(0, sut - 1); j <= Math.min(arr[0].length - 1, sut + 1); j++) {
                            if (i != sat || j != sut) {
                                if (Objects.equals(arr[i][j], "x")) {
                                    count++;
                                }
                            }
                        }
                    }
                    arr[sat][sut] = String.format("%d", count);
                }
            }

            System.out.println("Mine Field : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    String value = arr[i][j];
                    if (Objects.equals(value, "x") && (i != sat || j != sut)) {
                        value = "-";
                    }
                    System.out.print(value + " ");
                }
                System.out.println();
            }

            boolean hasDash = false;
            for (String[] row : arr) {
                for (String value : row) {
                    if (value.equals("-")) {
                        hasDash = true;
                        break;
                    }
                }
                if (hasDash) {
                    break;
                }
            }
            if (!hasDash) {
                System.out.println("Congratulations! You have cleared the minefield.");
                game = false;
            }
        }
    }
}
