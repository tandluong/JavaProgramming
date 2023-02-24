import java.util.*;
public class Exercise2_23 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the driving distance: ");
        double userDistance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double userMPG = input.nextDouble();
        System.out.print("Enter the price per gallon: ");
        double userPPG = input.nextDouble();

        // Calculate the cost of driving
        double costOfDriving = (userDistance / userMPG) * userPPG;

        // Display Results
        System.out.println("The cost of driving is: $" + (int)(costOfDriving * 100) / 100.0);
    }
}
