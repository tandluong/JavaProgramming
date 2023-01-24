import java.util.*;
public class Exercise5_8 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        input.nextLine();

        // initialize count
        int count = 0;
        String name = "";
        String score = "";
        while (count < students) {
            // Prompt user for input
            System.out.print("Enter student's name and score: ");
            String studentScore = input.nextLine();

            // Assume the first input is the highest
            int k = studentScore.indexOf(' ');
            if (count == 0) {
                name = studentScore.substring(0, k);
                score = studentScore.substring(k + 1);
            }
            String nextScore = studentScore.substring(studentScore.indexOf(' ') + 1);
            // Compare the score to determine which is greater
            int compare = score.compareTo(nextScore);

            // if the return is greater than 0, then score is higher
            // if the return is less than 0, then score is lower
            // if the return equals to 0, then both score are the same
            // If the score is a letter grade, then A, B, C, ..., F order
            if (compare > 0 && Character.isLetter(nextScore.charAt(0))) {
                // update the new high score
                score = nextScore;
                // update the student name
                name = studentScore.substring(0, studentScore.indexOf(" "));
            }

            // If the score is an integer, then largest number is the highest
            if (Character.isDigit(nextScore.charAt(0))) {
                int score1 = Integer.parseInt(score);
                int score2 = Integer.parseInt(nextScore);

                if (score2 > score1) {
                    score = nextScore;
                    name = studentScore.substring(0, studentScore.indexOf(" "));
                }
            }
            count++;
        }

        // Display Result
        System.out.printf("The student with the highest score is %s with score %s", name, score);
    }
}
