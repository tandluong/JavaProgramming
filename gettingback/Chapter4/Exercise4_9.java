import java.util.*;
public class Exercise4_9 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        String userInput = input.next();
        char character = userInput.charAt(0);

        // Find the Unicode for the character with the given input
        int unicode = character;

        // Display result
        System.out.printf("The Unicode for the character %c is %d", character, unicode);
    }
}
