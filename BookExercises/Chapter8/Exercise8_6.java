import java.util.Scanner;

public class Exercise8_6 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        // We are using the same code made in Exercise8_5
        // The only change made is calling multiplyMatrix instead of addMatrix for double[][] c

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

        double[][] c = multiplyMatrix(a, b);
        // Format the result
        System.out.println("The matrices are added as follows");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                System.out.print(a[i][j] + " ");

            if (i == 1)
                System.out.print(" *  ");
            else
                System.out.print("    ");

            for (int j = 0; j < b[i].length; j++)
                System.out.print(b[i][j] + " ");

            if (i == 1)
                System.out.print(" =  ");
            else
                System.out.print("    ");

            for (int j = 0; j < c[i].length; j++)
                System.out.print((int)(c[i][j] * 10) / 10.0 + " ");

            System.out.println();
        }
    }

    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b.length];

        // How would we find the multiplication of a and b?
        // To find the multiplication of c, it is described as
        // multiplying the row of A with the column of B
        // i.e., if the matrix is a 3-by-3 matrix, then
        // c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]
        // c[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0] + a[0][2] * b[2][0]

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                c[i][j] += a[i][0] * b[0][j] +
                        a[i][1] * b[1][j] +
                        a[i][2] * b[2][j];
            }
        }

        return c;
    }
}
