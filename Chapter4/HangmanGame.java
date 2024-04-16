import java.util.Scanner;

public class HangmanGame {
    public static void hangmanStart(String[] words, int randomInt) {
        Scanner input = new Scanner(System.in);

        // variables
        // curArray is the current word as an array of characters
        // guesses shows the users current guessed letters (starts as asterisks)
        boolean isGuessed = false;
        char[] curArray = words[randomInt].toLowerCase().toCharArray();
        char[] guesses = new char[words[randomInt].length()];

        for (int i = 0; i < guesses.length; i++) {
            guesses[i] = '*';
        }

        

        while (isGuessed == false) {
            System.out.print("Please guess a character. (" + String.valueOf(guesses) + ")");
            char curGuess = input.next().toLowerCase().charAt(0);

            for (int i = 0; i < curArray.length; i++) {
                if (curGuess == curArray[i]) {
                    guesses[i] = curGuess;
                }

                if (String.valueOf(guesses).equals(String.valueOf(curArray))) {
                    isGuessed = true;
                }
            }
        }

        input.close();

        System.out.println("You guessed the word! It was " + words[randomInt] + "!");
    }
    public static void main(String[] args) {
        /* make a hangman game that picks a random word out of an array of
           words and allow the user to guess letters until they get the
           word corrrect                                                  */ 

        // current words
        String[] words = {"definite", "high", "fever", "defenestrate", "committee"};
        
        double randResult = Math.random() * 5;
        int randRound = (int) randResult; 

        hangmanStart(words, randRound);
    }
}