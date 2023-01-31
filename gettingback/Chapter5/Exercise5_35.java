public class Exercise5_35 {
    public static void main(String[] args) {
        int num1 = 624, num2 = 625;

        double sum = 0;
        while (num1 >= 1 && num2 >= 2) {
            sum += 1 / (Math.pow(num1, 0.5) + Math.pow(num2, 0.5));

            num1--;
            num2--;
        }

        // Display Result
        System.out.printf("The sum is %.3f", sum);
    }
}
