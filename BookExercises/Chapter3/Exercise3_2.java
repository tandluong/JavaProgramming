import java.util.*;
public class Exercise3_2 {
    public static void main(String[] args) {
        // generate two random numbers
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);

        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
        int answer = input.nextInt();

        // Display Result
        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer +
                " is " + (number1 + number2 + number3 == answer));
    }
}
