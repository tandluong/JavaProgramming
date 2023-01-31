public class Exercise5_33 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            int divisor = 1;
            int sum = 0;
            String factors = "";

            // let the divisor start at 1
            // if i can be divided by the divisor, then add that to the sum
            // increment the divisor until all possible divisor are found
            while (i > divisor) {
                if (i % divisor == 0) {
                    sum += divisor;
                    factors += divisor + " + ";
                }
                divisor++;
            }

            // if the sum of the divisor equals to i, then show that number
            if (sum == i)
                System.out.printf("%d = %s\n", sum, factors.substring(0, factors.length() - 2));

            // reset the variables to find the next integer
            sum = 0;
            factors = "";
        }

    }
}
