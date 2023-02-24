import java.util.*;
public class Exercise4_13 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a letter: ");
        String userInput = input.next();
        char letter = userInput.charAt(0);

        // Determine whether the letter is a constant or vowel
        // To do that we already know that what letters are a constant or vowel
        // A and a, E and e, I and i, O and o, U and u are all vowels in the alphabet
        // 65 - 90 is A - Z, 97 - 122 is a - z; A = 0; E = 4; I = 8; O = 14; U = 20
        // A = 65, E = 69, I = 73, O = 79, U = 85
        // a = 97, E = 101, I = 105, O = 111, U = 117
        // Find the letter value and compare them to their corresponding value
        // Check to see if input is indeed a letter
        if (Character.isLetter(letter)) {
            // Enhanced switch checking if the letter is a vowel; if not then return constant
            String result = switch (letter) {
                case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117: yield "vowel";
                default: yield "constant";
            };

            System.out.printf("%c is a %s", letter, result);
        }
        else {
            System.out.printf("%s is an invalid input", userInput);
        }
    }
}
