import java.util.Scanner;

public class MaxNumberOccurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int curNumber = input.nextInt();
        int max = 0;
        int count = 0;
        
        while (curNumber != 0) {
            if (curNumber > max){
                max = curNumber;
                count = 0;
            }

            if (curNumber == max) {
                count++;
            }

            curNumber = input.nextInt();
        }

        if (max == 0){
            System.out.println("No numbers found except zero.");
        } else {
            System.out.println("The max number found was " + max);
            System.out.println("That number was found " + count + " times");
        }

        input.close();
    }
}