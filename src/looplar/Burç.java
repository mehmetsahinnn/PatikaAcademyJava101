package looplar;

import java.util.Scanner;

public class Burç {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum günü: ");
        int day = input.nextInt();
        System.out.print("Doğum ayı: ");
        int month = input.nextInt();

        String burc = "";

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            burc = "Kova";
        } else if (month == 2 || month == 3 && day <= 20) {
            burc = "Balık";
        } else if (month == 3 || month == 4 && day <= 19) {
            burc = "Koç";
        } else if (month == 4 || month == 5 && day <= 20) {
            burc = "Boğa";
        } else if (month == 5 || month == 6 && day <= 21) {
            burc = "İkizler";
        } else if (month == 6 || month == 7 && day <= 22) {
            burc = "Yengeç";
        } else if (month == 7 || month == 8 && day <= 22) {
            burc = "Aslan";
        } else if (month == 8 || month == 9 && day <= 22) {
            burc = "Başak";
        } else if (month == 9 || month == 10 && day <= 22) {
            burc = "Terazi";
        } else if (month == 10 || month == 11 && day <= 21) {
            burc = "Akrep";
        } else if (month == 11 || month == 12 && day <= 21) {
            burc = "Yay";
        } else if (month == 12 || month == 1) {
            burc = "Oğlak";
        }

        System.out.println("Burcunuz: " + burc);
    }

}
