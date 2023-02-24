import java.util.*;
public class Exercise5_1 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int number = input.nextInt();

        // Initialize variables
        int countPos = 0;
        int countNeg = 0;
        double sum = 0;

        while (number != 0) {
            // Increase negative count if number is less than 0
            if (number < 0)
                countNeg++;
            // Increase positive count if number is greater than 0
            if (number > 0)
                countPos++;
            // Add the number to the total sum
            sum += number;

            // Get next input from user if it wasn't 0
            number = input.nextInt();
        }

        // Get the total amount of input
        int totalCount = countPos + countNeg;
        // Find the average of the numbers
        double average = sum / totalCount;

        // If input is greater than 0, then display appropriate results
        if (totalCount > 0) {
            System.out.printf("""
                The number of positives is %d
                The number of negatives is %d
                The total is %.1f
                The average is %.2f""",
                    countPos, countNeg, sum, average);
        }
        else
            System.out.println("No numbers are entered except 0");

    }
}
