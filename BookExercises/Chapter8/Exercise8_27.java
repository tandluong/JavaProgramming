public class Exercise8_27 {
    public static void main(String[] args) {
        // We can reuse Exercise8_26 methods to create an array
        double[][] matrix = Exercise8_26.matrix();
        double[][] matrixSortColumns = sortColumns(matrix);

        // Print the sorted matrix
        System.out.println("\nThe column-sorted array is");
        for (double[] row : matrixSortColumns) {
            for (double col : row) {
                System.out.printf(col + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortColumns(double[][] m) {
        // Initialize a new double 2-d array to manipulate and return
        double[][] n = new double[m.length][m[0].length];
        // Copy contents of array m to array n
        for (int i = 0; i < m.length; i++)
            System.arraycopy(m[i], 0, n[i], 0, m[i].length);

        // Sort each col
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length - 1; j++) {
                if (n[j][i] > n[j + 1][i]) {
                    double temp = n[j][i];
                    n[j][i] = n[j + 1][i];
                    n[j + 1][i] = temp;
                }
            }
        }

        return n;
    }
}
