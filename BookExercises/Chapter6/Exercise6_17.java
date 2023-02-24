import java.util.Scanner;

public class Exercise6_17 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter n: ");
        int n = input.nextInt();

        // Print the matrix
        printMatrix(n);
    }

    public static void printMatrix(int n) {
        // We want to do an n by n matrix
        // That means we need to make a loop that goes n rows and n columns
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int random = (int)(Math.random() * 2);
                System.out.print(random + " ");
            }
            System.out.println();
        }
    }
}
