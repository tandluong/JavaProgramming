public class Exercise8_10 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        int[][] matrix = matrix();
        int largestRow = countRow(matrix);
        int largestCol = countCol(matrix);

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }
        System.out.println("The largest row index: " + largestRow);
        System.out.println("The largest column index: " + largestCol);
    }

    public static int countCol(int[][] matrix) {
        int[] index = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // We are trying to find how many 1's are in each col
                // Therefore, we are going down each column to find how many 1's there are
                // If we see a 1, then at col i, increment it in our array
                if (matrix[j][i] == 1)
                    index[i]++;
            }
        }

        int indexOfMax = 0;
        for (int i = 0; i < index.length - 1 && indexOfMax < index.length; i++)
            if (index[indexOfMax] < index[i + 1])
                indexOfMax = i + 1;

        return indexOfMax;
    }

    public static int countRow(int[][] matrix) {
        // Create a new array with the passed array's length
        int[] index = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // We are trying to find how many 1's are in each row
                // Therefore we will loop through each row and find how many 1's there are
                // If we see a 1, then at row i, increment it in our array
                if (matrix[i][j] == 1)
                    index[i]++;
            }
        }

        int indexOfMax = 0;
        for (int i = 0; i < index.length - 1 && indexOfMax < index.length; i++)
            if (index[indexOfMax] < index[i + 1])
                indexOfMax = i + 1;

        return indexOfMax;
    }

    public static int[][] matrix() {
        // Generate a 4-by-4 matrix filled randomly by 0 and 1s
        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (int) (Math.random() * 2);

        return matrix;
    }
}
