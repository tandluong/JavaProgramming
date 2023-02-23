import java.util.Scanner;

public class Exercise8_1 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        double[] sum = storeSum();

        for (int i = 0; i < sum.length; i++)
            System.out.println("Sum of all the elements at column " + i +
                    " is " + sum[i]);
    }

    public static double[] storeSum() {
        // We want to store all the column sum from
        // two-dimensional array m into a one-dimensional array sum
        double[][] m = getArray();
        double[] sum = new double[m[0].length];

        for (int i = 0; i < m[0].length; i++) {
            sum[i] = sumColumn(m, i);
        }

        return sum;
    }

    public static double[][] getArray() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 3-by-4 array
        double[][] numbers = new double[3][4];

        // Prompt user for input
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers[i].length; j++)
                numbers[i][j] = input.nextDouble();

        return numbers;
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        // We want to sum all the column
        // How would we do this?
        // We will create a nested loop to go through our 2D array
        // the outer loop will give us our row placement and the inner loop
        // will give us the column
        // Therefore, given the column index, we will loop through the array
        // until we reach the specified column and add it

        double sum = 0;
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                if (j == columnIndex)
                    sum += m[i][columnIndex];

        return sum;
    }
}
