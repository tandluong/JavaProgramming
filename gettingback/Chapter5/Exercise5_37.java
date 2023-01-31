import java.util.*;
public class Exercise5_37 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a decimal integer: ");
        int integer = input.nextInt();

        int decimal = integer;
        if (decimal < 0) {
            decimal = (-2147483648 - decimal);
        }

        // We will have to continuously divide the decimal number by 2
        // and get the remainder of each division.
        // That will be the decimal equivalent
        String binary = "";
        while (decimal != 0) {
            // We want to add future remainders in front of the previous string
            binary = Math.abs(decimal % 2) + binary;

            decimal /= 2;
        }

        // Display Result
        System.out.printf("The decimal value %d binary value is %s", integer, binary);
    }
}
