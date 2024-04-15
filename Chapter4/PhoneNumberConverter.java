import java.util.Scanner;

public class PhoneNumberConverter {
    public static String stringToNumber(String phoneNumber) {
        // makes each letter uppercase in order to match LETTER_TO_NUMBER correctly
        char[] phoneNumberArray = (phoneNumber.toUpperCase()).toCharArray();

        // multi-dimensional array representing a phone's keypad
        final char[][] LETTER_TO_NUMBER = {
            {'A', 'B', 'C'},       // 2
            {'D', 'E', 'F'},       // 3
            {'G', 'H', 'I'},       // 4
            {'J', 'K', 'L'},       // 5
            {'M', 'N', 'O'},       // 6
            {'P', 'Q', 'R', 'S'},  // 7
            {'T', 'U', 'V'},       // 8
            {'W', 'X', 'Y', 'Z'}   // 9
        };

        /* for each character in phoneNumber, iterate over every array and make
           each letter their corresponding number on the keypad.               */
        for (int i = 0; i < phoneNumber.length(); i++) {
            for (int j = 0; j < LETTER_TO_NUMBER.length; j++) {
                for (int l = 0; l < LETTER_TO_NUMBER[j].length; l++) {
                    if (phoneNumberArray[i] == LETTER_TO_NUMBER[j][l]) {
                        phoneNumberArray[i] = (char) (j + '2');
                    }
                }
            }
        }

        return String.valueOf(phoneNumberArray);
    }
    public static void main(String[] args) {
        /* return a phone number that has letters to a complete
           phone number using the universal keypad keyboard.   */
        Scanner input = new Scanner(System.in);
        
        String inputPhoneNumber = input.next();
        input.close();

        System.out.print(stringToNumber(inputPhoneNumber));
    }
}