import java.util.Scanner;

public class ComparingLoans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int amountLoaned = input.nextInt();
        double interestPercent = 5.0;
        int loanTerm = 5;
        final double INTEREST_RATE_INCREASE = 0.125;

        double trueInterest = interestPercent / 100 / 12;

        double totalPayment = 0;
        double monthlyPayment = 0; // (amountLoaned * (trueInterest * (Math.pow((1 + trueInterest), loanTerm * 12))) / (Math.pow((1 + trueInterest), loanTerm * 12) - 1));

        System.out.println("Loan Amount: " + amountLoaned +"\nNumber of years: " + loanTerm + "\nInterest Rate\tMonthly Pmnt.\tTotal Pmnt.");
        while (interestPercent <= 8) {
            trueInterest = interestPercent / 100 / 12;
            monthlyPayment = (amountLoaned * (trueInterest * (Math.pow((1 + trueInterest), loanTerm * 12))) / (Math.pow((1 + trueInterest), loanTerm * 12) - 1));
            totalPayment = monthlyPayment * (loanTerm * 12);
            
            System.out.printf("%.3f\t\t%.2f\t\t%11.2f\n", interestPercent, monthlyPayment, totalPayment);

            interestPercent += INTEREST_RATE_INCREASE;
        }

        input.close();
    }
}