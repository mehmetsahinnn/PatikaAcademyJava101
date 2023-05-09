package Diger;

import java.util.Scanner;

public class PalindromKelime {

    static void Palindrome(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Word : ");
        String kel = scanner.nextLine();
        boolean flag = false;

        char[] charArray = kel.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            flag = charArray[i] == charArray[charArray.length - i - 1];
        }

        if (flag){
            System.out.println("Palindrome Word");
        }
        else System.out.println("Not a Palindrome Word");
    }

    public static void main(String[] args) {
        Palindrome();
    }
}
