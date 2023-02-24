public class Exercise5_13 {
    public static void main(String[] args) {
        int n = 100;

        while ((n * n * n) > 12000) {
            n--;
        }

        // Display Result
        System.out.printf("The largest n such that n^3 is less than 12,000 is %d", n);
    }
}
