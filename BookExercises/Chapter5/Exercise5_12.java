public class Exercise5_12 {
    public static void main(String[] args) {
        int n = 1;

        while ((n * n) < 12000) {
            n++;
        }

        // Display Result
        System.out.printf("The smallest n such that n^2 > 12000 is %d", n);
    }
}
