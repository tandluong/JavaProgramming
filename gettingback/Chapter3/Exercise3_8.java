import java.util.*;
public class Exercise3_8 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter 3 integers, i.e., 1 2 3: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Compare the number inputs from user to sort
        boolean is1LargerThan2 = number1 >= number2;
        boolean is1LargerThan3 = number1 >= number3;
        boolean is2LargerThan1 = number2 >= number1;
        boolean is2LargerThan3 = number2 >= number3;
        boolean is3LargerThan1 = number3 >= number1;
        boolean is3LargerThan2 = number3 >= number2;

        // Play with logic
        // is Number 1 larger than 2 and 3?
        if (is1LargerThan2 && is1LargerThan3) {
            // is Number 2 larger than 3?
            if (is2LargerThan3)
                // if it is, then Number 3 is the smallest
                System.out.print(number3 + " " + number2 + " " + number1);
            else
                // if it is not, then Number 2 is the smallest
                System.out.print(number2 + " " + number3 + " " + number1);
        }
        // is Number 2 larger than 1 and 3?
        else if (is2LargerThan1 && is2LargerThan3) {
            // is Number 1 larger than 3?
            if (is1LargerThan3)
                // if it is, then Number 3 is the smallest
                System.out.print(number3 + " " + number1 + " " + number2);
            else
                // if it is not, then Number 1 is the smallest
                System.out.print(number1 + " " + number3 + " " + number2);
        }
        // is Number 3 larger than 1 and 2?
        else if (is3LargerThan1 && is3LargerThan2) {
            // is Number 1 larger than 2?
            if (is1LargerThan2)
                // if it is, then number 2 is the smallest
                System.out.print(number2 + " " + number1 + " " + number3);
            else
                // if it is not, then number 1 is the smallest
                System.out.print(number1 + " " + number2 + " " + number3);
        }
    }
}
