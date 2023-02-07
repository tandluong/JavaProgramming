import java.util.Scanner;

public class Exercise6_18 {
    public static void main(String[] args) {
        /* A password must have at least eight characters
        String.length() >= 8
        A password consists of only letters and digits
        Character.isDigitOrLetter(charAt(n))
        A password must contain at least two digits
        Create a counter; if Character.isDigit(charAt(n)), then counter++; counter >= 2
        if all 3 conditions are true, then password is valid */

        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter a password: ");
        // Use next instead of nextLine because we don't want user to use space
        String password = input.next();

        displayResult(password);
    }

    public static boolean checkPassword(String password) {
        int passwordLength = password.length();
        boolean correctCharacter;
        // Assume input is correct at first
        boolean correctLetterOrDigit;
        boolean correctDigits;

        int countCharacters = 0;
        int countLettersAndDigits = 0;
        int countDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetter(password.charAt(i)))
                countCharacters++;
            if (Character.isDigit(password.charAt(i)))
                countDigits++;
            if (Character.isLetterOrDigit(password.charAt(i)))
                countLettersAndDigits++;
        }

        // If all input matches, then length should match
        correctCharacter = countCharacters >= 8;
        correctLetterOrDigit = countLettersAndDigits == passwordLength;
        correctDigits = countDigits >= 2;

        // If all three conditions are satisfied, then return true; else it is false
        return correctCharacter && correctLetterOrDigit && correctDigits;
    }

    public static void displayResult(String password) {
        if (checkPassword(password))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}
