import java.util.*;
public class Exercise5_16 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        // initialize variables
        int factor = num;
        String factors = "";
        // while factor is greater than 1, keep looping
        while (factor > 1) {
            // continue to divide the value by 2
            int divisor = 2;

            // if the value cannot be divided by 2, increment it until it can
            while (factor % divisor != 0) {
                divisor++;
            }

            // once a divisible number is found, then add it into the string
            factors += divisor + ", ";

            // Divide the old value with the found divisible number to get the next number
            factor /= divisor;
        }

        // Display Result
        System.out.printf("Factors of %d are %s", num, factors.substring(0, factors.length() - 2));
    }
}
