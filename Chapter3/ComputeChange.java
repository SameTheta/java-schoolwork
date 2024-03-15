import java.util.Scanner;

public class ComputeChange {
  public static void main(String[] args) {   
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount 
    System.out.print("Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // message showing your amount 
    System.out.println("Your amount " + amount + " consists of"); 

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    if (numberOfOneDollars >= 0 && numberOfOneDollars != 1){
      System.out.println("\t" + numberOfOneDollars + " dollars");
    } else {
      System.out.println("\t" + numberOfOneDollars + " dollar");
    }
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    if (numberOfQuarters >= 0 && numberOfQuarters != 1){
      System.out.println("\t" + numberOfQuarters + " quarters");
    } else {
      System.out.println("\t" + numberOfQuarters + " quarter");
    }
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    if (numberOfDimes >= 0 && numberOfDimes != 1){
      System.out.println("\t" + numberOfDimes + " dimes");
    } else {
      System.out.println("\t" + numberOfDimes + " dime");
    }
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    if (numberOfNickels >= 0 && numberOfNickels != 1){
      System.out.println("\t" + numberOfNickels + " nickels");
    } else {
      System.out.println("\t" + numberOfNickels + " nickel");
    }
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;
    if (numberOfPennies >= 0 && numberOfPennies != 1){
      System.out.println("\t" + numberOfPennies + " pennies");
    } else {
      System.out.println("\t" + numberOfPennies + " penny");
    }

    input.close();
  }
}
