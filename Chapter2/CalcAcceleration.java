import java.util.Scanner;

public class CalcAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter the values for calculation
        System.out.println("What is the starting velocity? ");
        float startingVelocity = input.nextFloat();

        System.out.println("What is the ending velocity? ");
        float endingVelocity = input.nextFloat();

        System.out.println("What is the time in seconds? ");
        float timeInSeconds = input.nextFloat();

        float accel = (endingVelocity - startingVelocity) / timeInSeconds;

        System.out.println("The average acceleration is " + accel);

        input.close();
    }
}
