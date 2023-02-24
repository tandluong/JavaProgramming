import java.util.*;
public class Exercise3_1 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a, b, c: ");
        double userA = input.nextDouble();
        double userB = input.nextDouble();
        double userC = input.nextDouble();

        // Calculate roots with quadratic formula with user input
        // Check for discriminant value
        double discriminantValue = (userB * userB) - (4 * userA * userC);
        double root1 = (-userB + Math.pow(discriminantValue, 0.5)) / (2 * userA);
        double root2 = (-userB - Math.pow(discriminantValue, 0.5)) / (2 * userA);

        // Display results
        if (discriminantValue > 0) {
            System.out.println("The equation has two roots " + (int)(root1 * 1000000) / 1000000.0 + " and " +
                    (int)(root2 * 1000000) / 1000000.0);
        }
        else if(discriminantValue == 0) {
            System.out.println("The equation has one root " + (int)root1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
