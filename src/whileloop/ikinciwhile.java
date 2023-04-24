package whileloop;

import java.util.Scanner;

public class ikinciwhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Say Giriniz : ");
        int say = input.nextInt();
        int sum=0;

        while (say % 2 != 1) {
            if (say % 4 == 0) {
                sum +=say;
            }
            System.out.print("Say Giriniz : ");
            say = input.nextInt();
        }
        System.out.println("4'ün katları olan çift sayıların toplamı: " + sum);
    }
}
