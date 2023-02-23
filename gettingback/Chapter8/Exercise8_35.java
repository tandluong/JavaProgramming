import java.util.Scanner;

public class Exercise8_35 {
    public static void main(String[] args) {
        test();
        /* 1 0 1 0 1
           1 1 1 0 1
           1 0 1 1 1
           1 0 1 1 1
           1 0 1 1 1
         */
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = input.nextInt();

        // Create square matrix based on input
        int[][] matrix = new int[rows][rows];
        System.out.println("Enter the matrix row by row: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextInt();

        int[] largestBlock = findLargestBlock(matrix);

        // Display result
        System.out.println("\nThe maximum square submatrix is at (" +
                largestBlock[0] + ", " + largestBlock[1] + ") with size " + largestBlock[2]);
    }

    public static int[] findLargestBlock(int[][] m) {
        // How would we find the largest block?
        // We would have to loop inside the matrix and find 1s
        // What are the conditions to be the largest block?
        // We have to find the sub-matrices
        // Such that we will start a (0,0) proceed to (1,1) then (2,2) and so on
        // until a sub-matrix of 1s is found

        // Assume the largest block starts at (0,0)
        int x = 0;
        int y = 0;
        int size = 0;

        boolean first = true;
        for (int i = 0; i < m.length; i++) {
            int countRow = 0;
            int countCol = 0;
            for (int j = i; j < m[i].length; j++) {
                // Check if all rows are 1s
                if (m[i][j] == 1)
                    countRow++;
                // Check if all columns are 1s
                if (m[j][i] == 1)
                    countCol++;
            }
            // If the row and column have the same amount of 1s, then save that location
            if (first && countRow == countCol) {
                x = i;
                y = i;
                first = false;
            }
            // If the row and column have the same amount of 1s, then increase the size
            if (countRow == countCol) {
                size++;
            }
            // If the row and columns do not match, then reset variables
            else {
                x = 0;
                y = 0;
                size = 0;
                first = true;
            }
        }

        return new int[] {x, y, size};
    }
}
