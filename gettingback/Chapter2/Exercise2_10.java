import java.util.*;

public class Exercise2_10 {
    public static void main(String[] args) {
        // create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the amount of water in kilograms: ");
        double waterWeight = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();

        // Calculate energy
        double energyRequired = waterWeight * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("The energy required is " + (int)(energyRequired * 10) / 10.0);
    }
}
