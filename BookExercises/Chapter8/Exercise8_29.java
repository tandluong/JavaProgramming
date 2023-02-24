public class Exercise8_29 {
    public static void main(String[] args) {
        int number = 1;
        // Reuse list creating method from previous Exercise8_28
        int[][] m1 = Exercise8_28.list(number++);
        int[][] m2 = Exercise8_28.list(number);

        String identical = "The two arrays are identical";
        String notIdentical = "The two arrays are not identical";
        System.out.println(equals(m1, m2) ? identical : notIdentical);

    }

    public static boolean equals(int[][] m1, int[][] m2) {
        // We have to determine if both arrays are identical
        // How would we approach this?
        // The easiest way is to sort both incoming arrays first, then compare them

        // Arrays are sorted
        int[][] m1Sorted = sort(m1);
        int[][] m2Sorted = sort(m2);

        for (int i = 0; i < m1.length && i < m2.length; i++) {
            for (int j = 0; j < m1[i].length && j < m2[i].length; j++) {
                if (m1Sorted[i][j] != m2Sorted[i][j])
                    return false;
            }
        }

        return true;
    }

    public static int[][] sort(int[][] m) {
        // Sort incoming 2 dimensional array
        // How would we sort this?
        // We will sort the rows of each array
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length - 1; j++) {
                if (m[i][j] > m[i][j + 1]) {
                    int temp = m[i][j];
                    m[i][j] = m[i][j + 1];
                    m[i][j + 1] = temp;
                }
            }
        }

        return m;
    }
}
