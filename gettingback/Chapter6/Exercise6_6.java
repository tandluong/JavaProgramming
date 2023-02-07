import java.util.Scanner;

public class Exercise6_6 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        // Call displayPattern
        displayPattern(number);
    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            spaceTopTriangle(i, n);

            filledBottomTriangle(i);

            System.out.println();
        }
    }

    public static void spaceTopTriangle(int i, int n) {
        // This formatting only works for n = 1-999
        // Once n surpasses 1000, it will not look correct
        // The formula for correct spacing is n.length + 1
        // i.e., 1000 = 4 + 1 = 5 spaces
        for (int k = i; k <= n; k++)
            System.out.print("    ");
    }

    public static void filledBottomTriangle(int i) {
        for (int j = 0; j < i; j++) {
            // To have proper spacing, we need to match the spaceTopTriangle method
            // The formula down here is (n.length + 1) - nNext.length
            // i.e., 1000 - 999 = 5 - 3 = 2 spaces; 1000 - 9 = 5 - 1 = 4 spaces
            if ((i - j) < 10)
                System.out.print(i - j + "   ");
            else if ((i - j) < 100)
                System.out.print(i - j + "  ");
            else
                System.out.print(i - j + " ");
        }
    }
}
