package FINAL_PROJECT;
import java.util.*;
public class ConnectFour {
    public static char[][] initializeBoard(char[][] board) {
        char[][] initialized_board = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                initialized_board[i][j] = ' ';
            }
        }

        return initialized_board;
    }
    
    public static int getColumnNumFromPlayer(Scanner input) {
        System.out.print("Where would you like to drop your disk? (Enter a num 1-6) ");
        int inputColumn = input.nextInt();
        return inputColumn - 1;
    }

    public static char[][] dropDisk(int color, int columnNo, char[][] board) {
        for (int i = 5; i >= 0; i--) {
            if (color % 2 == 0) {
                if (board[i][columnNo] == ' ') {
                    board[i][columnNo] = 'R';
                    break;
                }
            } else {
                if (board[i][columnNo] == ' ') {
                    board[i][columnNo] = 'Y';
                    break;
                }
            }
        }

        return board;
    }

    public static void displayBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.print("|\n");
        }
    }

    public static int checkGameStatus(char[][] board) {
        /* 0 = game still going
         * 1 = Red wins
         * 2 = Yellow wins
         * 3 = Game tied
         */

        checkRows(board);
        checkColumns(board);
        checkDiagonals(board);
        
        if (isBoardFull(board)) {
            return 3;
        }
        return 0;
    }

    public static int checkRows(char[][] board) {
        // winning vars
        int game_continue = 0;
        int red_win = 1;
        int yellow_win = 2;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

            }
        }

        return game_continue;
    }

    public static int checkColumns(char[][] board) {
        // winning vars
        int game_continue = 0;
        int red_win = 1;
        int yellow_win = 2;

        return game_continue;
    }

    public static int checkDiagonals(char[][] board) {
        // winning vars
        int game_continue = 0;
        int red_win = 1;
        int yellow_win = 2;

        return game_continue;
    }

    public static boolean isBoardFull(char[][] board) {
        int redCount = 0;
        int yellowCount = 0;
        for (int i = 0; i < board[5].length; i++) {
             if (board[0][i] == 'R') {
                redCount++;
             }

             if (board[0][i] == 'Y') {
                yellowCount++;
             }

             if ((redCount + yellowCount) >= 6) {
                // its a tie
                return true;
             }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] main_board = new char[6][6];

        main_board = initializeBoard(main_board);
        int turn = 1;

        do {
            displayBoard(main_board);
            main_board = dropDisk(turn, getColumnNumFromPlayer(input), main_board);
            turn++;

        } while (checkGameStatus(main_board) == 0);

        System.out.println("Final play!");
        displayBoard(main_board);

        if (checkGameStatus(main_board) == 3) {
            System.out.println("It's a tie!");
        }
    }
}
