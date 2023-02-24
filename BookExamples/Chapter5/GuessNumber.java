import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Generate a random number between 0 - 100
        int number = (int)(Math.random() * 101);

        // Prompt user for input
        System.out.print("Guess a magic number between 0 and 100");

        int guess = -1;
        while (guess != number) {
            // Prompt user to guess the number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number)
                System.out.printf("Yes, the number is %d", number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}
