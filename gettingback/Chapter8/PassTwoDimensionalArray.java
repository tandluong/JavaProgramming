import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray();

        // Display the sum of the elements
        System.out.print("\nSum of all elements is " + sum(m));
    }

    public static int[][] getArray() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " +
                m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();

        return m;
    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                total += m[row][col];
            }
        }

        return total;
    }
}
