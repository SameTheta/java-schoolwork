import java.util.*;

public class ConnectFour {
    public static char[][] initializeBoard(char[][] board) {
        // initializes the array of spaces on the board
        char[][] initialized_board = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                initialized_board[i][j] = ' ';
            }
        }
        return initialized_board;
    }
    
    public static int getColumnNumFromPlayer(Scanner input, int turn) {
        int inputColumn = 0;

        while (inputColumn > 7 || inputColumn < 1) {
            switch (turn % 2) {
                case 1:
                    System.out.print("It's Red's turn! Where would you like to drop your disk? (Enter a num 1-7) ");
                    break;
                case 0:
                    System.out.print("It's Yellow's turn! Where would you like to drop your disk? (Enter a num 1-7) ");
                    break;
                default:
                    break;
            }

            inputColumn = input.nextInt();
        }
        
        return inputColumn - 1;
    }

    public static char[][] dropDisk(int color, int columnNo, char[][] board) {
        // updates each disks position every turn
        for (int i = (board.length - 1); i >= 0; i--) {
            if (color % 2 == 1) {
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
        // displays the current board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.print("|\n");
        }
    }

    public static int checkGameStatus(char[][] board) {
        // checks whether or not someone's win condition has been met, if not, continue game
        /* 0 = Game continues
         * 1 = Red wins
         * 2 = Yellow wins
         * 3 = Game tied
         */

        switch (checkRows(board)) {
            case 1:
                return 1;
            case 2:
                return 2;
        }

        switch (checkColumns(board)) {
            case 1:
                return 1;
            case 2:
                return 2;
        }

        switch (checkDiagonals(board)) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                break;
        }

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

        int redCount = 0;
        int yellowCount = 0;

        //row logic
        for (int i = 0; i < board.length; i++) {
            redCount = 0;
            yellowCount = 0;
            for (int j = 0; j < board[i].length; j++) {
                //switch case instead of if else ftw
                switch (board[i][j]) {
                    case 'R':
                        redCount++;
                        yellowCount = 0;
                        break;
                    case 'Y' :
                        yellowCount++;
                        redCount = 0;
                        break;
                    default:
                        redCount = 0;
                        yellowCount = 0;
                        break;
                }

                if (redCount >= 4) {
                    return red_win;
                } else if (yellowCount >= 4) {
                    return yellow_win;
                }
            }
        }

        return game_continue;
    }

    public static int checkColumns(char[][] board) {
        // winning vars
        int game_continue = 0;
        int red_win = 1;
        int yellow_win = 2;

        int redCount = 0;
        int yellowCount = 0;

        // main column logic (basically the same as row logic except the indexes are reversed)
        for (int i = 0; i < board.length; i++) {
            redCount = 0;
            yellowCount = 0;
            for (int j = 0; j < board[i].length-1; j++) {
                switch (board[j][i]) {
                    case 'R':
                        redCount++;
                        yellowCount = 0;
                        break;
                    case 'Y' :
                        yellowCount++;
                        redCount = 0;
                        break;
                }

                if (redCount >= 4) {
                    return red_win;
                } else if (yellowCount >= 4) {
                    return yellow_win;
                }
            }
        }

        return game_continue;
    }

    /* public static int checkDiagonals(char[][] board) {
        // winning vars
        int game_continue = 0;
        int red_win = 1;
        int yellow_win = 2;

        int redCount = 0;
        int yellowCount = 0;

        for (int i = 0; i < board.length - 1; i++) {
            redCount = 0;
            yellowCount = 0;
            for (int j = 0; j < board[i].length - 1; j++) {
                //System.out.print(board[i][j] + " " + board[i+1][j+1] + " ");
                if (board[i][j] == 'R' && board[i+1][j+1] == 'R') {
                    redCount++;
                    //System.out.println(redCount);
                    yellowCount = 0;
                } else if (board[i][j] == 'R' && board[i+1][j+1] == 'R') {
                    redCount++;
                    yellowCount = 0;
                }

                if (redCount == 4) {
                    return red_win;
                } else if (yellowCount == 4) {
                    return yellow_win;
                }
            }
        }

        return game_continue;
    } */

    public static int checkDiagonals(char[][] board) {
        // winning vars
        int game_continue = 0;
        int red_win = 1;
        int yellow_win = 2;
    
        int redCount = 0;
        int yellowCount = 0;
    
        // check diagonals forward
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                redCount = 0;
                yellowCount = 0;
                for (int k = 0; k < 4; k++) {
                    switch (board[i + k][j + k]) {
                        case 'R':
                            redCount++;
                            yellowCount = 0;
                            break;
                        case 'Y':
                            yellowCount++;
                            redCount = 0;
                            break;
                        default:
                            redCount = 0;
                            yellowCount = 0;
                            break;
                    }
                }
                if (redCount >= 4) {
                    return red_win;
                } else if (yellowCount >= 4) {
                    return yellow_win;
                }
            }
        }
    
        // check diagonal backward
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 3; j < board[i].length; j++) {
                redCount = 0;
                yellowCount = 0;
                for (int k = 0; k < 4; k++) {
                    switch (board[i + k][j - k]) {
                        case 'R':
                            redCount++;
                            yellowCount = 0;
                            break;
                        case 'Y':
                            yellowCount++;
                            redCount = 0;
                            break;
                        default:
                            redCount = 0;
                            yellowCount = 0;
                            break;
                    }
                }
                if (redCount >= 4) {
                    return red_win;
                } else if (yellowCount >= 4) {
                    return yellow_win;
                }
            }
        }
    
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

        char[][] main_board = new char[6][7];

        main_board = initializeBoard(main_board);
        int turn = 1;

        do {
            displayBoard(main_board);
            main_board = dropDisk(turn, getColumnNumFromPlayer(input, turn), main_board);
            turn++;

        } while (checkGameStatus(main_board) == 0);

        System.out.println("Final play! (Game took " + turn + " turns)");
        displayBoard(main_board);

        switch (checkGameStatus(main_board)) {
            case 1:
                System.out.println("Red wins!");
                break;

            case 2:
                System.out.println("Yellow wins!");
                break;

            case 3:
                System.out.println("It's a tie!");
                break;
        
            default:
                break;
        }
    }
}
