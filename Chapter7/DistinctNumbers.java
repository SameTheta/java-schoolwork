import java.util.Scanner;

public class DistinctNumbers {
    public static void main(String[] args) {
        int[] groupOfNumbers = new int[10];

        Scanner input = new Scanner(System.in);

        int nextNumber;
        
        // adding numbers to groupOfNumbers
        for (int i = 0; i < groupOfNumbers.length; i++) {
            nextNumber = input.nextInt();

            groupOfNumbers[i] = nextNumber;
        }

        input.close();

        // parse through array looking for duplicates
        for (int k = 0; k < groupOfNumbers.length; k++) {
            for (int m = 0; m < groupOfNumbers.length; m++) {
            }
        }
    }
}