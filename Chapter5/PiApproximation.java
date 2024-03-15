//import java.util.Scanner;

public class PiApproximation {
    public static void main(String[] args) {

        /* my code
        // activate scanner
        Scanner input = new Scanner(System.in);

        // initialize variables
        int placement = input.nextInt();
        double pi = 0;

        for (int i = 1; i < placement; i++) {
            pi += 4 * (Math.pow(-1, (i + 1))/((2 * i) - 1));
        }
        
        System.out.println(pi);
         */

        // teachers code
        double pi = 0;
        double sign = 1.0;

        for (int i = 1; i < 100000; i++) {
            pi += sign /(2*i-1);
            sign = -1;
        }

        System.out.println(pi);
    }
}