public class Exercise7_22 {
    public static void main(String[] args) {
        // Declare the number of Queens
        final int QUEENS = 8;

        // We know that in order for a queen not to attack each other;
        // they must not be in the same row, same column, or same diagonal.
        // That means nested loop, j == Queen's position
        int[] queenPosition = {0, 4, 7, 5, 2, 6, 1, 3};

        for (int i = 0; i < QUEENS; i++) {
            for (int j = 0; j < QUEENS; j++) {
                if (queenPosition[i] == j) {
                    System.out.print("|Q| ");
                }
                else {
                    System.out.print("| | ");
                }
            }
            System.out.println();
        }
    }
}
