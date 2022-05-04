import java.util.*;

public class Exercise2_6 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number between 0 and 1000: ");
        short number = input.nextShort();

        // Keep initial input
        short originalNumber = number;

        // Compute
        // Obtain the last number, i.e., 123 = 3
        int number1 = number % 10;
        // Remove the obtained last number, i.e., 123 = 12
        number /= 10;
        // Obtain the next last number, i.e., 12 = 2
        int number2 = number % 10;
        // Remove the obtained last number, i.e., 12 = 1
        number /= 10;
        // Obtain the next last number, i.e., 1 = 1
        int number3 = number % 10;
        // Remove the obtained last number, i.e., 1 = 0
        number /= 10;
        // Obtain the next last number, i.e., 0 = 0
        // This is necessary for the number 1000
        int number4 = number % 10;
        // Add up all the numbers
        int sumOfAllNumbers = number1 + number2 + number3 + number4;

        // Display result
        System.out.println("The sum of the digits of " + originalNumber + " is " + sumOfAllNumbers);
    }
}
