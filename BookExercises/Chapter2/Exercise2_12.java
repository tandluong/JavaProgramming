import java.util.*;

public class Exercise2_12 {
    public static void main(String[] args) {
        // create Scanner Object
        Scanner input = new Scanner(System.in);
        // prompt user for input
        System.out.print("Enter the speed and acceleration: ");
        double userSpeed = input.nextDouble();
        double userAcceleration = input.nextDouble();

        // calculate speed and acceleration base on user input
        double finalSpeed = userSpeed * userSpeed;
        double finalAcceleration = userAcceleration * 2;

        // calculate the length based on speed and acceleration
        double runwayLength = finalSpeed / finalAcceleration;

        // Display Result
        System.out.println("The minimum runway length for this airplane is " + Math.round(runwayLength * 1000) / 1000.0);
    }
}
