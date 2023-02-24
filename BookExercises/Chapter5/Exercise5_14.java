import java.util.*;
public class Exercise5_14 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = n1;

        while (gcd <= n1 && gcd <= n2) {
            // The first common divisor found is the greatest common divisor
            if (n1 % gcd == 0 && n2 % gcd == 0)
                // gcd is found; break out of loop
                break;
            gcd--;
        }

        // Display Result
        System.out.printf("The greatest common divisor for %d and %d is %d", n1, n2, gcd);
    }
}
