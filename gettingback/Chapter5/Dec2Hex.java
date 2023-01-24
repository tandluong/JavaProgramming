import java.util.*;
public class Dec2Hex {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();

        // Convert decimal to hex
        String hex = "";

        while (decimal != 0) {
            int hexValue = decimal % 16;

            // Convert a decimal value to a hex digit
            char hexDigit = (hexValue <= 9 && hexValue >= 0) ?
                (char)(hexValue + '0') : (char)(hexValue - 10 + 'A');

            hex = hexDigit + hex;

            decimal = decimal / 16;
        }

        System.out.printf("The hex number is %s", hex);
    }
}
