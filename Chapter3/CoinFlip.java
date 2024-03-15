import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double coin = Math.random();

        // prompt user for input
        System.out.println("Please enter either 1 (heads) or 0 (tails)");
        int userGuess = input.nextInt();

        // making the random number a true or false
        if (coin >= 0.5) {
            coin = 1;
            System.out.println("It's heads!");
        } else {
            coin = 0;
            System.out.println("It's tails!");
        }

        if (coin == userGuess) {
            System.out.println("You guessed correctly!");
        } else {
            System.out.println("You guessed incorrectly. Try again!");
        }

        input.close();
    }
}