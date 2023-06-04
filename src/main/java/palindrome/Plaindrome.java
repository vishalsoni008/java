package palindrome;

import java.util.Scanner;

public class Plaindrome {

    public static boolean isPalindrome(int value) {
        int temp = value;
        int rev = 0;

        while (value > 0) {
            int rem = value % 10;
            rev = rev * 10 + rem;
            value /= 10;
        }
        return temp == rev;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kindly provide a number");
        int value = scanner.nextInt();

        System.out.println(isPalindrome(value));
    }
}
