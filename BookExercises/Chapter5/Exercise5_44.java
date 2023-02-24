import java.util.*;

public class Exercise5_44 {
    public static void main(String[] args) {
        // We know a short can only has 16 bits and is capped from -32,768 to 32,767
        // An overflow occurs when the 16th bit is activated
        // That means -1 == -32,768 (16th bit)
        // Thus, -5 = -32,768 + 5 == -32,763 || 32,768 - 5 == 32763
        // -32768 == 1000 0000 0000 0000
        // -32764 == 1000 0000 0000 0100
        // 32763 == 0111 1111 1111 1011
        // -32764 ^ 32763 == 1111 1111 1111 1011 (-5)
        // (-32,768 + 32763) = -5
        // -32,768 | 32763 = -5 == 1111 1111 1111 1011

        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short num = input.nextShort();

        // if input is negative
        short numHolder = num;
        if (numHolder < 0)
            numHolder = (short) (-32768 - numHolder);

        // Using logic method
        String bits = "";
        // stop after 15 bits, the 16th is decided by positive or negative input
        for (byte i = 1; i <= 15; i++) {
            bits = Math.abs(numHolder % 2) + bits;
            numHolder /= 2;
        }
        // Check if the input was negative or positive
        // if negative, then add 1 to the 16th bit, else add 0 instead
        bits = num < 0 ? "1" + bits : "0" + bits;
        // Display result
        System.out.printf("The bits are %s\n", bits);

        // Reset bits
        bits = "";
        // Using bit-level operations
        for (int i = 0; i < 16; i++) {
            // 5 = 0101 & 1 = 0001 == 0001
            // 2 = 0010 & 1 = 0001 == 0000
            // 1 = 0001 & 1 = 0001 == 0001
            short bit = (short) (num & 0b0001); // 0b0001 == 0001 == 1
            // Add the bit to the string
            bits = bit + bits;
            // 5 (0101) = (0101 >> 1) == 2 (0010) = (0010 >> 1) == 1 (0001)
            num = (short) (num >> 1);
        }
        // Display result
        System.out.printf("The bits are %s", bits);
    }
}
