package looplar;

import java.util.Scanner;

public class Yil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();

        boolean isLeapYear = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d bir artık yıldır !", yil);
        } else {
            System.out.printf("%d bir artık yıl değildir !", yil);
        }
    }
}
