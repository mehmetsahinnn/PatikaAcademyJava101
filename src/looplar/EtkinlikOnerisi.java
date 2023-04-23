package looplar;

import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen sıcaklık değerini giriniz: ");
        int sicaklik = input.nextInt();

        String etkinlik =
                sicaklik < 5 ? "Kayak yapabilirsiniz." : sicaklik < 15 ? "Sinemaya gidebilirsiniz." : sicaklik < 25 ? "Piknik yapabilirsiniz." : "Yüzmeye gidebilirsiniz.";

        System.out.println(etkinlik);
    }
}