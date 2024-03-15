import java.util.Scanner;

public class MultiplyDigits {
    public static void main(String[] args) {
        // define vars
        Scanner input = new Scanner(System.in);
        int multipleDigit = 1;

        // get input
        System.out.println("Input a number ranging from 0 to 1000: ");
        int inputNumber = input.nextInt(); // find int in input

        if (inputNumber > 0 && inputNumber < 1000) {
            // todo: make it not always calculate zero when input is less than 3 digits
            multipleDigit = multipleDigit * (inputNumber % 10);
            inputNumber = inputNumber / 10;
            multipleDigit = multipleDigit * (inputNumber % 10);
            inputNumber = inputNumber / 10;
            multipleDigit = multipleDigit * (inputNumber % 10);
            System.out.println(multipleDigit);
        } else {
            System.out.println("Number not valid. Please try again.");
        }

        input.close();
    }
}
