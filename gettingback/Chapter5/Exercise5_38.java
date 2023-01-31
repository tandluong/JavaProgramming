import java.util.*;
public class Exercise5_38 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a decimal integer: ");
        int integer = input.nextInt();
        int decimal = integer;

        // Exactly the same as Exercise 5_37, but we change the divider to 8 instead of using 2
        String octal = "";
        while (decimal > 0) {
            // We want to add future remainders in front of the previous string
            octal = (decimal % 8) + octal;

            decimal /= 8;
        }

        // Display Result
        System.out.printf("The decimal value %d octal value is %s", integer, octal);
    }
}
