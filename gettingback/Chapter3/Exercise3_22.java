import java.util.*;
public class Exercise3_22 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a point with two coordinates: ");
        double point1 = input.nextDouble();
        double point2 = input.nextDouble();

        // Radius of given circle
        final int RADIUS_OF_CIRCLE = 10;

        // Calculate if the two given points are inside the circle
        double point1Axis = Math.pow(point1 - 0, 2);
        double point2Axis = Math.pow(point2 - 0, 2);
        double distance = Math.pow(point1Axis + point2Axis, 0.5);
        boolean isInTheCircle = distance <= RADIUS_OF_CIRCLE;

        // Display Result if true
        if (isInTheCircle)
            System.out.println("Point (" + point1 + ", " + point2 + ") is in the circle");
        else
            System.out.println("Point (" + point1 + ", " + point2 + ") is not the circle");
    }
}
