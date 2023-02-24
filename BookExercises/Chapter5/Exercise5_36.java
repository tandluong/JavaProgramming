import java.util.*;
public class Exercise5_36 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int userInput = input.nextInt();
        int remainingInput = userInput;

        int digits;
        int digit1 = -1;
        int sum = 0;
        int count = 9;
        // Get individual integers from the user input
        while (remainingInput > 0) {
            digits = remainingInput % 10;
            if (remainingInput < 99) {
                digit1 = digits;
            }
            sum += digits * count;
            count--;
            remainingInput /= 10;
        }
        // Calculate the ISBN-10 checksum by sum % 11;
        int checkSum = sum % 11;

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
