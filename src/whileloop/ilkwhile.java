package whileloop;

import java.util.Scanner;

public class ilkwhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Say Giriniz : ");
        int say = input.nextInt();
        int i = 0;
        int sum = 0;
        int count = 0;

        while (i<say){

            if (i%3==0 && i%4==0){
                sum += i;
                count++;
            }
            i++;
        }
        System.out.println(sum/count);
    }
}
