import java.util.Scanner;

public class Exercise7_28 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // initialize int array
        int[] numbers = new int[10];

        // Prompt user for input
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        // Invoke method to get combinations
        String[] combinations = combination(numbers);

        // Display all combinations
        int count = 9;
        int count2 = 8;
        for (String s : combinations) {
            count--;
            if (count % 10 == 0)
                System.out.println(s);
            else
                System.out.print(s + " ");

            if (count == 0) {
                count = count2;
                count2--;
            }
        }
    }

    public static String[] combination(int[] numbers) {
        int n = numbers.length;
        int r = 2;
        int total = combinationTotal(n, r);
        String[] combination = new String[total];
        int count = 0;
        for (int i = 0; i < combination.length; i++) {
            for (int j = i; j < numbers.length - 1; j++) {
                combination[count] = "(" + numbers[i % 10] + ", " + numbers[j + 1 % 10] + ")";
                count++;
            }
            if (count >= combination.length)
                break;
        }

        return combination;
    }

    public static int combinationTotal(int n, int r) {
        int factorialN = 1;
        for (int i = 1; i <= n; i++)
            factorialN *= i;

        int factorialNMinusR = 1;
        for (int j = 1; j <= n - r; j++)
            factorialNMinusR *= j;

        int factorialR = 1;
        for (int k = 1; k <= r; k++)
            factorialR *= k;

        return factorialN / (factorialNMinusR * factorialR);
    }
}
