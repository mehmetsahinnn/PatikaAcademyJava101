package looplar;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String password = "12345";

        System.out.print("Şifrenizi girin: ");
        String userPassword = input.nextLine();

        if (userPassword.equals(password)) {
            System.out.println("Hoş Geldiniz!");
        }
        else {
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (E/H): ");
            String reset = input.nextLine();

            if (reset.equalsIgnoreCase("E")) {

                System.out.print("Yeni şifrenizi girin: ");
                String newPassword = input.nextLine();


                if (!newPassword.equals(password)) {
                    System.out.println("Şifre oluşturuldu");
                }
                else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }
            else {
                System.out.println("Program sonlandırıldı.");
            }
        }
    }
}
