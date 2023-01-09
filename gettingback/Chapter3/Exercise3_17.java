import java.util.*;
public class Exercise3_17 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Generate Random Number 0-scissor, 1-rock, 2-paper
        int randomPlay = (int)(Math.random() * 3);

        // Prompt user for input
        System.out.print("Enter a number; scissor (0), rock (1), paper (2): ");
        int userPlay = input.nextInt();

        // Enhanced Switch
        String computerResult = switch (randomPlay) {
            case 0: yield "scissor";
            case 1: yield "rock";
            case 2: yield "paper";
            default : throw new IllegalArgumentException(randomPlay + "is incorrect");
        };

        String playerResult;
        // Determine the results
        if (userPlay >= 0 && userPlay < 3) {
            switch (userPlay) {
                case 0: playerResult = "scissor";
                    // if sum is 0; then both are scissor. Draw
                    if (userPlay + randomPlay == 0)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + " too. It is a draw");
                        // if sum is 1; then computer is rock. Lost
                    else if (userPlay + randomPlay == 1)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". You lost");
                        // if sum is 2; then computer is paper. Win
                    else if (userPlay + randomPlay == 2)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". You won");
                    break;
                case 1: playerResult = "rock";
                    // if sum is 2; then both are rock. Draw
                    if (userPlay + randomPlay == 2)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + " too. It is a draw");
                        // if sum is 1; then computer is scissor. Won
                    else if (userPlay + randomPlay == 1)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". You Won");
                        // if sum is 3; then computer is paper. Lost
                    else if (userPlay + randomPlay == 3)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". You lost");
                    break;
                case 2: playerResult = "paper";
                    // if sum is 4; then both are paper. Draw
                    if (userPlay + randomPlay == 4)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + " too. It is a draw");
                        // if sum is 3; then computer is rock. Won
                    else if (userPlay + randomPlay == 3)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". You Won");
                        // if sum is 3; then computer is scissor. Lost
                    else if (userPlay + randomPlay == 2)
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". You lost");
            }
        }
        else
            System.out.println("Please enter a number between 0 and 2");
    }
}
