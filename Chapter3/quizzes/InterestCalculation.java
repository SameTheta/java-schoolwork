import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // define vars
        System.out.println("Enter the initial investment.");
        float investmentAmount = input.nextFloat();
        System.out.println("Enter the interest rate. (Enter it in a X.XX format.)");
        double interestRate = (input.nextDouble() * 0.01) / 12; //expects input given in normal percent form
        System.out.println("Enter the amount of years.");
        int numberOfYears = input.nextInt();

        //main logic
        double futureInvestmentValue = investmentAmount * Math.pow(1 + interestRate, numberOfYears * 12);
        System.out.println("The future value is " + futureInvestmentValue);

        input.close();
    }
}