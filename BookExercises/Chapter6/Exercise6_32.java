public class Exercise6_32 {
    public static void main(String[] args) {
        // Display result
        playGame();
    }

    public static int generateRandomNumber() {
        // Generate random number between 1 and 6
        return 1 + (int)(Math.random() * 6);
    }

    public static int sumTwoNumber(int num1, int num2) {
        return num1 + num2;
    }

    public static void playGame() {
        // How does the game work?
        // First, initialize a string to be empty
        String result = "";
        // Then create a boolean to help us define the first roll
        boolean initialRoll = true;
        // Create an integer to store our point
        int point = 0;
        // Create a game count and winning count
        int count = 0;
        int win = 0;
        // We want to play the game 10,000 times, therefore we will loop the game 10,000 times
        while (count < 10000) {
            // This runs the game once
            // We know that if the string is not empty, then there is a result to display
            // Therefore, we can stop; else keep looping the game
            while (result.equals("")) {
                // Generate 2 random numbers
                int num1 = generateRandomNumber();
                int num2 = generateRandomNumber();
                // Find the sum
                int sum = sumTwoNumber(num1, num2);

                // Display the roll
                System.out.printf("You rolled %d + %d = %d\n", num1, num2, sum);
                // Check the result of the roll
                result = checkRoll(initialRoll, sum, point);

                // Keep the point of the 1st roll, it should not be replaced with a new value
                if (initialRoll)
                    point = sum;

                // Once the initial roll is toss, boolean is not false
                initialRoll = false;

                // If there is a result from our roll, either winning or losing,
                // then print the result and leave the loop
                if (!result.equals(""))
                    System.out.println(result);
                else
                    // If there is no result, then display the point to the player
                    System.out.printf("point is %d\n", point);

                // If we win, then increase win count
                if (result.equals("You win"))
                    win++;
            }
            // reset all playing variables once the game is over
            result = "";
            initialRoll = true;
            point = 0;
            count++;
        }

        System.out.println("The number of winning games are " + win);
    }

    public static String checkRoll(boolean initialRoll, int sum, int point) {
        String result;
        if (initialRoll)
            result = switch (sum) {
                case 7, 11 -> "You win";
                case 2, 3, 12 -> "You lose";
                default -> "";
            };
        else {
            if (sum == point)
                result = "You win";
            else if (sum == 7)
                result = "You lose";
            else
                result = "";
        }

        return result;
    }
}
