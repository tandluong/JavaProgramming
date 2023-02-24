import java.util.Scanner;

public class Exercise8_19 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = input.nextInt();

        System.out.println("Enter the values of the matrix: ");
        int[][] matrix = getArray(input, row, col);

        System.out.println(isConsecutiveFour(matrix));
    }

    public static int[][] getArray(Scanner input, int row, int col) {
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextInt();

        return matrix;
    }

    public static boolean isConsecutiveFour(int[][] values) {
        // How would we determine if there are consecutive four?
        // We have to first determine what numbers there are
        // How would we do that?
        // We can say at values[0][0] we will search for a consecutive 4
        // Such that at every values[row][col] we will search through the entire matrix

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                int countRow = 0;
                int countCol = 0;
                int countDiagonal = 0;
                int countReverseDiagonal = 0;
                int current = values[i][j];

                // Create a loop to find if there are 4 in a row in the same row
                for (int k = j; k < values[i].length; k++) {
                    if (current == values[i][k])
                        countRow++;
                    else
                        break;
                }

                // Create a loop to find if there are 4 in a row in the same column
                for (int l = j; l < values.length; l++) {
                    if (current == values[l][j])
                        countCol++;
                    else
                        break;
                }

                // Create a loop to find if there are 4 in a row at the diagonal
                for (int n = i, m = j; n < values.length && m < values[i].length; n++, m++) {
                    if (current == values[n][m])
                        countDiagonal++;
                    else
                        break;
                }

                // Create a loop to find if there are 4 in a row at the reverse diagonal
                for (int n = i, m = j; n + m == values.length &&
                        n <= values.length && m >= 1; n++, m--) {
                    if (current == values[n][m])
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
}
