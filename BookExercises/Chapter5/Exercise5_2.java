import java.util.*;
public class Exercise5_2 {
    public static void main(String[] args) {
        // Declare the amount of questions to be completed
        final int NUMBER_OF_QUESTIONS = 5;
        // Count the number of correct answers
        int correctCount = 0;
        // Count the number of questions
        int count = 0;
        // start time of the quiz
        long startTime = System.currentTimeMillis();
        // empty string to hold future output
        String output = " ";
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // Generate two random number between 1 - 15
            int number1 = 1 + (int)(Math.random() * 15);
            int number2 = 1 + (int)(Math.random() * 15);

            // if number1 < number2, swap number1 with number2
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            // Prompt user input
            System.out.printf("What is %d + %d? ", number1, number2);
            int answer = input.nextInt();

            // Check to see if input is correct
            if (number1 + number2 == answer) {
                System.out.println("You are correct!\n");
                correctCount++;
            }
            else
                System.out.printf("Your answer is wrong.\n%d + %d should be %d\n\n",
                        number1, number2, number1 + number2);

            // Increase the question count
            count++;

            output += "\n" + number1 + "+" + number2 + "=" + answer +
                    ((number1 + number2 == answer) ? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.printf("Correct count is %d \nTest time is %d seconds\n %s",
                correctCount, testTime / 1000, output);
    }
}
