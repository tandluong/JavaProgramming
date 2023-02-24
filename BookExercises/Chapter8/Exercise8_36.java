import java.util.Scanner;

public class Exercise8_36 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter number n: ");
        int n = input.nextInt();
        // Initialize n-by-n array

        // Set the limit of letters based in n
        char limit = (char) ('A' + (n - 1));

        char[][] m = new char[n][n];
        System.out.println("Enter " + n + " rows of letters separated by spaces:");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.next().charAt(0);
                if (m[i][j] > limit) {
                    System.out.println("Wrong input: the letters must be from A to " + limit);
                    System.exit(1);
                }
            }

        String isLatinSquare = "The input array is a Latin square";
        String notLatinSquare = "The input array is not a Latin square";

        System.out.println(isLatinSquare(m) ? isLatinSquare : notLatinSquare);
    }

    public static boolean isLatinSquare(char[][] n) {
        // A Latin square is an n-by-n array filled with n different Latin letters,
        // each occurring exactly once in each row and once in each column
        // That means we will go through the first row and check if it is unique
        // in the row and the column

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                for (int k = j + 1; k < n[i].length; k++) {
                    // Compare all the row's chars
                    // If there is a match, return false;
                    if (n[i][j] == n[i][k]) {
                        return false;
                    }
                    // Compare all the column's char
                    // If there is a match, return false
                    if (n[j][i] == n[k][i]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
