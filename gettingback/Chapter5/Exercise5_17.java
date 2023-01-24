import java.util.*;
public class Exercise5_17 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of lines (1-15): ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            // Pad the entire output
            System.out.printf("%20s", " ");
            // Start at row 1; if j is less than num - i, then keep adding spaces
            // Repeat until all rows n are spaced out with input num
            for (int j = i; j <= num; j++) {
                System.out.print("   ");
            }
            // if i is less than 2, skip this loop
            // once i is greater than or equal to 2, apply the logic
            // if i = 2, then j = 0 < 2 -1 (1), then the if statement is true
            // if i = 2, then i - j = 2 - 0 = 2; rinse and repeat
            // if i = 3, 3 - 0 = 3, 3 - 1 = 2, ...
            for (int j = 0; j < i - 1; j++) {
                // We have to consider the change in spacing when num is greater than 10
                // Therefore, if num is greater than 10, then reduce spacing by 1
                if ((i - j) < 10)
                    System.out.print(i - j + "  ");
                else System.out.print(i - j + " ");
            }
            // increasing triangle pattern
            // We set j with starting value 1
            // if i = 1 and j = 1, then j <= i, therefore print j
            // j will increment with i as the loop continues
            // 1
            // 1  2
            // 1  2  3  ...
            for (int j = 1; j <= i; j++) {
                if (j < 10)
                    System.out.print(j + "  ");
                else System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
