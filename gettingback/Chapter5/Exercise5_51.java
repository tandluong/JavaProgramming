import java.util.*;
public class Exercise5_51 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();

        // Find the largest common prefix of the two strings
        // How would we approach this?
        // If both Strings are the same, then they match
        String match = "";
        if (s1.equals(s2))
            match = s1;
        else {
            // We can use a loop to compare the Char in each String
            // If they match, then we will add that into a new String
            // We have to consider not going out of bounds
            for (int i = 0; i < s1.length() && i < s2.length(); i++) {
                if (s1.charAt(i) == s2.charAt(i))
                    match += s1.charAt(i);
                else
                    // The moment there is a mismatch, we will leave the loop and that will be the result
                    break;
            }
        }
        // Display result
        // We know there will be some input in match if its length is greater than 0
        if (match.length() > 0)
            System.out.printf("The common prefix is %s", match);
        else
            System.out.printf("%s and %s have no common prefix", s1, s2);
    }
}
