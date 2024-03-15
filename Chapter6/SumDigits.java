import java.util.Scanner;

public class SumDigits {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNum = input.nextInt();

        System.out.println(sumDigits(userNum));

        input.close();
    }
}