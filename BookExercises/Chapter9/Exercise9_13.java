import java.util.Scanner;

public class Exercise9_13 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows and columns in the array: ");
        double[][] matrix = new double[input.nextInt()][input.nextInt()];
        System.out.println("Enter the array: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();

        // Get the largest value in the matrix and the position
        Location.locateLargest(matrix);

        // Display result
        System.out.println("The location of the largest element is " +
                Location.maxValue + " at (" + Location.row + ", " + Location.column + ")");
    }
}
