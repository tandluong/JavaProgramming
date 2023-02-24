import java.util.Scanner;

public class Exercise8_9 {
    public static void main(String[] args) {
        play();
    }

    public static void play() {
        // Get an empty board
        char[][] game = board();

        // Display current table to user
        table(game);

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Start the game
        boolean complete = false;
        // Prompt user for input
        int countTurn = 0;
        int row;
        int col;
        do {
            char player = countTurn % 2 == 0 ? 'X' : 'O';
            System.out.print("Enter a row (0, 1, or 2) for player " + player + ": ");
            row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + player + ": ");
            col = input.nextInt();
            // Mark the player's move
            game[row][col] = move(game, row, col, countTurn);
            // Display the new table
            System.out.println();
            table(game);
            countTurn++;

            // Check if there is any more moves
            int countSpace = 0;
            for (int i = 0; i < game.length; i++)
                for (int j = 0; j < game[i].length; j++)
                    if (game[i][j] != ' ')
                        countSpace++;

            char progress = checkGame(game);
            if (progress == 'X' || progress == 'Y')
                complete = true;

            if (complete) {
                System.out.println(progress + " player won");
            }

            if (countSpace == game.length * game[0].length && progress == 'N') {
                System.out.println("Game is a draw. Do you wish to continue?");
                System.out.print("Enter '1' to continue or '0' to stop: ");
                row = input.nextInt();
                if (row == 1) {
                    // reset all variables
                    game = board();
                    table(game);
                    countTurn = 0;
                } else
                    System.exit(0);
            }

        } while (!complete);
    }

    public static char checkGame(char[][] board) {
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < board.length; i++) {
            // Check if the rows are 3 in a row
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X')
                    countX++;
                if (board[i][j] == 'Y')
                    countY++;

                if (countX == 3)
                    return 'X';
                if (countY == 3)
                    return 'Y';
            }
            // Reset count after each iteration
            countX = 0;
            countY = 0;

            // Check if the columns are 3 in a row
            for (int k = 0; k < board[i].length; k++) {
                if (board[k][i] == 'X')
                    countX++;
                if (board[k][i] == 'Y')
                    countY++;

                if (countX == 3)
                    return 'X';
                if (countY == 3)
                    return 'Y';
            }
            // Reset count after each iteration
            countX = 0;
            countY = 0;
        }

        // Count is already reset after the loop above finishes
        for (int i = 0; i < board.length; i++) {
            // Check if the diagonal (\) are 3 in a row
            for (int l = i; l < board[i].length; l++) {
                if (board[i][l] == 'X')
                    countX++;
                if (board[i][l] == 'Y')
                    countY++;

                if (countX == 3)
                    return 'X';
                if (countY == 3)
                    return 'Y';
            }
        }

        // Reset count after previous check
        countX = 0;
        countY = 0;
        for (int i = 0; i < board.length; i++) {
            // Check if the diagonal (/) are 3 in a row
            for (int l = (board[i].length - 1) - i; l >= 0; l--) {
                if (board[i][l] == 'X')
                    countX++;
                if (board[i][l] == 'Y')
                    countY++;

                if (countX == 3)
                    return 'X';
                if (countY == 3)
                    return 'Y';
            }
        }

        return 'N';
    }

    public static void table(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.println("| " + board[i][0] + " | " +
                    board[i][1] + " | " + board[i][2] + " |");
            System.out.println("-------------");
        }
    }

    public static char[][] board() {
        // Initialize a 3 X 3 grid of char to contain X or O
        char[][] board = new char[3][3];
        // Initialize board with ' ' so that it is not null
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                board[i][j] = ' ';

        return board;
    }

    public static char move(char[][] board, int row, int column, int turn) {
        if (turn % 2 == 0)
            return board[row][column] = 'X';
        else
            return board[row][column] = 'O';
    }
}
