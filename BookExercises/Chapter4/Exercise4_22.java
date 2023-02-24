import java.util.*;
public class Exercise4_22 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter string s1: ");
        String string1 = input.next();
        System.out.print("Enter string s2: ");
        String string2 = input.next();

        // Check to see if string2 is a substring of string1
        boolean isSubstring = string1.contains(string2);

        if (isSubstring)
            System.out.printf("%s is a substring of %s", string2, string1);
        else
            System.out.printf("%s is not a substring of %s", string2, string1);
    }
}
