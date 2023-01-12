import java.util.*;
public class Exercise4_14 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a letter grade: ");
        String grade = input.next();
        char letter = grade.charAt(0);

        // Letter grade must be A, B, C, D, or F
        // Therefore, we know we must use 65 + 0, 1, 2, 3, 5
        // Assign each letter grade to their corresponding number 4, 3, 2, 1, or 0
        // Anything else will be considered invalid
        int numericValue = switch (letter) {
            case 65: yield 4;
            case 66: yield 3;
            case 67: yield 2;
            case 68: yield 1;
            case 70: yield 0;
            default: yield -1;
        };

        // Display result
        if (numericValue != -1) {
            System.out.printf("The numeric value for grade %c is %d", letter, numericValue);
        }
        else
            System.out.printf("%s is an invalid grade", grade);
    }
}
