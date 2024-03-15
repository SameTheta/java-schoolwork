import java.util.*;

public class AnalyzeGrades {
    public static void main(String[] args) {
        double[] grades = new double[100];

        Scanner input = new Scanner(System.in);
        double userInput = input.nextDouble();
        
        double sum = 0;
        double avg = 0;
        int k = 0;

        int aboveAvgCount = 0;
        int belowAvgCount = 0;


        while (userInput >= 0) {
            grades[k] = userInput;
            sum += userInput;
            userInput = input.nextDouble();
            k++;
        }

        avg = sum / k;

        input.close();

        for (int i = 0; i < k; i++) {
            if (grades[i] >= avg) {
                aboveAvgCount++;
            } else {
                belowAvgCount++;
            }
        }

        System.out.println("Count is " + k);
        System.out.println("The average is " + sum / k);
        System.out.println("The amount of numbers above or equal to the average is " + aboveAvgCount);
        System.out.println("The amount of numbers below the average is " + belowAvgCount);
    }
}