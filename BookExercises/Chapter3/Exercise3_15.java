import java.util.*;
public class Exercise3_15 {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = 100 + (int)(Math.random() * 900);

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Hold lottery and guess numbers seperately
        int lotteryDigit = lottery;
        int guessDigit = guess;

        // Get digits from guess
        int guessDigit3 = guessDigit % 10;
        guessDigit /= 10;
        int guessDigit2 = guessDigit % 10;
        guessDigit /= 10;
        int guessDigit1 = guessDigit;

        // Get digits from lottery
        int lotteryDigit3 = lotteryDigit % 10;
        lotteryDigit /= 10;
        int lotteryDigit2 = lotteryDigit % 10;
        lotteryDigit /= 10;
        int lotteryDigit1 = lotteryDigit;



        // Check the guess
        // Check if guess is within 3 digits range
        if (guess < 1000 && guess > 99) {
            System.out.println("The lottery number is: " + lottery);
            if (guess == lottery) {
                System.out.println("Exact match: ypu win $10,000");
            }
            else if (guessDigit2 == lotteryDigit1
                    && guessDigit1 == lotteryDigit2
                    && guessDigit3 == lotteryDigit3) {
                System.out.println("Match all digits: you win $3,000");
            }
            else if (guessDigit1 == lotteryDigit1
                    || guessDigit1 == lotteryDigit2
                    || guessDigit1 == lotteryDigit3
                    || guessDigit2 == lotteryDigit1
                    || guessDigit2 == lotteryDigit2
                    || guessDigit2 == lotteryDigit3
                    || guessDigit3 == lotteryDigit1
                    || guessDigit3 == lotteryDigit2
                    || guessDigit3 == lotteryDigit3) {
                System.out.println("Match one digit: you win $1,000");
            }
            else {
                System.out.println("Sorry, no match");
            }
        }
        else
            System.out.println("Please enter a three-digit number");
    }
}
