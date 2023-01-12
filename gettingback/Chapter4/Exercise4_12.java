import java.util.*;
public class Exercise4_12 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a hex digit (0,1,2,..,9, A,B,C,...,F): ");
        String hex = input.next();

        // Get the String input as a Character
        char ch = hex.charAt(0);
        // initialize an integer variable
        int length = hex.length();
        int decimal = 0;

        // We know that A - F has a value of 65-70 with Character
        if (length == 1) {
            if (ch >= 'A' && ch <= 'F') {
                decimal = ch - 55;
            }
            // We know that 0-9 has a value of 48-57 with Character
            else if (ch >= '0' && ch <= '9') {
                decimal = ch - 48;
            }
            else {
                decimal = -1;
            }
        }
        else {
            System.out.printf("%s is an invalid input", hex);
            System.exit(1);
        }


        // If the input is valid, then display result
        if (decimal >= 0 && decimal <= 15) {
            // Find the Binary value with the remaining decimal value
            // We know that a hex digit is an integer between 0-15, thus need 4 bits (1 byte)
            int bit1 = 0, bit2 = 0, bit3 = 0, bit4 = 0;

            if (decimal >= 8) {
                bit4 = 1;
                decimal -= 8;
            }
            if (decimal >= 4) {
                bit3 = 1;
                decimal -= 4;
            }
            if (decimal >= 2) {
                bit2 = 1;
                decimal -= 2;
            }
            if (decimal >= 1) {
                bit1 = 1;
                decimal -= 1;
            }

            // Display Result
            System.out.printf("The binary value %s is %d%d%d%d", hex, bit4, bit3, bit2, bit1);
        }
        else {
            System.out.printf("%c is an invalid input", ch);
        }
    }
}
