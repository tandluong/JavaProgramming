import java.util.*;
public class Exercise3_23 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a point with two coordinates: ");
        double point1 = input.nextDouble();
        double point2 = input.nextDouble();

        // Define the given variables
        final int WIDTH_OF_RECTANGLE = 10;
        final int HEIGHT_OF_RECTANGLE = 5;

        // Check if the two points are within the rectangle
        double maxWidth = WIDTH_OF_RECTANGLE / 2;
        double maxHeight = HEIGHT_OF_RECTANGLE / 2;
        // Make sure all cases are checked
        boolean validWidth = point1 <= maxWidth && point1 >= -maxWidth;
        boolean validHeight = point2 <= maxHeight & point2 >= -maxHeight;

        // Display result
        if(validWidth && validHeight)
            System.out.println("Point (" + point1 + ", " + point2 + ") is in the rectangle");
        else
            System.out.println("Point (" + point1 + ", " + point2 + ") is not in the rectangle");
    }
}
