package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.print("Girilen Sayı : ");
        Scanner scanner = new Scanner(System.in);
        int say = scanner.nextInt();
        int minMax = 0;
        int maxMin = 0;

        list = Arrays.stream(list).sorted().toArray();
        System.out.println(Arrays.toString(list));

        for (int i : list) {
            if (i < say) {
                minMax = i;
            }
            if (i > say) {
                maxMin = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minMax);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxMin);
    }

}
