import java.util.Scanner;

public class Exercise8_13 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        double[][] a = getArray();

        int[] location = locateLargest(a);

        System.out.println("The location of the largest element is at ("
                + location[0] + ", " + location[1] + ")");
    }

    public static double[][] getArray() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] a = new double[input.nextInt()][input.nextInt()];
        System.out.println("Enter the array: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();

        return a;
    }

    public static int[] locateLargest(double[][] a) {
        // We want to find the max in the 2-dimensional array a
        // How would we approach this?
        // We will loop through the array and find it's max
        // Create two int variables to find its row and column

        // Initialize one dimensional int array
        int[] location = new int[2];
        int row = 0;
        int col = 0;
        double max = a[row][col];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max < a[i][j]) {
                    row = i;
                    col = j;
                    // update array's values
                    location[0] = row;
                    location[1] = col;
                    // update new max
                    max = a[row][col];
                }
            }
        }

        return location;
    }
}
