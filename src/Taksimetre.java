import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Mesafe : ");
        int mesafe = sc.nextInt();

        final double PER = 2.20;

        System.out.println("Ücret : " + ((mesafe * PER) < 20 ? 20 : (mesafe * PER + 10)));


    }
}
