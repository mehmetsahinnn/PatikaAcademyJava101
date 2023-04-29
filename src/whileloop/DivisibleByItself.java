package whileloop;

import java.util.Scanner;

public class DivisibleByItself {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Press 1 : ");
        int say = scan.nextInt();
        String output;

        String numString;
        char[] digits;



        while (say != -1) {
            System.out.print("Enter a number : ");
            say = scan.nextInt();
            numString = Integer.toString(say);
            digits = numString.toCharArray();
            if (say==-1){
                    break;
                }
            for (char digit : digits) {
                int num = Character.getNumericValue(digit);

                if (say % num != 0) {
                    output = String.format("%s Mükemmel sayı değildir", say);
                    System.out.println(output);
                    break;
                } else {
                    output = String.format("%s Mükemmel sayıdır", say);
                    System.out.println(output);
                    break;
                }

            }
        }
    }
}
