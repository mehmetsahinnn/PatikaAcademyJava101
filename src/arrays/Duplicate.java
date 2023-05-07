package arrays;

import java.util.Arrays;


public class Duplicate {
    public static void main(String[] args) {
        int[] list = {1,2,3,8,8,9,4,54,3,456,341,829,829};
        list = Arrays.stream(list).sorted().toArray();
        System.out.println(Arrays.toString(list));

        System.out.print("Duplicates are : ");
        for (int i = 1; i < list.length; i++) {
            if (list[i-1] == list[i]) {
                System.out.print(list[i]+" ");
            }
        }
    }
}
