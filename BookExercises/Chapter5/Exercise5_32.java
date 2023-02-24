import java.util.*;

public class Exercise5_32 {
    public static void main(String[] args) {
        // Generate a lottery number
        int lottery = (int) (10 + Math.random() * 90);

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        // Get digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // If the 1st and 2nd digit are the same, then randomize the 2nd digit
        while (lotteryDigit1 == lotteryDigit2) {
            lotteryDigit2 = (int) (Math.random() * 10);
        }
        // Once the 2nd digit is no longer the same, then
        // reverse the 1st digit by multiplying by 10 and adding the new 2nd digit
        lottery = (lotteryDigit1 * 10) + lotteryDigit2;
        System.out.println("The lottery number is: " + lottery);

        // Check the guess
        if (guess == lottery) {
            System.out.println("Exact match: ypu win $10,000");
        } else if (guessDigit2 == lotteryDigit1
                && guessDigit1 == lotteryDigit2) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
