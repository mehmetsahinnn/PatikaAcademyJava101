package looplar;

import java.util.Scanner;

public class SınıfGeçme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Mat: ");
        int mat = input.nextInt();
        System.out.print("Fizik: ");
        int fizik = input.nextInt();
        System.out.print("Türkçe: ");
        int turkce = input.nextInt();
        System.out.print("Kimya: ");
        int kimya = input.nextInt();
        System.out.print("Müzik: ");
        int muzik = input.nextInt();

        int count = 0;
        int sum = 0;
        int[] grades = {mat, fizik, turkce, kimya, muzik};

        for (int grade : grades) {
            if (100 > grade && grade > 0) {
                sum += grade;
                count++;
            }
        }

        //test
        System.out.println(sum/count);
    }
}

