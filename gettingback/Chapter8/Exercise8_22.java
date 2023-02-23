public class Exercise8_22 {
    public static void main(String[] args) {
        int[][] matrix = randomMatrix();
        printMatrix(matrix);
        checkEven(matrix);
    }

    public static void checkEven(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int countRow = 0;
            int countCol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    countRow++;
                if (matrix[j][i] == 1)
                    countCol++;

            }
            if (countRow % 2 == 0)
                System.out.println("Row " + i + " has an even number of 1s");
            if (countCol % 2 == 0)
                System.out.println("Column " + i + " has an even number of 1s");
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] intArray : matrix) {
            for (int ints : intArray) {
                System.out.print(ints + " ");
            }
            System.out.println();
        }
    }

    public static int[][] randomMatrix() {
        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                // random 0s and 1s
                matrix[i][j] = (int)(Math.random() * 2);

        return matrix;
    }
}
