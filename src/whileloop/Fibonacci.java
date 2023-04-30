package whileloop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long ilk = 0;
        long iki = 1;
        long result;
        int currentStep = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fibonacci number of numbers : ");
        int step = sc.nextInt();


        System.out.print(step + " elemanlı fibonacci serisi : ");
//        System.out.print("0 ");
        while (currentStep<step){

            result=ilk+iki;
            ilk = iki;
            iki = result;
            System.out.print(ilk+" ");

            currentStep++;
        }


    }
}
