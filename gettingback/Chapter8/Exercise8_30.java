import java.util.Scanner;

public class Exercise8_30 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 2-by-2 matrix
        double[][] a = new double[2][2];
        // Initialize an array for b
        double[] b = new double[2];

        // Prompt user for input
        System.out.print("Enter a00, a01, a10, a11, b0, and b1: ");
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = input.nextDouble();

        for (int k = 0; k < b.length; k++)
            b[k] = input.nextDouble();

        double[] result = linearEquation(a, b);
        if (result != null)
            System.out.println("x is " + result[0] + " and y is " + result[1]);
        else
            System.out.println("The equation has no solution");

    }

    public static double[] linearEquation(double[][] a, double[] b) {
        // Initialize double array to hold x and y
        double[] solution = new double[2];

        // If the divider is 0, return null since we cannot divide by 0
        if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0)
            return null;
        else {
            // Compute x and y
            solution[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
            solution[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        }

        return solution;
    }
}
