import java.util.*;
public class Exercise5_49 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        // How to determine the vowels and constants?
        // We will have to get each char inside the String and compare them to their Char values
        // Vowels = A, E, I, O, U == 65, 69, 73, 79, 85 and +32 for their lowercase
        int vowels = 0;
        int constants = 0;
        for (int i = 0; i < s1.length(); i++) {
            char check = s1.charAt(i);
            // We will make sure that the char we're checking are alphabetical letters
            // so that other input will not affect our count
            if (Character.isLetter(check))
                switch (check) {
                    // increment vowels if check returns a number within their scopes
                    case 65, 97, 69, 101, 73, 105, 79, 111, 85, 117 -> vowels++;
                    default -> constants++;
                }
        }
        // Display Result
        System.out.printf("""
                The number of vowels is %d
                The number of constants is %d
                """, vowels, constants);
    }
}
