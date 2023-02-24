import java.util.*;
public class Exercise4_10 {
    public static void main(String[] args) {
        String set1 =
                """
                         1  3  5  7
                         9 11 13 15
                        17 19 21 23
                        25 27 29 31""";

        String set2 =
                """
                         2  3  6  7
                        10 11 14 15
                        18 19 22 23
                        26 27 30 31""";

        String set3 =
                """
                         4  5  6  7
                        12 13 14 15
                        20 21 22 23
                        28 29 30 31""";

        String set4 =
                """
                         8  9 10 11
                        12 13 14 15
                        24 25 26 27
                        28 29 30 31""";

        String set5 =
                """
                        16 17 18 19
                        20 21 22 23
                        24 25 26 27
                        28 29 30 31""";

        int day = 0;

        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input for set1
        System.out.print("Is your birthday in Set1?\n");
        System.out.print(set1);
        System.out.print("\nEnter N for No and Y for Yes: ");
        String answer = input.next();
        char finalAnswer = answer.charAt(0);

        day = (finalAnswer == 'Y') ? day + 1 : day;

        // Prompt user for input for set2
        System.out.print("\nIs your birthday in Set2?\n");
        System.out.print(set2);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.next();
        finalAnswer = answer.charAt(0);

        day = (finalAnswer == 'Y') ? day + 2 : day;

        // Prompt user for input for set3
        System.out.print("\nIs your birthday in Set3?\n");
        System.out.print(set3);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.next();
        finalAnswer = answer.charAt(0);

        day = (finalAnswer == 'Y') ? day + 4 : day;

        // Prompt user for input for set4
        System.out.print("\nIs your birthday in Set4?\n");
        System.out.print(set4);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.next();
        finalAnswer = answer.charAt(0);

        day = (finalAnswer == 'Y') ? day + 8 : day;

        // Prompt user for input for set5
        System.out.print("\nIs your birthday in Set5?\n");
        System.out.print(set5);
        System.out.print("\nEnter N for No and Y for Yes: ");
        answer = input.next();
        finalAnswer = answer.charAt(0);

        day = (finalAnswer == 1) ? day + 16 : day;

        // Display Result
        System.out.println("\nYour birthday is " + day + "!");
    }
}
