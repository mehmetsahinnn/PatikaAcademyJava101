package whileloop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class minma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int number;

        while (true) {
            System.out.print("Enter a number to add to the array (0 to exit): ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            list.add(number);
        }

        Collections.sort(list);

        System.out.println("Array contents: " + list);
        System.out.println("Min is: " + list.get(0));
        System.out.println("Max is: " + list.get(list.size()-1));
    }
}

