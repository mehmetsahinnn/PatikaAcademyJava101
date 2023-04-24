package looplar;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        int yil = input.nextInt();

        String bur = null;

        switch (yil % 12) {
            case 0 -> bur = "Maymun";
            case 1 -> bur = "Horoz";
            case 2 -> bur = "Köpek";
            case 3 -> bur = "Domuz";
            case 4 -> bur = "Fare";
            case 5 -> bur = "Öküz";
            case 6 -> bur = "Tiger";
            case 7 -> bur = "Tavşan";
            case 8 -> bur = "Ejderha";
            case 9 -> bur = "Yılan";
            case 10 -> bur = "At";
            case 11 -> bur = "Koyun";
        }

        System.out.printf("Çin Zodyağı Burcunuz : %s%n", bur);
    }
}
