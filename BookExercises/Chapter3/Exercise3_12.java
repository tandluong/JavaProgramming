import java.util.*;
public class Exercise3_12 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a three-digit integer: ");
        int threeDigit = input.nextInt();
        int getDigit = threeDigit;

        // Obtain the three digits from user input
        int digit3 = getDigit % 10;
        getDigit /= 10;
        int digit2 = getDigit % 10;
        getDigit /= 10;
        int digit1 = getDigit;

        // Check if user input is a Palindrome
        // Make sure input is 3 digits
        // Value must be greater than 99, but less than 1000
        if (threeDigit > 99 && threeDigit < 1000) {
            if (digit1 == digit3)
                System.out.println(threeDigit + " is a palindrome");
            else
                System.out.println(threeDigit + " is not a palindrome");
        }
        else
            System.out.println("Please enter a three-digit integer: 100-999");
    }
}
