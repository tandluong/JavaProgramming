public class Exercise5_43 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        // Calculate the number of unique combinations from 1-7
        // Formula for unique combination is n! / ((n - r)! * r!)
        // In this case, n = 7 and r = 2
        int n = 7;
        int r = 2;
        int nFactorial = 1;
        // find the factorial for 7
        // We want i to stop at 6;
        // by using summation, we can do (n-1)! to find n!
        // n! = (n-1)! * n
        for (int i = 1; i < n; i++) {
            nFactorial += nFactorial * i;
            // n = 1 += 1 * (1);  1 - n = 2;
            // n = 2 += 2 * (2); 2 - n = 6
            // n = 6 += 6 * (3); 3 - n = 24
            // n = 24 += 24 * (4); 4 n = 120
            // n = 120 += 120 * (5); 5 n = 720
            // n = 720 += 720 * (6); 6 n = 5040
        }

        int nrFactorial = 1;
        int rFactorial = 1;
        for (int i = 1; i < n - r; i++) {
            nrFactorial += nrFactorial * i;
            if (i < 2)
                rFactorial += rFactorial * i;
        }
        nrFactorial = nrFactorial - rFactorial;

        int totalCombinations = nFactorial / (nrFactorial * rFactorial);

        for (int i = 1; i <= totalCombinations; i++) {
            System.out.printf("Combination %2d: %d %d\n", i, num1, num2);
            num2++;
            // Once num2 is greater than 7; we will increment num1 to the next number
            // and num2 will be num1 + 1 to continue the next combination
            if (num2 > 7) {
                num1++;
                num2 = num1 + 1;
            }
        }

        System.out.printf("The total number of all combinations is %d", totalCombinations);
    }
}
