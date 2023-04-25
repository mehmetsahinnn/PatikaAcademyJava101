package whileloop;

import java.util.Scanner;

public class uslu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("alt Giriniz : ");
        long n = input.nextLong();
        System.out.print("üs Giriniz : ");
        long r = input.nextLong();

        long result = 1;

        for (long i = r; r > 0; r--) {

            result *= n;

        }
        System.out.println(result);
    }
}
