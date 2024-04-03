import java.util.*;

public class AccountClassDesign {
    public static void main(String[] args) {
        Account myAccount = new Account(1122, 20000);
        myAccount.setAIR(4.5);

        myAccount.withdraw(2500);
        myAccount.deposit(3000);

        System.out.printf("%.2f\n", myAccount.getBalance());
        System.out.printf("%.2f\n", myAccount.getMonthlyInterest());
        System.out.println(myAccount.getDate());
    }
}

class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    Account() { // creates an account with the defaults of everything
    }

    Account(int specID, double specBalance) {
        id = specID;
        balance = specBalance;
    }

    // setter methods
    public void setID(int newID) {
        id = newID;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void setAIR(double newAIR) {
        annualInterestRate = newAIR / 100;
    }

    // getter methods
    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAIR() {
        return annualInterestRate;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / 12);
    }

    public void withdraw(double withdrawlAmount) {
        balance -= withdrawlAmount;
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
    }
}