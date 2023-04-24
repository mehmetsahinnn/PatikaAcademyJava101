package whileloop;

import java.util.Scanner;

public class ucuncuwhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Say Giriniz : ");
        int say = input.nextInt();
        int i;
        int j;

        for (i = 1; i <= say; i *= 4) {

            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (j = 1; j <= say; j *= 5) {

            System.out.print(j + " ");
        }
    }
}
