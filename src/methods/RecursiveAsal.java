package methods;

import java.util.Scanner;

public class RecursiveAsal {
    static boolean recursive(int say, int div) {
        if (div == 1) {
            return true;
        } else {
            if (say % div == 0) {
                return false;
            } else {
                return recursive(say, div - 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int say = 0;
        while (say != -1) {
            System.out.print("Say giriniz : ");
            say = scanner.nextInt();
            if (recursive(say, say - 1)) {
                System.out.println(say + " asal bir sayidır.");
            } else {
                System.out.println(say + " asal bir say değildir.");
            }
        }
    }
}