public class Exercise5_24 {
    public static void main(String[] args) {
        // create the starting variables
        double num1 = 1;
        double num2 = 3;

        double sum = 0;
        while (num1 <= 97 && num2 <= 99) {
            sum += num1 / num2;
            num1 += 2;
            num2 += 2;
        }

        // Display Result
        System.out.printf("The sum is %.20f", sum);
    }
}
