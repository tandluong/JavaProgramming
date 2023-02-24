import java.util.*;
public class Exercise4_8 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an ASCII code: ");
        int code = input.nextInt();

        // Find the character for the given ASCII code
        char letter = (char)code;

        // Display Result
        if (code > 0 && code < 128)
            System.out.printf("The character for ASCII code %d is %c", code, letter);
        else
            System.out.println("Please enter a number between 0 and 127");
    }
}
