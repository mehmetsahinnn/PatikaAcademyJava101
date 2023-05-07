package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinToMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int say = scanner.nextInt();

        int[] arr = new int[say];
        int count = 0;

        while (count != say) {
            System.out.print("Enter " + (count + 1) + "." + " number : ");
            int inp = scanner.nextInt();
            arr[count] = inp;

            count++;
        }



        Arrays.sort(arr);

        System.out.println("Array in ascending order: " + Arrays.toString(arr));

    }
}
