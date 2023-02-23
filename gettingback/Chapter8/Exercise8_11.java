import java.util.Scanner;

public class Exercise8_11 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number between 0 and 511: ");
        int number = input.nextInt();

        char[][] matrix = numbersToLetters(matrix(number));

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static char[][] numbersToLetters(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == '0')
                    matrix[i][j] = 'H';
                if (matrix[i][j] == '1')
                    matrix[i][j] = 'T';
            }
        }

        return matrix;
    }

    public static char[][] matrix(int number) {
        // initialize a 3-by-3 matrix
        char[][] binary = new char[3][3];

        String numbers = "";
        while (number != 0) {
            numbers += number % 2;
            number /= 2;
        }

        while (numbers.length() < 9)
            numbers = "0" + numbers;

        int count = 0;
        for (int i = 0; i < binary.length && count < numbers.length(); i++) {
            for (int j = 0; j < binary[i].length && count < numbers.length(); j++) {
                binary[i][j] = numbers.charAt(count);
                count++;
            }
        }

        return binary;
    }
}
