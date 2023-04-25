package whileloop;

import java.util.Scanner;

public class sayidegerleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n Giriniz : ");
        int n = input.nextInt();

        int top = 0;

        while (n > 0) {
            int tek = n % 10;
            n = n / 10;
            top += tek;
        }
        System.out.println(top);
    }
}
