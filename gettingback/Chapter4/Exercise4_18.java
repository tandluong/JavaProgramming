import java.util.*;
public class Exercise4_18 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter two characters (M,C,I + 1,2,3,4 (M1)): ");
        String twoCharacters = input.next();

        // Get each individual character
        // Capitalize the first character for the user if necessary
        char firstChar = Character.toUpperCase(twoCharacters.charAt(0));
        char secondChar = twoCharacters.charAt(1);

        // Get String value corresponding to each input
        String major = switch (firstChar) {
            case 'M': yield "Mathematics";
            case 'C': yield "Computer Science";
            case 'I': yield "Information Technology";
            default: yield "Invalid input";
        };

        String status = switch (secondChar) {
            case '1': yield "Freshmen";
            case '2': yield "Sophomore";
            case '3': yield "Junior";
            case '4': yield "Senior";
            default: yield "Invalid input";
        };

        // Display result
        // Check if major and status to see if they have correct return values
        if (!major.equals("Invalid input") && !status.equals("Invalid input"))
            System.out.printf("%s %s", major, status);
        else
            System.out.println("Invalid input");
    }
}
