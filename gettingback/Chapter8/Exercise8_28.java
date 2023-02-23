import java.util.Scanner;

public class Exercise8_28 {
    public static void main(String[] args) {
        int number = 1;
        int[][] m1 = list(number++);
        int[][] m2 = list(number);

        String identical = "The two arrays are strictly identical";
        String notIdentical = "The two arrays are not strictly identical";
        System.out.println(equals(m1, m2) ? identical : notIdentical);
    }

    public static int[][] list(int n) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 3-by-3 matrix
        int[][] matrix = new int[3][3];

        // Prompt user for input
        System.out.print("Enter list" + n + ": ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextInt();

        return matrix;
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length && i < m2.length; i++) {
            for (int j = 0; j < m1[i].length && j < m2[i].length; j++) {
                if (m1[i][j] != m2[i][j])
                    return false; // If the numbers don't match, then return false;
            }
        }

        // The two arrays are identical
        return true;
    }
}
