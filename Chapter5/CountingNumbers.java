import java.util.Scanner;

public class CountingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int curNumber = input.nextInt();

        int amountPos = 0;
        int amountNeg = 0;
        float total = 0;
        float average = 0;

        while (curNumber != 0) {
            if (curNumber > 0) {
                amountPos++;
            } else {
                amountNeg++;
            }

            total += curNumber;
            curNumber = input.nextInt();
        }

        average = (total / (amountPos + amountNeg));

        System.out.println("The amount of positive numbers is " + amountPos);
        System.out.println("The amount of negative numbers is " + amountNeg);
        System.out.println("The total amount is " + (int) total);
        System.out.println("The average for this set of numbers is " + average);

        input.close();
    }
}