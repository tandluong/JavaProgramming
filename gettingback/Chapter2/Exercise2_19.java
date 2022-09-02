import java.util.*;

public class Exercise2_19 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter three points for a triangle (i.e, 1 2 3 4 5 6): ");
        double inputX1 = input.nextDouble();
        double inputY1 = input.nextDouble();
        double inputX2 = input.nextDouble();
        double inputY2 = input.nextDouble();
        double inputX3 = input.nextDouble();
        double inputY3 = input.nextDouble();

        // calculate the total distance of all the sides, s
        /* How do one come up with the formula for the sides?
        Picture a triangle with 3 points at its tip. A triangle only has 3 sides. ( /_\ )
        We need to find the distance of each of its sides.
        Assume (x1, y1) to be at the point at the top, (x2, y2) at bottom left, and (x3, y3) bottom right.
        Therefore, the distance for side1 can be the distance from top to the bottom left ( / ) of the triangle.
        side2 can be from the bottom left to the bottom right ( _ ).
        lastly, side3 can be the bottom right to the top ( \ ) */
        double side1 = Math.pow(Math.pow(inputX2 - inputX1, 2) + Math.pow(inputY2 - inputY1 , 2), 0.5);
        double side2 = Math.pow(Math.pow(inputX3 - inputX2, 2) + Math.pow(inputY3 - inputY2 , 2), 0.5);
        double side3 = Math.pow(Math.pow(inputX1 - inputX3, 2) + Math.pow(inputY1 - inputY3 , 2), 0.5);
        double triangleSide = (side1 + side2 + side3) / 2;

        // Calculate the triangle
        double triangleArea = Math.pow(triangleSide * (triangleSide - side1) * (triangleSide - side2) *
                (triangleSide - side3), 0.5);

        // Display Result
        System.out.println("The area of the triangle is " + Math.round(triangleArea * 10) / 10.0);
    }
}
