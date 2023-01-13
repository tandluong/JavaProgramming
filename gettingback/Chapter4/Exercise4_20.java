import java.util.*;
public class Exercise4_20 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter anything: ");
        String userInput = input.nextLine();

        // Get the first Character
        char ch = userInput.charAt(0);
        // Get the String length
        int length = userInput.length();

        // Display Result
        System.out.printf("The first character is \"%c\" and the length is %d", ch, length);
    }
}
