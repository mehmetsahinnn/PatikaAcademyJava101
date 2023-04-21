import java.util.Scanner;

public class hipo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uzun Kenar : ");
        int Uun = sc.nextInt();
        System.out.print("Kısa Kenar : ");
        int Ksa = sc.nextInt();
        System.out.print("Orta Kenar : ");
        int Ota = sc.nextInt();

        int ikiU = Uun+Ksa+Ota;
        int U = ikiU/2;


        int AlanKre = U * (U - Uun)* (U - Ksa) * (U - Ota);

        int Alan  = (int) Math.sqrt(AlanKre);
        System.out.println("Alan : " + Alan);


    }
}
