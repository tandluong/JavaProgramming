import java.util.*;
public class Exercise3_27 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a point's x- and y-coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        // Determine if the point is in the triangle based on the given input
        // The triangle has a height of 100 and base of 200
        final int HEIGHT_OF_TRIANGLE = 100;
        final int BASE_OF_TRIANGLE = 200;

        boolean maxBase = x > 0 && x <= BASE_OF_TRIANGLE;
        boolean maxHeight = y > 0 && y <= HEIGHT_OF_TRIANGLE;

        if (maxHeight && maxBase)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
