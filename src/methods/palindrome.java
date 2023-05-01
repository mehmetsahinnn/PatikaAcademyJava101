package methods;

public class palindrome {
    public static void main(String[] args) {
        isPalindrome(121);
        isPalindrome(465);
    }

    static boolean isPalindrome(int num) {

        int numLength = String.valueOf(num).length();
        int[] numArray = new int[numLength];

        int OurNum;
        int initialNum =  num;
        for (int i = 0; i < numLength; i++) {
            OurNum = num % 10;
            num = num/10;
            numArray[i] = OurNum;
        }
        boolean flag = true;
        for (int i = 0; i < numArray.length; i++) {
            flag = numArray[i] == numArray[numArray.length - 1 - i];
        }
//        System.out.println(Arrays.toString(numArray));
        if (flag){
            System.out.println(initialNum + " Is Palindrome");
            return true;
        }
        System.out.println(initialNum + " Is not Palindrome");
        return false;
    }
}
