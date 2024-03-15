import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define vars
        // these variables calculate the meters and kilograms on the fly
        System.out.println("Enter weight in pounds: ");
        double weightKilograms = input.nextDouble() * 0.45359237;

        System.out.println("Enter height in inches: ");
        double heightMeters = input.nextDouble() * 0.0254;

        // calculate BMI
        float totalBMI = (float) (weightKilograms / Math.pow(heightMeters, 2));

        //output
        System.out.println("BMI is " + totalBMI);

        input.close();
    }
}
