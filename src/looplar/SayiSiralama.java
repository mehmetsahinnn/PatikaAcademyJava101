package looplar;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SayiSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Birinci Sayı: ");
        int bir = input.nextInt();

        System.out.print("İkinci Sayı: ");
        int iki = input.nextInt();

        System.out.print("Üçüncü sayı: ");
        int uc = input.nextInt();


        int [] numbers = {bir,iki,uc};
        Arrays.sort(numbers);

        for (int number:numbers){
            System.out.print(number + " ");
        }

    }
}
