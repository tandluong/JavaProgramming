public class Exercise8_16 {
    public static void main(String[] args) {
        int[][] m = {
                {4, 2},
                {1, 7},
                {4, 5},
                {1, 2},
                {1, 1},
                {4, 1}};

        sort(m);
    }

    public static void sort(int[][] m) {
        // The method would only sort the rows rather than the contents inside the row
        for (int i = 0; i < m.length; i++)
            for (int j = i + 1; j < m.length; j++) {
                // This sorts the array by the first columns
                if (m[i][0] > m[j][0]) {
                    int[] temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }

                // This sorts the arrays by the second column
                if (m[i][1] > m[j][1] && m[i][0] >= m[j][0]) {
                    int[] temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
