import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        // inits the Scanner method to read from terminal
        Scanner input = new Scanner(System.in);

        // inits miles as the input
        float miles = input.nextFloat();
        System.out.println(miles + " miles is " + (miles * 1.6) + " kilometers");

        input.close();
    }
}
