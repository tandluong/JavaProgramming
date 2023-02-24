import java.util.Scanner;

public class Exercise7_1 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        // Create an array for n number of students
        int[] score = new int[numberOfStudents];
        // Prompt user to input student score
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < score.length; i++)
            score[i] = input.nextInt();

        // Find the highest score in array students
        int max = 0;
        for (int i = 0; i < score.length; i++)
            if (score[i] > max)
                max = score[i];

        // Define the Grade system
        char[] grade = {'A', 'B', 'C', 'D', 'F'};

        String[] result = new String[score.length];
        for (int i = 0; i < result.length; i++) {
            char studentGrade;
            if (score[i] >= max - 10)
                studentGrade = grade[0];
            else if (score[i] >= max - 20)
                studentGrade = grade[1];
            else if (score[i] >= max - 30)
                studentGrade = grade[2];
            else if (score[i] >= max - 40)
                studentGrade = grade[3];
            else
                studentGrade = grade[4];

            result[i] = "Student " + i + " score is " + score[i] + " and grade is " + studentGrade;
        }

        // Print the result array to display result
        for (String s: result)
            System.out.println(s);
    }
}
