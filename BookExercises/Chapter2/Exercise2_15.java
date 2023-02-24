import java.util.*;

public class Exercise2_15 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter x1 and y1: ");
        double inputX1 = input.nextDouble();
        double inputY1 = input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        double inputX2 = input.nextDouble();
        double inputY2 = input.nextDouble();

        // calculate distance base on input
        double distanceX = Math.pow(inputX2 - inputX1, 2);
        double distanceY = Math.pow(inputY2 - inputY1, 2);
        double totalDistance = Math.pow(distanceX + distanceY, 0.5);

        // Display result
        System.out.println("The distance between the two points is " + totalDistance);
    }
}
