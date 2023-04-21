import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("kg : ");
        int kg = sc.nextInt();

        System.out.print("height as cm : ");
        double height =  sc.nextDouble();

        System.out.println(kg/(height*height));

    }
}
