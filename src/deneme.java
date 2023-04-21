import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Calculus Sonuç: ");
        int mat = sc.nextInt();
        System.out.print("CP4 Sonuç: ");
        int fizik = sc.nextInt();
        System.out.print("db Sonuç: ");
        int kimya = sc.nextInt();
        System.out.print("internet Sonuç: ");
        int tur = sc.nextInt();
        System.out.print("numerik Sonuç: ");
        int tar = sc.nextInt();
        System.out.print("istat Sonuç: ");
        int muz = sc.nextInt();
        System.out.print("ToC Sonuç: ");
        int tc = sc.nextInt();

        int sum = (mat+fizik+kimya+tur+tar+muz+tc) / 7;
        System.out.println(sum);

        String result = (sum > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);
    }
}
