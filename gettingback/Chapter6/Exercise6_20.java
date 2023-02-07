import java.util.Scanner;

public class Exercise6_20 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        displayResult(s);
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if(Character.isLetter(s.charAt(i)))
                count++;

        return count;
    }

    public static void displayResult(String s) {
        System.out.printf("The string %s has %d letters", s, countLetters(s));
    }
}
