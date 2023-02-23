import java.util.Scanner;

public class Exercise8_2 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        double[][] m = getArray();

        double sum = sumMajorDiagonal(m);

        System.out.println("Sum of the elements in the major diagonal is " + sum);
    }

    public static double[][] getArray() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 4-by-4 matrix
        double[][] matrix = new double[4][4];

        // Prompt user for input
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        return matrix;
    }

    public static double sumMajorDiagonal(double[][] m) {
        // We want to sum all of its elements on the major diagonal
        // How would we approach this?
        // By looking at a 4-by-4 matrix, we can let see the row and column's
        // indices matches everytime they're being added
        // Therefore, we can make a nested loop and get the sum when i == j
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = i; j == i; j++) {
                sum += m[i][j];
            }
        }

        return sum;
    }
}
