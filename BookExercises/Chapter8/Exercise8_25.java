import java.util.Scanner;

public class Exercise8_25 {
    public static void main(String[] args) {
        double[][] matrix = matrix();
        System.out.println(isMarkovMatrix(matrix) ? "It is a Markov matrix" :
                "It is not a Markov matrix");
    }

    public static double[][] matrix() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize double 3-by-3 matrix
        double[][] matrix = new double[3][3];

        // Prompt user for input
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        return matrix;
    }

    public static boolean isMarkovMatrix(double[][] m) {
        // Initialize a boolean array with m's array length
        boolean[] checkSum = new boolean[m.length];
        for (int i = 0; i < m.length; i++) {
            double sum = 0;
            for (int j = 0; j < m[i].length; j++)
                // sum the column of row[i]
                sum += m[j][i];
            // if sum == 1, then checkSum[i] is true
            if (Math.abs(sum - 1) < 1E-14)
                checkSum[i] = true;
        }

        // Check if all content of checkSum is true
        // If all is true, then return true; else return false
        for (boolean sum : checkSum)
            if (!sum)
                return false;

        return true;
    }
}
