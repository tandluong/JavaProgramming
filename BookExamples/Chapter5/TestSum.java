public class TestSum {
    public static void main(String[] args) {
        // Initialize sum
        double sum = 0;
        double currentValue = 0.01;

        for (int count = 0; count < 100; count++) {
            sum += currentValue;
            currentValue += 0.01;
        }

        // Display result
        System.out.printf("The sum is %f", sum);
    }
}
