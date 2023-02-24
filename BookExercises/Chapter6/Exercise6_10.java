public class Exercise6_10 {
    public static void main(String[] args) {
        // Call find PrimeNumbers to display result
        findPrimeNumbers(10000);
    }

    public static void findPrimeNumbers(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (PrimeNumberMethod.isPrime(i)) {
                System.out.print(i + " ");
                count++;

                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }
}
