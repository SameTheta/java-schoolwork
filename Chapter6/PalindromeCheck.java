import java.util.Scanner;

public class PalindromeCheck {
    // returns the reverse of an integer
    public static int reverse(int inputNumber) {
        int reverseNumber = 0;
        int curDigit;

        while (inputNumber > 0) {
            curDigit = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + curDigit;

            inputNumber = inputNumber / 10;
        }

        return reverseNumber;
    }

    // returns if given integer is the reverse of another given integer
    public static boolean isPalindrome(int checkNumber, int reverseNumber) {
        if (checkNumber == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userNum = input.nextInt();

        System.out.println("This number is a " + isPalindrome(userNum, reverse(userNum)) + " palindrome.");

        input.close();
    }
}