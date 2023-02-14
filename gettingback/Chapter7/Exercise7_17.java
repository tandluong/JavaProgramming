import java.util.Scanner;

public class Exercise7_17 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Initialize an array of Strings to get student name
        String[] name = new String[numberOfStudents];
        int[] score = new int[numberOfStudents];

        // Prompt user for input
        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter the student's name and score: ");
            name[i] = input.next();
            score[i] = input.nextInt();
        }

        // Print student names in decreasing order of their scores
        for (String s : nameAndScore(name, score))
            System.out.println(s);
    }

    public static String[] nameAndScore(String[] name, int[] score) {
        String[] nameAndScore = new String[name.length];

        // We are using selection sort to find the highest score index
        // Once we have the index, the name and score indexes are the same
        // Therefore, we only need to swap the found index with i
        for (int i = 0; i < score.length; i++) {
            int currentMax = score[i];
            int highScoreIndex = i;
            String student = name[i];

            for (int j = i + 1; j < score.length; j++) {
                if (score[i] < score[j]) {
                    currentMax = score[j];
                    highScoreIndex = j;
                    student = name[j];
                }
            }

            if (highScoreIndex != i) {
                score[highScoreIndex] = score[i];
                name[highScoreIndex] = name[i];
                score[i] = currentMax;
                name[i] = student;
            }

            nameAndScore[i] = "Student " + name[i] +
                    " has score of " + score[i];
        }

        return nameAndScore;
    }
}
