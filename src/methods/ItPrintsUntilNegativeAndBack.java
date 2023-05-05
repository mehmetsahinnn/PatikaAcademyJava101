package methods;
import java.util.Scanner;

public class ItPrintsUntilNegativeAndBack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int say = scanner.nextInt();

        if (say > 0) {
            back(say);
        }
    }

    //prints positive numbers and (zero or negative number
    static void back(int say) {

        System.out.print(say + " ");
        if (say > 0) {
            back(say - 5);
            forward(say);
        }
    }

    //helps to print backwards after (zero or negative number
    static void forward(int say) {
        System.out.print(say + " ");
    }
}
