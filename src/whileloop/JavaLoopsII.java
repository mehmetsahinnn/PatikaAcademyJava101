package whileloop;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stepSize = in.nextInt();
        for (int i = 0; i < stepSize; i++) {
            System.out.print("Enter a , b , n : ");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = 0;

            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;

                System.out.print(sum + a + " ");
            }
            System.out.println();

        }

        in.close();
    }
}
