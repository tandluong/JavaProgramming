import java.util.*;
public class Exercise3_9 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int userInput = input.nextInt();
        int remainingInput = userInput;

        // Get individual integers from the user input
        int digit9 = remainingInput % 10;
        remainingInput /= 10;
        int digit8 = remainingInput % 10;
        remainingInput /= 10;
        int digit7 = remainingInput % 10;
        remainingInput /= 10;
        int digit6 = remainingInput % 10;
        remainingInput /= 10;
        int digit5 = remainingInput % 10;
        remainingInput /= 10;
        int digit4 = remainingInput % 10;
        remainingInput /= 10;
        int digit3 = remainingInput % 10;
        remainingInput /= 10;
        int digit2 = remainingInput % 10;
        remainingInput /= 10;
        int digit1 = remainingInput % 10;

        // Calculate the ISBN-10 checksum
        int checkSum = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4+ digit5 * 5 + digit6 * 6 +
                digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;

        // Display Result
        if (checkSum == 10 && digit1 == 0)
            System.out.print("The ISBN-10 number is 0" + userInput + "X");
        else if (checkSum == 10)
            System.out.print("The ISBN-10 number is " + userInput + "X");
        else if (digit1 == 0)
            System.out.print("The ISBN-10 number is 0" + userInput + "" + checkSum);
        else
            System.out.print("The ISBN-10 number is " + userInput + "" + checkSum);
    }
}
