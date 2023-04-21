import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fiyat : ");
        int fiyat = sc.nextInt();

        double oran = (fiyat > 1000) ? 8 : 18 ;
        System.out.println(fiyat+(((double) fiyat /100)*oran));
    }
}
