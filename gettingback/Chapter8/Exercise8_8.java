import java.util.Arrays;
import java.util.Scanner;

public class Exercise8_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = distance(points[p1][0], points[p1][1],
                points[p2][0], points[p2][1]);

        // Now we want to find all closest pairs of points with the same minimum distance
        final double EPSILON = 1E-14;
        // Initialize a new array to store the points
        String[] closestPoints = new String[points.length];
        // Initialize the strings to be empty
        Arrays.fill(closestPoints, "");

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1],
                        points[j][0], points[j][1]); // Find distance

                if (shortestDistance > distance) {
                    shortestDistance = distance; // Update shortestDistance
                }

                if (Math.abs(shortestDistance - distance) < EPSILON) {
                    p1 = i; // Update p1
                    p2 = j; // Update p2
                    closestPoints[j] = "The closest two points are ("
                            + points[p1][0] + ", " + points[p1][1] +
                            ") and (" + points[p2][0] + ", " + points[p2][1] + ")";
                }
            }
        }

        // Display result
        for (String s : closestPoints)
            if (!s.isEmpty())
                System.out.println(s);

        System.out.println("Their distance is " + shortestDistance);
    }

    // Compute the distance between two points (x1, y1) and (x2, y2)
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
