import java.util.*;
public class Exercise3_5 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter today's day: ");
        int todayDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int dayElapsed = input.nextInt();

        // Create a switch statement for each day in cases
        // There are 7 days a week - 0, 1, 2, ..., 6
        switch (todayDay) {
            case 0: System.out.print("Today is Sunday"); break;
            case 1: System.out.print("Today is Monday"); break;
            case 2: System.out.print("Today is Tuesday"); break;
            case 3: System.out.print("Today is Wednesday"); break;
            case 4: System.out.print("Today is Thursday"); break;
            case 5: System.out.print("Today is Friday"); break;
            case 6: System.out.print("Today is Saturday");
        }

        // Create a switch statement for future days
        // The final day will be the current day + days elapsed mod 7
        switch (todayDay + dayElapsed % 7) {
            case 0: System.out.print(" and the future day is Sunday"); break;
            case 1: System.out.print(" and the future day is Monday"); break;
            case 2: System.out.print(" and the future day is Tuesday"); break;
            case 3: System.out.print(" and the future day is Wednesday"); break;
            case 4: System.out.print(" and the future day is Thursday"); break;
            case 5: System.out.print(" and the future day is Friday"); break;
            case 6: System.out.print(" and the future day is Saturday");
        }
    }
}
