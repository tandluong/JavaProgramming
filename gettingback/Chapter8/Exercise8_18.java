public class Exercise8_18 {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}};

        shuffle(m);

        for (int[] ints : m) {
            for (int anInt : ints)
                System.out.print(anInt + " ");

            System.out.println();
        }
    }

    public static void shuffle(int[][] m) {
        // How would we shuffle a matrix?
        // We would loop through the entire array
        // We then would create a random number for each random index to be swapped

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                int randomRow = (int) (Math.random() * m.length);
                int randomCol = (int) (Math.random() * m[i].length);
                int temp = m[i][j];
                m[i][j] = m[randomRow][randomCol];
                m[randomRow][randomCol] = temp;
            }
        }
    }
}
