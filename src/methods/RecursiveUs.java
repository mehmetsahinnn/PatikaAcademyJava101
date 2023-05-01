package methods;

public class RecursiveUs {
    static int recursive(int tab, int us) {

        if (us == 0) {
            return 1;
        }
        else {
            return tab * recursive(tab, us - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursive(4, 2));
        System.out.println(recursive(6, 3));
    }
}
