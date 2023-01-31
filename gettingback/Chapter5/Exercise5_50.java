import java.util.*;
public class Exercise5_50 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        // Check every Char in the String and verify if it is an uppercase
        // If it is, then increment a count
        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            count = Character.isUpperCase(s1.charAt(i)) ? count + 1 : count;
        }
        // Display Result
        System.out.printf("The number of uppercase letters is %d", count);
    }
}
