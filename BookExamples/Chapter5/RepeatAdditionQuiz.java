import java.util.*;
public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        // Generate two random numbers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user
        System.out.printf("What is %d + %d? ", number1, number2);
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.printf("Wrong answer. Try again. What is %d + %d? ", number1, number2);
            answer = input.nextInt();
        }

        System.out.println("You got it!");
    }
}
