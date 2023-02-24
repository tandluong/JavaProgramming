import java.util.*;
public class Exercise4_11 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();

        // Find the hex value of the decimal value
        if (decimal >= 10 && decimal <= 15) {
            char hex = (char)(decimal + 55);
            System.out.printf("The hex value is %c", hex);
        }
        else if (decimal < 10 && decimal >= 0) {
            System.out.printf("The hex value is %d", decimal);
        }
        else {
            System.out.printf("%d is an invalid input", decimal);
        }
    }
}
