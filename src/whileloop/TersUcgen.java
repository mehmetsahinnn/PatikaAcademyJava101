package whileloop;
import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı giriniz: ");
        int basamakSayisi = scanner.nextInt();

        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
