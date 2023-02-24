import java.util.Scanner;

public class Exercise7_14 {
    public static void main(String[] args ) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize int array
        int[] numbers = new int[5];

        // Prompt user for input
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Display result
        System.out.print("The gcd for these numbers is: " + gcd(numbers));
    }

    public static int min(int[] numbers) {
        int min = numbers[0];
        for (int n : numbers)
            if (n < min)
                min = n;

        return min;
    }

    public static int gcd(int... numbers) {
        // Find the min because the highest gcd will always be min
        // possible gcd;
        int gcd = min(numbers);
        // possible next gcd;
        for (int i = 0; i < numbers.length; i++) {
            // Get a number from numbers
            int k = numbers[i];
            // While the gcd is greater than 1
            while (gcd > 1) {
                // if k % gcd == 0; it is the gcd -> break from while loop
                if (k % gcd == 0)
                    // if we don't break, then we will find the lowest gcd which would be 1
                    // because we're going backwards from min
                    break;

                gcd--;
            }
            // Repeat loop until numbers.length
        }

        return gcd;
    }
}
