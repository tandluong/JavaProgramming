import java.util.*;
public class Exercise7_35 {
    public static void main(String[] args) {
        // initiate the game
        play();
    }

    public static void play() {
        String word = word();
        char[] hidden = hideWord(word);

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        int countRound = 1;
        int countMiss = 0;
        boolean solved = false;
        System.out.println("Round " + countRound);
        do {
            String guessWord = "";
            for (char value : hidden) {
                guessWord += value;
            }
            // Prompt user for input
            // Display the hidden String to user
            System.out.print("(Guess) Enter a letter in word " + guessWord + " > ");
            char letter = input.next().charAt(0);

            // Inform the user that the letter is in the word or not
            for (char ch : hidden)
                if (ch == letter) {
                    System.out.println("\t" + letter + " is already in the word");
                    break;
                }

            // If the word contains the guessed letter, update it
            if (word.contains("" + letter)) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == letter)
                        hidden[i] = letter;
                }
            }
            else {
                // Inform the user that the letter is in the word or not
                System.out.println("\t" + letter + " is not in the word");
                countMiss++;
            }

            // Keep checking to see if the word is completely guessed
            for (char c : hidden)
                if (c == '*') {
                    break;
                }

            int count = 0;
            for (char c : hidden)
                if (c != '*') {
                    count++;
                    if (count == word.length())
                        solved = true;
                }

            // Display user results
            // Ask if user wants to guess another word
            if (solved) {
                System.out.println("The word is " + word + ". You missed " + countMiss + " time");
                System.out.print("Do you want to guess another word? Enter y or n > ");
                char ask = input.next().charAt(0);

                if (ask == 'y') {
                    // Reinitialize variables
                    solved = false;
                    countRound++;
                    countMiss = 0;
                    word = word();
                    hidden = hideWord(word);
                    System.out.println("Round " + countRound);
                }
                else {
                    System.out.println("Thanks for playing!");
                    System.exit(0);
                }
            }

        } while (!solved);
    }

    public static char[] hideWord(String s) {
        char[] stars = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            stars[i] = '*';

        return stars;
    }

    public static String word() {
        // Define words to play with
        String[] words = {"write", "that", "program", "hello", "world",
                "test", "array", "practice", "toward", "perfection"};

        int random = (int) (Math.random() * words.length);

        return words[random];
    }
}
