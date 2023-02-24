import java.util.Scanner;

public class Exercise8_5 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize 2 3-by-3 matrix
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        // Prompt user for input
        System.out.print("Enter matrix1: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }
        System.out.print("Enter matrix2: ");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = input.nextDouble();
            }
        }

        double[][] c = addMatrix(a, b);
        // Format the result
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");

            if (i == 1)
                System.out.print(" +  ");
            else
                System.out.print("    ");

            for (int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j] + " ");

            if (i == 1)
                System.out.print(" =  ");
            else
                System.out.print("    ");

            for (int j = 0; j < c[i].length; j++)
                System.out.print(c[i][j] + " ");

            System.out.println();
        }
    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b.length];

        // We want to add the sum of a and b at their specific row and column
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        return c;
    }
}
