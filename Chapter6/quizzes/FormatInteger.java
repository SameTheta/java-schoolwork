import java.util.Scanner;

public class FormatInteger {
    public static String format(int number, int width) {
        // state variables
        String numberConvert = "";
        char zero = '0'; // can change format character

        for (int i = 0; i < (width - Integer.toString(number).length()); i++) {
            numberConvert = numberConvert + zero;
        }

        return numberConvert + Integer.toString(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // gets input variables
        System.out.println("Enter an integer"); int inputNumber = input.nextInt();
        System.out.println("Enter the width:"); int inputWidth = input.nextInt();

        // outputs formatted string
        System.out.println("The formatted number is " + format(inputNumber, inputWidth));
        
        input.close();
    }
}
