import java.util.Scanner;

public class LabTest1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int curInput;

        //counters for each category
        int exCount = 0;
        int gCount = 0;
        int avgCount = 0;
        int bAvgCount = 0;
        int pCount = 0;

        do {
            curInput = input.nextInt();
            
            //check range for appropriate category
            if (curInput >= 90){ //for excellents
                exCount++;
            } else if (curInput < 90 && curInput >= 80) {
                gCount++;
            } else if (curInput < 80 && curInput >= 70) {
                avgCount++;
            } else if (curInput < 70 && curInput >= 60) {
                bAvgCount++;
            } else {
                pCount++;
            }
        } while (curInput != 0);
        
        //output plz
        System.out.println("Excellent:" + exCount);
        System.out.println("Good:" + gCount);
        System.out.println("Average: " + avgCount);
        System.out.println("Below Average: " + bAvgCount);
        System.out.println("Poor: " + pCount);

        input.close();
    }
}