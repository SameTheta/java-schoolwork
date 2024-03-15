import java.util.Scanner;

public class FutureInvestmentValue {
    // does the compound interest calculations 
    public static double investmentGrowth(double initialInvestment, double monthlyInterest, int yearsInvested) {
        double investmentValue;

        investmentValue = initialInvestment * Math.pow((1 + monthlyInterest/12), yearsInvested * 12);
        return investmentValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double initialInvestment = input.nextDouble();
        double monthlyInterest = input.nextDouble();

        // reads out variables
        System.out.println("The amount invested: " + initialInvestment);
        System.out.println("The annual interest rate: " + monthlyInterest);

        // header for loop
        System.out.println("Years\t\tFuture Value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%d\t\t%.2f\n", i, investmentGrowth(initialInvestment, monthlyInterest, i));
        }
        
        input.close();
    }
}
