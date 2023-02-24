import java.util.*;
public class SubtractionQuiz {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Generate two random numbers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // if number1 is less than number2, then create a new temp variable to be number2
        // number1 is now number2 and number2 is now the old number1
        // this is to prevent getting a negative answer due to random 0-9
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt user input
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = input.nextInt();

        // Display Results
        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
        }
    }
}
