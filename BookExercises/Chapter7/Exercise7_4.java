import java.util.Scanner;

public class Exercise7_4 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize score array
        double[] scores = new double[100];

        double sum = 0;
        int count = 0;
        // Prompt user for input
        System.out.print("Enter scores: ");
        double score = input.nextDouble();

        while (score >= 0) {
            sum += score;
            scores[count] = score;
            count++;

            // Read the next input
            score = input.nextInt();
        }

        double average = sum / count;

        // Find how many scores are above or equal to the average
        int scoreAboveAverage = 0;
        int scoreBelowAverage = 0;
        for (int i = 0; i < count; i ++) {
            if (scores[i] >= average)
                scoreAboveAverage++;
            if (scores[i] < average)
                scoreBelowAverage++;
        }

        // Display result
        System.out.printf("""
                The average is %.2f
                There are %d scores above or equal to the average
                There are %d scores below the average""",
                average, scoreAboveAverage, scoreBelowAverage);
    }
}
