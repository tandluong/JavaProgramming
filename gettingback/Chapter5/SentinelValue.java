import java.util.*;
public class SentinelValue {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        // Keep reading data until input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            // Read the next input
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        // Display result once while condition is met
        System.out.printf("The sum is %d", sum);
    }
}
