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
    void setID(int newID) {
        id = newID;
    }

    void setBalance(double newBalance) {
        balance = newBalance;
    }

    void setAIR(double newAIR) {
        annualInterestRate = newAIR / 100;
    }

    // getter methods
    int getID() {
        return id;
    }

    double getBalance() {
        return balance;
    }

    double getAIR() {
        return annualInterestRate;
    }

    Date getDate() {
        return dateCreated;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * (annualInterestRate / 12);
    }

    void withdraw(double withdrawlAmount) {
        balance -= withdrawlAmount;
    }

    void deposit(double depositAmount) {
        balance += depositAmount;
    }
}