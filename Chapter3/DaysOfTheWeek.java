import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        // init variables and scanners
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year: ");
        int year = input.nextInt(); // basic years
        System.out.println("Enter month (1-12): ");
        int m = input.nextInt(); // the month
        System.out.println("Enter the day of the month. (1-31): ");
        int q = input.nextInt(); // day of the month
        
        if (m == 1 || m == 2) {
            m = m + 12;
            year--;
        }

        int j = year / 100; // whatever this calculates
        int k = year % 100; // the year in the century

        // calcs the index
        int dayName = (q + ((26 * (m + 1))/10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // tells what day it is
        switch (dayName) {
            case 0:
                System.out.println("Day of the Week is Saturday");
                break;
            case 1:
                System.out.println("Day of the Week is Sunday");
                break;
            case 2:
                System.out.println("Day of the Week is Monday");
                break;
            case 3:
                System.out.println("Day of the Week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the Week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the Week is Thursday");
                break;
            case 6:
                System.out.println("Day of the Week is Friday");
                break;
            default:
                break;
        }

        input.close();
    }
}