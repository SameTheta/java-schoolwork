import java.util.Scanner;

public class NumberOccurances {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numberCounter = new int[100];
        int curNum = input.nextInt();

        while (curNum > 0) {
            numberCounter[curNum]++;
            curNum = input.nextInt();
        }

        input.close();

        for (int i = 0; i < numberCounter.length; i++) {
            if (numberCounter[i] > 1) {
                System.out.println(i + " occurs " + numberCounter[i] + " times");
            } else if (numberCounter[i] == 1){
                System.out.println(i + " occurs " + numberCounter[i] + " time");
            }
        }
    }
}