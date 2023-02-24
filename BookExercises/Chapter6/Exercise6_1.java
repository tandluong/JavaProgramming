public class Exercise6_1 {
    public static void main(String[] args) {
        // Pentagonal number is define as n(3n-1) / 2 for n = 1, 2, ...
        // Display the first 100 pentagonal numbers with 10 numbers on each line
        final int NUMBER_OF_PENTAGONAL_NUMBERS = 100;
        final int NUMBER_PER_LINE = 10;

        // Print the first 100 pentagonal numbers
        printPentagonalNumbers(NUMBER_OF_PENTAGONAL_NUMBERS, NUMBER_PER_LINE);
    }

    public static void printPentagonalNumbers(int amount, int perLine) {
        for (int i = 1; i <= amount; i++) {
            if (i % perLine == 0)
                System.out.println(getPentagonalNumber(i) + " ");
            else
                System.out.print(getPentagonalNumber(i) + " ");
        }
    }

    public static int getPentagonalNumber(int n) {
        return (n * ((3 * n) - 1)) / 2;
    }
}
