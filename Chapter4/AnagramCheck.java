import java.util.Scanner;

public class AnagramCheck {
    public static boolean isAnagram(String string1, String string2) {
        int[] letterCount1 = new int[26];
        int[] letterCount2 = new int[26];

        if (string1.length() != string2.length()) {
            return false;
        }

        for (int i = 0; i < string1.length(); i++) {
            letterCount1[Character.getNumericValue(string1.charAt(i)) - 10] += 1;
        }

        for (int i = 0; i < string2.length(); i++) {
            letterCount2[Character.getNumericValue(string2.charAt(i)) - 10] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (letterCount1[i] != letterCount2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userString1 = input.next();
        String userString2 = input.next();

        input.close();

        if (isAnagram(userString1, userString2)) {
            System.out.println(userString1 + " is an anagram of " + userString2);
        } else {
            System.out.println(userString1 + " is not an anagram of " + userString2);
        }
    }
}