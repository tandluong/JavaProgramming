import java.util.*;
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        // Initial greatest common divisor (gcd)
        int gcd = 1;
        // Possible next gcd
        int k = 2;
        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                // if true; then update the gcd
                gcd = k;
            k++;
        }

        // Display Result
        System.out.printf("The greatest common divisor for %d and %d is %d", n1, n2, gcd);
    }
}
