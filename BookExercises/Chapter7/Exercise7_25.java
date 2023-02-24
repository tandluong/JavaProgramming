import java.util.Scanner;

public class Exercise7_25 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize double array
        double[] coefficients = new double[3];

        // Prompt user for input
        System.out.print("Enter values for a, b, and c: ");
        for (int i = 0; i < coefficients.length; i++)
            coefficients[i] = input.nextDouble();

        // Invoke method
        int numberOfRoots = solveQuadratic(coefficients, findRoots(coefficients));

        // Display the numbers of real roots and all real roots
        System.out.println("The number of real roots and all real roots are: " + numberOfRoots);
        for (double r : findRoots(coefficients))
            System.out.print(r + " ");
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        // return the numbers of real roots
        return roots.length;
    }

    public static double[] findRoots(double[] eqn) {
        // eqn array = coefficients
        // Thus, eqn[0] = a; eqn[1] = b; eqn[2] = c;
        double discriminantValue = (eqn[1] * eqn[1]) - (4 * eqn[0] * eqn[2]);
        double root1 = (-eqn[1] + Math.pow(discriminantValue, 0.5)) / (2 * eqn[0]);
        double root2 = (-eqn[1] - Math.pow(discriminantValue, 0.5)) / (2 * eqn[0]);

        double[] roots = new double[0];
//        System.out.print(discriminantValue);
        if (discriminantValue > 0) {
            roots = new double[]{root1, root2};
        }
        else if(discriminantValue == 0) {
            roots = new double[]{root1};
        }

        return roots;
    }
}
