import java.util.*;
public class Exercise5_41 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter numbers: ");
        int num = input.nextInt();

        int max = num;
        int count = 1;

        while (num != 0) {
            num = input.nextInt();

            // If the next input is the same as max, then increment count
            if (max == num) {
                count++;
            }
            // If the next input is greater than the current max
            // That input is now the new max
            // Reset count occurrence back to 1
            if (max < num) {
                max = num;
                count = 1;
            }
        }

        // Display Result
        System.out.printf("The largest number is %d", max);
        System.out.printf("\nThe occurrence count of the largest number is %d", count);
    }
}
