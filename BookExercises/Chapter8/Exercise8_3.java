public class Exercise8_3 {
    public static void main(String[] args) {
        // Students' answers to the questions
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        // Key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        // Grade all answers
        int[][] studentAndScore = new int[answers.length][2];
        for (int i = 0; i < answers.length; i++) {
            // Grade one student
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctCount++;
            }
            studentAndScore[i][0] = i;
            studentAndScore[i][1] = correctCount;
        }

        // We want to display the students in increasing order
        // That means we need to create an array that holds the student's position and their grade
        // Once we have that, we have to sort the array and change their positions
        for (int i = 0; i < studentAndScore.length; i++) {
            for (int j = i + 1; j < studentAndScore.length; j++) {
                // Uses the bubbleSort method with slight modifications
                if (studentAndScore[i][1] < studentAndScore[j][1]) {
                    // Swap the students
                    int tempStudent = studentAndScore[i][0];
                    studentAndScore[i][0] = studentAndScore[j][0];
                    studentAndScore[j][0] = tempStudent;
                    // Swap the scores
                    int temp = studentAndScore[i][1];
                    studentAndScore[i][1] = studentAndScore[j][1];
                    studentAndScore[j][1] = temp;
                }
            }
        }

        // Display the sorted list
        for (int[] ints : studentAndScore)
            System.out.println("Student " + ints[0] + "'s correct count is " +
                    ints[1]);
    }
}
