import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_20 {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        char[][] board = board();
        printBoard(board);
        play(board);
    }

    public static void play(char[][] board) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Check if the game is over or not
        boolean gameOver;
        int countTurn = 0;
        // How many columns there are in board and maximum value of board's length
        int[] trackRow = {5, 5, 5, 5, 5, 5, 5};
        do {
            char player = countTurn % 2 == 0 ? 'R' : 'Y';
            String playerName = countTurn % 2 == 0 ? "red" : "yellow";
            // Prompt user for input
            System.out.print("Drop a " + playerName + " disk at column (0-6): ");
            int column = input.nextInt();
            // Update board
            board[trackRow[column]][column] = player;
            // Display board after play
            printBoard(board);
            trackRow[column]--;
            countTurn++;

            // check if there is a winner
            gameOver = isConsecutiveFour(board, player);

            if (gameOver)
                System.out.println("The " + playerName + " player won");

        } while (!gameOver);
    }

    public static boolean isConsecutiveFour(char[][] board, char player) {
        // We are reusing the method we created in Exercise8_19
        // Slight modifications were made for char values
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int countRow = 0;
                int countCol = 0;
                int countDiagonal = 0;
                int countReverseDiagonal = 0;

                // Create a loop to find if there are 4 in a row in the same row
                for (int k = j; k < board[i].length; k++) {
                    if (player == board[i][k])
                        countRow++;
                    else
                        break;
                }

                // Create a loop to find if there are 4 in a row in the same column
                for (int l = j; l < board.length; l++) {
                    if (player == board[l][j])
                        countCol++;
                    else
                        break;
                }

                // Create a loop to find if there are 4 in a row at the diagonal
                for (int n = i, m = j; n < board.length && m < board[i].length; n++, m++) {
                    if (player == board[n][m])
                        countDiagonal++;
                    else
                        break;
                }

                // Create a loop to find if there are 4 in a row at the reverse diagonal
                for (int n = i, m = j; n + m == board.length &&
                        n <= board.length && m >= 1; n++, m--) {
                    if (player == board[n][m])
                        countReverseDiagonal++;
                    else
                        break;
                }

                if (countRow >= 4)
                    return true;
                if (countCol >= 4)
                    return true;
                if (countDiagonal >= 4)
                    return true;
                if (countReverseDiagonal >= 4)
                    return true;
            }
        }

        return false;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print("|" + board[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("———————————————");
    }

    // Make an empty board
    public static char[][] board() {
        // 6-by-7 matrix
        char[][] board = new char[6][7];
        // initialize the board to be empty
        for (char[] chars : board)
            Arrays.fill(chars, ' ');

        return board;
    }
}
