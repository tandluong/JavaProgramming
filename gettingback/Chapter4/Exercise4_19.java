import java.util.*;
public class Exercise4_19 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String userInput = input.next();

        // Extract each individual Substring from String and parse it to Integer
        int digit1 = Integer.parseInt(userInput.substring(0, 1));
        int digit2 = Integer.parseInt(userInput.substring(1, 2));
        int digit3 = Integer.parseInt(userInput.substring(2, 3));
        int digit4 = Integer.parseInt(userInput.substring(3, 4));
        int digit5 = Integer.parseInt(userInput.substring(4, 5));
        int digit6 = Integer.parseInt(userInput.substring(5, 6));
        int digit7 = Integer.parseInt(userInput.substring(6, 7));
        int digit8 = Integer.parseInt(userInput.substring(7, 8));
        int digit9 = Integer.parseInt(userInput.substring(8, 9));

        // Calculate the ISBN-10 checksum
        int checkSum = (digit1 * 1 + digit2 * 2 + digit3 * 3 + digit4 * 4+ digit5 * 5 + digit6 * 6 +
                digit7 * 7 + digit8 * 8 + digit9 * 9) % 11;

        // Display Result
        if (checkSum == 10 && digit1 == 0)
            System.out.print("The ISBN-10 number is " + userInput + "X");
        else if (checkSum == 10)
            System.out.print("The ISBN-10 number is " + userInput + "X");
        else if (digit1 == 0)
            System.out.print("The ISBN-10 number is " + userInput + "" + checkSum);
        else
            System.out.print("The ISBN-10 number is " + userInput + "" + checkSum);
    }
}
