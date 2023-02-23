import java.util.Scanner;

public class Exercise8_26 {
    public static void main(String[] args) {
        double[][] matrix = matrix();
        double[][] matrixSortRows = sortRows(matrix);

        // Print the sorted array
        System.out.println("\nThe row-sorted array is");
        for (double[] row : matrixSortRows) {
            for (double col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    public static double[][] matrix() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 3-by-3 matrix
        double[][] matrix = new double[3][3];

        // Prompt user for input
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        return matrix;
    }

    public static double[][] sortRows(double[][] m) {
        // Initialize a new double 2-d array to manipulate and return
        double[][] n = new double[m.length][m[0].length];
        // Copy contents of array m to array n
        for (int i = 0; i < m.length; i++)
            System.arraycopy(m[i], 0, n[i], 0, m[i].length);

        // Sort each row
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length - 1; j++) {
                if (n[i][j] > n[i][j + 1]) {
                    double temp = n[i][j];
                    n[i][j] = n[i][j + 1];
                    n[i][j + 1] = temp;
                }
            }
        }

        return n;
    }
}
