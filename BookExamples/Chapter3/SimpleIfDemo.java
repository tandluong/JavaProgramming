import java.util.*;
public class SimpleIfDemo {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int userInput = input.nextInt();

        // Display Result
        if (userInput % 5 == 0) {
            System.out.println("HiFive");
        }

        if (userInput % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}
