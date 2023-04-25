package whileloop;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("n Giriniz : ");
        int n = input.nextInt();
        System.out.print("r Giriniz : ");
        int r = input.nextInt();

        if (r < 0 || r > n) {
            System.out.println("Invalid input. n and r must be non-negative integers, and r must be less than or equal to n.");
            return;
        }

        int result_n = 1;
        int result_r = 1;
        int result_n_r = 1;
        int difference = n-r;


        while (n != 0 && r != 0 && difference != 0) {

            result_n *= n;
            n--;

            result_r *= r;
            r--;

            result_n_r *= difference;
            difference--;
        }
        System.out.println(result_n/(result_r*result_n_r));
    }
}
