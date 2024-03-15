import java.util.Scanner;

public class MonthlyInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        float monthlyMoney = input.nextFloat();
        double INTEREST_RATE = (1 + 0.003125);

        double curMoney = monthlyMoney;

        curMoney = monthlyMoney * INTEREST_RATE;
        System.out.println("After the first month, the account value is " + curMoney);
        curMoney = (100 + curMoney) * INTEREST_RATE;
        System.out.println("After the second month, the account value is " + curMoney);
        curMoney = (100 + curMoney) * INTEREST_RATE;
        System.out.println("After the third month, the account value is " + curMoney);
        curMoney = (100 + curMoney) * INTEREST_RATE;
        System.out.println("After the fourth month, the account value is " + curMoney);
        curMoney = (100 + curMoney) * INTEREST_RATE;
        System.out.println("After the fifth month, the account value is " + curMoney);
        curMoney = (100 + curMoney) * INTEREST_RATE;
        System.out.println("After the sixth month, the account value is " + curMoney);

        input.close();
    }
}
