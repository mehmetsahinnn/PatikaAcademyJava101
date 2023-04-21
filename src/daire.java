import java.util.Scanner;

public class daire {
     static final float PI = 3.14F;
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Radius : ");
        int radius = sc.nextInt();

        System.out.print("centerAngle : ");
        int centerAngle =  sc.nextInt();

        System.out.println((PI*(radius*radius)*centerAngle)/360);
    }
}
