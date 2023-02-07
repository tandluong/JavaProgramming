import java.util.Scanner;

public class Exercise6_22 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        long num = input.nextLong();

        // Display result
        displayResult(num);
    }

    public static double sqrt(long n) {
        double lastGuess = n;
        double nextGuess = (lastGuess + n / lastGuess) / 2;

        final double EPSILON = 0.0001;

        while (lastGuess > 0) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;

            if (Math.abs(nextGuess - lastGuess) < EPSILON)
                break;
        }

        return nextGuess;
    }

    public static void displayResult(long n) {
        if (n >= 0)
            System.out.println("The sqrt of " + n + " is " + (int)(sqrt(n) * 1000) / 1000.0);
        else
            System.out.println("The number must be a positive integer");
    }
}
