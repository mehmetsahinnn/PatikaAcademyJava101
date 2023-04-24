package looplar;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe : ");
        int yol = input.nextInt();
        int fiyat = (int) (yol * 0.1);

        System.out.print("Yaş : ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int tip = input.nextInt();


        if (yas < 12) {
            fiyat = fiyat / 2;
            if (tip == 2) {
                fiyat = (int) (fiyat * (0.8));
                fiyat *= 2;
            }
        } else if (12 < yas && yas < 24) {
            fiyat = (int) (fiyat * (0.9));
            if (tip == 2) {
                fiyat = (int) (fiyat * (0.8));
                fiyat *= 2;
            }
        } else if (65 < yas) {
            fiyat = (int) (fiyat * (0.7));
            if (tip == 2) {
                fiyat = (int) (fiyat * (0.8));
                fiyat *= 2;
            }
        }

        if (tip < 1 || tip > 2 || yol < 0 || yas < 0) {
            System.out.println("Hatalı veri  girdiniz ! ");
        } else {
            String result = "Toplam tutar: %d".formatted(fiyat);
            System.out.println(result);
        }
    }
}
