import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        // Display result
        System.out.printf("The sum of all its digits %d is %d", number, sumDigits(number));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        // We take in n and find its "last" digit e.g., 234 would be 4
        // Then we will divide 234 by 10 = 23.4 = 23 (int)
        // Since 23 > 0, we will extract the next "last" digit 3
        // 23 / 10 = 2.3 = 2 (int) > 0; then we will extract the last digit 2
        // And finally, n > 0 is false, and we obtain the sum of all the digits in the integer
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
