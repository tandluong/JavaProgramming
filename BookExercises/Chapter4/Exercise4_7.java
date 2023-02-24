import java.util.*;
public class Exercise4_7 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the radius of the bounding circle: ");
        int radius = input.nextInt();

        // The book uses this as the value of PI instead of the full value of Math.PI
        final double PI = 3.14159;

        // Find the 5 coordinates on the pentagon
        // Declare the pentagon starting point then increment
        double startingPoint = PI / 10;
        // We know that a pentagon has 5 sides
        // A circle has 360 degrees or 2 PI; divide the circle into 5 for 5 total points
        double incrementPoint = 2 * PI / 5;
        double point1Angle = startingPoint;
        double point2Angle = point1Angle + incrementPoint;
        double point3Angle = point2Angle + incrementPoint;
        double point4Angle = point3Angle + incrementPoint;
        double point5Angle = point4Angle + incrementPoint;

        // Find their coordinates
        double point1x = radius * Math.cos(point1Angle);
        double point1y = radius * Math.sin(point1Angle);
        double point2x = radius * Math.cos(point2Angle);
        double point2y = radius * Math.sin(point2Angle);
        double point3x = radius * Math.cos(point3Angle);
        double point3y = radius * Math.sin(point3Angle);
        double point4x = radius * Math.cos(point4Angle);
        double point4y = radius * Math.sin(point4Angle);
        double point5x = radius * Math.cos(point5Angle);
        double point5y = radius * Math.sin(point5Angle);

        // Display results
        // To get the same output display as the text book
        System.out.printf("""
                        The coordinates of five points on the pentagon are
                        (%.4f, %.4f)
                        (%.9f, %.0f)
                        (%.4f, %.4f)
                        (%.4f, %.4f)
                        (%.4f, %.3f)""",
                point1x, point1y, point2x, point2y, point3x, point3y, point4x, point4y, point5x, point5y);
    }
}
