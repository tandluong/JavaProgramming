import java.util.Scanner;

public class Exercise9_12 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[] points = new double[8];
        for (int i = 0; i < points.length; i++)
            points[i] = input.nextDouble();

        LinearEquation intersection = new LinearEquation(points[0], points[1],
                points[2], points[3], points[4], points[5],points[6], points[7]);

        if (intersection.isIntersecting()) {
            double[] intersectionPoints = intersection.getIntersection();
            System.out.println("The intersecting point is at (" +
                    Math.round(intersectionPoints[0] * 100000.0) / 100000.0 +
                    ", " + Math.round(intersectionPoints[1] * 100000) / 100000.0 + ")");
        }
        else
            System.out.println("The two line are parallel");
    }
}
