import java.util.Scanner;

public class Exercise8_34 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize 6-by-2, 2 dimensional array
        double[][] points = new double[6][2];

        // Prompt user for input
        System.out.print("Enter 6 points: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();

        double[] rightmostLowestPoint = getRightmostLowestPoint(points);

        System.out.println("The rightmost lowest point is (" +
                rightmostLowestPoint[0] + ", " + rightmostLowestPoint[1] + ")");
    }

    public static double[] getRightmostLowestPoint(double[][] points) {
        // How do we determine which point are the rightmost lowest point?
        // Given a set of points, the rightmost lowest points would have to be
        // furthest to the right on the x-axis and lowest on the y-axis
        // Meaning the highest x-axis and lowest y-axis

        // Assume the first two points are the rightmost lowest points
        double x = points[0][0];
        double y = points[0][1];

        for (int i = 1; i < points.length; i++) {
            // if initial x is less than the next x and initial y is greater than next y
            // replace x and y;
            if (x <= points[i][0] && y >= points[i][1]) {
                x = points[i][0];
                y = points[i][1];
            }
        }

        return new double[] {x, y};
    }
}
