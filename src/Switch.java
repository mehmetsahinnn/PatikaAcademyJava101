import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk say : ");
        float ilk = scanner.nextFloat();
        System.out.print("İki say : ");
        float iki = scanner.nextFloat();

        System.out.print("Toplama için 1, Çıkarma için 2, Çarpma için 3, Bölme için 4 : ");
        int isle = scanner.nextInt();

        switch (isle){
            case 1:
                System.out.println(ilk+iki);
                break;
            case 2:
                System.out.println(ilk-iki);
                break;
            case 3:
                System.out.println(ilk*iki);
                break;
            case 4:
                System.out.println(ilk/iki);
                break;
            default:
                break;
        }


    }
}
