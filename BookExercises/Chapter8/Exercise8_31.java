import java.util.Scanner;

public class Exercise8_31 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 4-by-2 matrix
        double[][] points = new double[4][2];

        // Prompt user for input
        System.out.print("Enter four points: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();

        double[] solution = getIntersectingPoint(points);
        if (solution != null)
            System.out.printf("The intersecting points is at (" +
                    "%.5f" + ", " + "%.4f" + ")\n", solution[0], solution[1]);
        else
            System.out.println("The two lines are parallel");
    }

    public static double[] getIntersectingPoint(double[][] points) {
        // Calculate the intersecting points
        // Use the formula from Programming Exercise1_13 and Exercise3_25
        // It will deduce the formula to this
        int X = 0, Y = 1;
        double a = points[0][Y] - points[1][Y];
        double b = - (points[0][X] - points[1][X]);
        double e = (points[0][Y] - points[1][Y]) * points[0][X] -
                (points[0][X] - points[1][X]) * points[0][Y];
        double c = points[2][Y] - points[3][Y];
        double d = - (points[2][X] - points[3][X]);
        double f = (points[2][Y] - points[3][Y]) * points[2][X] -
                (points[2][X] - points[3][X]) * points[2][Y];

        // initialize array to hold content of x and y
        double[] solution = new double[2];
        double determinant = a * d - b * c;
        // Now we will solve for x and y
        if (determinant != 0) {
            // x
            solution[0] = (e * d - b * f) / determinant;
            // y
            solution[1] = (a * f - e * c) / determinant;
        }
        else
            return null;

        return solution;
    }
}
