import java.util.*;
public class Exercise5_45 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        int count = 0;
        double temp;
        double sum = 0;
        double sum2 = 0;

        while (count < 10) {
            temp = input.nextDouble();
            sum += temp;
            sum2 += Math.pow(temp, 2);
            count++;
        }

        // Calculate the mean after the summation of ten numbers
        double mean = sum / count;
        // Calculate the standard deviation
        // Deviation = Sqrt((all num in sum)^2 - ((sum^2) / n)) / (n - 1); where n is the count
        double deviation = Math.sqrt((sum2 - (Math.pow(sum, 2) / count)) / (count - 1));

        // Display Results
        System.out.printf("""
                The mean is %.2f
                The standard deviation is %.5f
                """, mean, deviation);
    }
}
