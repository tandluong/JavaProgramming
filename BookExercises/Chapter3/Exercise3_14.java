import java.util.*;
public class Exercise3_14 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Generate random number between 0-1
        int randomNumber = (int)(Math.random() * 2);

        // Prompt user for input
        System.out.print("Enter 0 or 1 to guess the flip! 0 for heads; 1 for tails: ");
        int guess = input.nextInt();
        String flip = switch (randomNumber) {
            case 0: yield "heads";
            case 1: yield "tails";
            default: throw new IllegalArgumentException(randomNumber + "is incorrect");
        };

        // Check if user input is between 0 or 1
        // Display result
        if (guess >= 0 && guess < 2) {
            if (guess == randomNumber) {
                System.out.println("Your guess " + guess + " is correct! " +
                        "The flip was " + flip);
            }
            else
                System.out.println("Your guess " + guess + " is incorrect! " +
                        "The flip was " + flip);
        }
        else
            System.out.println("Please enter 0 or 1");
    }
}
