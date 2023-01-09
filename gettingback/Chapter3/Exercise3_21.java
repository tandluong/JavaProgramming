import java.util.*;
public class Exercise3_21 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter the month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();

        // Check if month is 1 or 2
        if (month <= 2 && month > 0) {
            month += 12;
            year -= 1;
        }

        // Calculate the day of the week with given formula
        int q = day;
        int j = year / 100;
        int k = year % 100;
        int h = (q + (26 * (month + 1) / 10) + (k) + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Check if user input is within range of suggested month and day
        boolean validMonth = month > 0 && month <= 12;
        boolean validDay = day > 1 && day <= 31;

        if (validMonth && validDay) {
            // Display Result
            switch (h) {
                case 0: System.out.println("Day of the week is Saturday"); break;
                case 1: System.out.println("Day of the week is Sunday"); break;
                case 2: System.out.println("Day of the week is Monday"); break;
                case 3: System.out.println("Day of the week is Tuesday"); break;
                case 4: System.out.println("Day of the week is Wednesday"); break;
                case 5: System.out.println("Day of the week is Thursday"); break;
                case 6: System.out.println("Day of the week is Friday");
            }
        }
        // If user input is invalid, then let the user know the reason
        if (!validMonth)
            System.out.println("Please enter a month between 1-12");
        if (!validDay)
            System.out.println("Please enter a day between 1-31");
    }
}
