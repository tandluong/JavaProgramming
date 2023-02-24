import java.util.*;
public class Exercise3_26 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Determine if the number is divisible by 5 and/or 6, but not both
        boolean divisibleBy5AND6 = number % 5 == 0 && number % 6 == 0;
        boolean divisibleBy5OR6 = number % 5 == 0 || number % 6 == 0;
        boolean divisibleBy5OR6ButNotBoth = number % 5 == 0 ^ number % 6 == 0;

        // Display Result
        System.out.println("Is " + number + " divisible by 5 and 6? " + divisibleBy5AND6);
        System.out.println("Is " + number + " divisible by 5 or 6? " + divisibleBy5OR6);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + divisibleBy5OR6ButNotBoth);
    }
}
