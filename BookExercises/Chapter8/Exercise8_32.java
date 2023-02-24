import java.util.Scanner;

public class Exercise8_32 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 3-by-2 double array
        double[][] points = new double[3][2];

        // Prompt user for input
        System.out.print("Enter x1, y1, x2, y2, x3, y3: ");
        for (int i = 0; i < points.length; i++)
            for (int j = 0; j < points[i].length; j++)
                points[i][j] = input.nextDouble();

        double area = getTriangleArea(points);

        String validArea = "The area of the triangle is " + (int)(area * 100) / 100.0;
        String invalidArea = "The three points are on the same line";
        // We should not use a == comparison for floating point values
        // Thus we should say is area less than a very small number, e.g., 1E-14 instead of area == 0
        System.out.println(area < 1E-14 ? validArea : invalidArea);
    }

    public static double getTriangleArea(double[][] points) {
        // Equation from Exercise2_19
        // Modified to get data from 2 dimensional array instead of input
        double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) +
                Math.pow(points[1][1] - points[0][1], 2), 0.5);
        double side2 = Math.pow(Math.pow(points[2][0] - points[1][0], 2) +
                Math.pow(points[2][1] - points[1][1], 2), 0.5);
        double side3 = Math.pow(Math.pow(points[0][0] - points[2][0], 2) +
                Math.pow(points[0][1] - points[2][1], 2), 0.5);
        double triangleSide = (side1 + side2 + side3) / 2;

        // Calculate the triangle
        return Math.pow(triangleSide * (triangleSide - side1) * (triangleSide - side2) *
                (triangleSide - side3), 0.5);
    }
}
