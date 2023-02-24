import java.util.*;
public class AdditionQuiz {
    public static void main(String[] args) {
        // generate two random numbers
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        // Display Result
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
