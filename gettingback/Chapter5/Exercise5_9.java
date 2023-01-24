import java.util.*;
public class Exercise5_9 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();
        // Avoid input error for next input
        input.nextLine();

        // initialize count and future names and scores
        int count = 0;
        String name1 = "";
        String score1 = "";
        String name2 = "";
        String score2 = "";
        while (count < students) {
            // Prompt user for input
            System.out.print("Enter student's name and score: ");
            String studentScore = input.nextLine();

            // Assume the first input is the highest
            int k = studentScore.indexOf(' ');
            if (count == 0) {
                name1 = studentScore.substring(0, k);
                score1 = studentScore.substring(k + 1);
            }

            // Assume the second input is the highest
            if (count == 1) {
                name2 = studentScore.substring(0, k);
                score2 = studentScore.substring(k + 1);
            }

            String nextScore = studentScore.substring(studentScore.indexOf(' ') + 1);
            // Compare the score to determine which is greater
            int compare1 = score1.compareTo(nextScore);
            int compare12 = score1.compareTo(score2);

            // if the return is greater than 0, then score is higher
            // if the return is less than 0, then score is lower
            // if the return equals to 0, then both score are the same

            // If score1 is less than score2, then swap them
            if (compare12 > 0 && count > 0) {
                String temp1 = score1;
                score1 = score2;
                score2 = temp1;

                String temp2 = name1;
                name1 = name2;
                name2 = temp2;
            }

            // If the score is a letter grade, then A, B, C, ..., F order
            if (compare1 > 0 && Character.isLetter(nextScore.charAt(0))) {
                // update the new high score
                score1 = nextScore;
                // update the student name
                name1 = studentScore.substring(0, studentScore.indexOf(" "));
            }

            // If the score is an integer, then largest number is the highest
            if (Character.isDigit(nextScore.charAt(0))) {
                int score11 = Integer.parseInt(score1);
                int score22 = Integer.parseInt(nextScore);

                if (score22 > score11) {
                    score1 = nextScore;
                    name1 = studentScore.substring(0, studentScore.indexOf(" "));
                }
            }
            count++;
        }

        // Display Result
        System.out.printf("The student with the highest score is %s with score %s", name1, score1);
        System.out.printf("\nThe student with the second highest score is %s with score %s", name2, score2);
    }
}
