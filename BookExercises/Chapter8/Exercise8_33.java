import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_33 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize a 4-by-2 double array
        double[][] coordinates = new double[4][2];

        // Prompt user for input
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for (int i = 0; i < coordinates.length; i++)
            for (int j = 0; j < coordinates[i].length; j++)
                coordinates[i][j] = input.nextDouble();

        double[] areas = fourVertexPolygonArea(coordinates);

        // Sort areas array
        Arrays.sort(areas);

        // Display result
        System.out.print("The areas are ");
        for (double a : areas)
            System.out.print(Math.round(a * 100) / 100.0 + " ");
    }

    public static double[] fourVertexPolygonArea(double[][] vertex) {
        // Given 4 vertices, how do we find the area?
        /* We need to know where all the points will intersect,
            that will be the point to find the area of all the sub triangles
         */
        // Initialize double array
        double[] areas = new double[vertex.length];

        // Get intersecting points x and y
        double[] intersection = getIntersectingPoint(vertex);

        for (int i = 0; i < areas.length; i++) {
            double[][] trianglePoints = new double[3][2];
            trianglePoints[0] = vertex[i % 4];
            trianglePoints[1] = vertex[(i + 1) % 4];
            trianglePoints[2] = intersection;
            areas[i] = getTriangleArea(trianglePoints);
        }

        return areas;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        // Calculate the intersecting points
        // Use the formula from Programming Exercise1_13 and Exercise3_25
        // We are going from V1 to V3 and V2 to V4
        // Let a, b, e be V1 to V3 and c, d, f be V2 to V4
        // It will deduce the formula to this
        double a = points[0][1] - points[2][1];
        double b = - (points[0][0] - points[2][0]);
        double e = (points[0][1] - points[2][1]) * points[0][0] -
                (points[0][0] - points[2][0]) * points[0][1];
        double c = points[1][1] - points[3][1];
        double d = - (points[1][0] - points[3][0]);
        double f = (points[1][1] - points[3][1]) * points[1][0] -
                (points[1][0] - points[3][0]) * points[1][1];

        // initialize array to hold content of x and y
        double[] solution = new double[2];
        double determinant = a * d - b * c;
        // Now we will solve for x and y
        if (determinant != 0) {
            // x
            solution[0] = (e * d - b * f) / determinant;
            // y
            solution[1] = (a * f - c * e) / determinant;
        }
        else
            return null;

        return solution;
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
