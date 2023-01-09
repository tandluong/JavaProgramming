import java.util.*;
public class Exercise3_3 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a, b, c, d, e, f: ");
        double userA = input.nextDouble();
        double userB = input.nextDouble();
        double userC = input.nextDouble();
        double userD = input.nextDouble();
        double userE = input.nextDouble();
        double userF = input.nextDouble();

        // Check if ad - bc is 0
        double validSolution = userA * userD - userB * userC;

        // Calculate linear equation
        double x = ((userE * userD) - (userB * userF)) / ((userA * userD) - (userB * userC));
        double y = ((userA * userF) - (userE * userC)) / ((userA * userD) - (userB * userC));

        // Display result
        if(validSolution == 0) {
            System.out.println("The equation has no solution.");
        }
        else {
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
