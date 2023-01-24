public class Exercise5_15 {
    public static void main(String[] args) {
        // ! to ~ is 33 to 126
        final int NUM_PER_LINE = 10;
        int count = 0;

        for (int i = 33; i <= 126; i++) {
            char ch = (char)i;
            System.out.print(ch + " ");
            count++;

            if (count % NUM_PER_LINE == 0)
                System.out.println();
        }
    }
}
