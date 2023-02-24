import java.util.*;
public class Exercise5_34 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        int score = 0;

        do {
            // Generate Random Number 0-scissor, 1-rock, 2-paper
            int randomPlay = (int) (Math.random() * 3);

            // Enhanced Switch
            String computerResult = switch (randomPlay) {
                case 0 -> "scissor";
                case 1 -> "rock";
                case 2 -> "paper";
                default -> "-1";
            };

            // Prompt user for input
            System.out.print("Enter a number; scissor (0), rock (1), paper (2): ");
            int userPlay = input.nextInt();

            String playerResult = switch (userPlay) {
                case 0 -> "scissor";
                case 1 -> "rock";
                case 2 -> "paper";
                default -> "-1";
            };
            // Determine the results
            if (userPlay >= 0 && userPlay < 3) {
                switch (userPlay - randomPlay) {
                    case -2, 1 -> {
                        // Player win. How? scissor (player) = 0; paper (computer) = 2, therefore, 0 - 2 = -2
                        // Player win. How? rock (player) = 1; scissor (computer) = 1, therefore, 1 - 0 = 1
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". You won this round");
                        score++;
                    }
                    case -1, 2 -> {
                        // Computer win. How? scissor (player) = 0; rock (computer) = 1, therefore, 0 - 1 = -1
                        // Computer win. How? paper (player) = 2; scissor (computer) = 0, therefore 2 - 0 = 2
                        System.out.println("The computer is " + computerResult + ". " +
                                "You are " + playerResult + ". The computer won this round");
                        score--;
                    }
                    case 0 -> // if sum is 0; then both are the same. Draw
                            System.out.println("The computer is " + computerResult + ". " +
                                    "You are " + playerResult + " too. It is a draw");
                }
            } else
                System.out.println("Please enter a number between 0 and 2");
            // Score starts at 0, if player wins increment; if computer wins decrement
            // Therefore, if player wins 2 in a row right away, then player wins the game
            // else the game keeps going until either the player or computer wins 2 over their opponent
            // W: 1, L: 0 (tie), L: -1, W: 0 (tie) -> (1) W: 1, W: 2 (wins game) or L: -1, L: -2 (lose game)
        } while (score != 2 && score != -2);

        if (score == 2)
            System.out.println("Congratulations! You won the game!");
        if (score == -2)
            System.out.println("Game Over! The computer won the game!");
    }
}
