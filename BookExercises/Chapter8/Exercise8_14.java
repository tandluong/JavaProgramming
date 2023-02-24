import java.util.Scanner;

public class Exercise8_14 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the size for the matrix: ");
        int size = input.nextInt();
        int[][] matrix = matrix(size);
        printMatrix(matrix);
        findRow(matrix);
        findCol(matrix);
        findMajorDiagonal(matrix);
        findSubDiagonal(matrix);
    }

    public static void findSubDiagonal(int[][] matrix) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = i - 1; j < i; j++) {
                if (matrix[i][j] == 0)
                    count0++;

                if (count0 == 3)
                    System.out.println("All 0s on sub-diagonal");

                if (matrix[i][j] == 1)
                    count1++;

                if (count1 == 3)
                    System.out.println("All 1s on sub-diagonal");
            }
        }

        if (count0 < 3 && count1 < 3)
            System.out.println("No same numbers on the sub-diagonal");
    }

    public static void findMajorDiagonal(int[][] matrix) {
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j == i; j++) {
                if (matrix[i][j] == 0)
                    count0++;

                if (count0 == 4)
                    System.out.println("All 0s on major diagonal");

                if (matrix[i][j] == 1)
                    count1++;

                if (count1 == 4)
                    System.out.println("All 1s on major diagonal");
            }
        }

        if (count0 < 4 && count1 < 4)
            System.out.println("No same numbers on the major diagonal");
    }

    public static void findCol(int[][] matrix) {
        int count0 = 0;
        int count1 = 0;
        int count0Spare = 0;
        int count1Spare = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 0)
                    count0++;

                if (count0 == 4)
                    System.out.println("All 0s on col " + i);

                if (matrix[j][i] == 1)
                    count1++;

                if (count1 == 4)
                    System.out.println("All 1s on col " + i);
            }
            count0Spare = count0;
            count1Spare = count1;
            // reset counts after exiting inner loop
            count0 = 0;
            count1 = 0;
        }

        if (count0Spare < 4 && count1Spare < 4)
            System.out.println("No same numbers on a column");
    }

    public static void findRow(int[][] matrix) {
        int count0 = 0;
        int count1 = 0;
        int count0Spare = 0;
        int count1Spare = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0)
                    count0++;

                if (count0 == 4)
                    System.out.println("All 0s on row " + i);

                if (matrix[i][j] == 1)
                    count1++;

                if (count1 == 4)
                    System.out.println("All 1s on row " + i);
            }
            count0Spare = count0;
            count1Spare = count1;
            // reset counts after exiting inner loop
            count0 = 0;
            count1 = 0;
        }

        if (count0Spare < 4 && count1Spare < 4)
            System.out.println("No same numbers on a row");
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints)
                System.out.print(anInt);

            System.out.println();
        }
    }

    public static int[][] matrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (int)(Math.random() * 2);

        return matrix;
    }
}
