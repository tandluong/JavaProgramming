import java.util.*;
public class TestDoWhile {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        int data;
        int sum = 0;

        // Keep reading data until the input is 0
        do {
            // Prompt user for inout
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while (data != 0);

        // Display Result
        System.out.printf("The sum is %d", sum);
    }
}
