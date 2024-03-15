import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // get ISBN
        System.out.println("Enter the first 9 digits of an ISBN.");
        String rawISBN = input.nextLine();
        int isbnNumber = Integer.parseInt(rawISBN);
        int isbnChecksum = 0;

        // find checksum
        for (int isbnCharIndex = 9; isbnCharIndex > 0; isbnCharIndex--) {
            isbnChecksum = isbnChecksum + ((isbnNumber % 10) * isbnCharIndex); // adds previous isbnChecksum to the formula
            isbnNumber = isbnNumber / 10;
        }

        isbnChecksum = isbnChecksum % 11; // to complete the algorithm

        //combines isbnNumber and checksum
        if (isbnChecksum == 10) {
            System.out.println(rawISBN + "X");
        } else {
            System.out.println(rawISBN + "" + isbnChecksum);
        }

        input.close();
    }
}