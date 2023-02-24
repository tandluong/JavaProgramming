import java.util.Scanner;

public class Exercise8_23 {
    public static void main(String[] args) {
        int[][] matrix = matrix();
        flip(matrix);
    }

    public static void flip(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int countRow = 0;
            int countCol = 0;
            int trackRow = 0;
            int trackCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    countRow++;
                if (matrix[j][i] == 1)
                    countCol++;
            }
            if (countRow % 2 != 0)
                trackRow = i;
            if (countCol % 2 != 0)
                trackCol = i;
            if (countCol % 2 != 0)
                System.out.println("The flipped cell is at (" +
                        trackRow + ", " + trackCol + ")");
        }
    }

    public static int[][] matrix() {
        // Initialize 2 dimensional array of ints
        int[][] matrix = new int[6][6];

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextInt();

        return matrix;
    }
}
