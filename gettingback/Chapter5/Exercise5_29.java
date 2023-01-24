import java.util.*;
public class Exercise5_29 {
    public static void main(String[] args) {
        // We will be reusing code from Exercise5_28 and make adjustments accordingly
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of the year: ");
        int firstDay = input.nextInt();

        // Know the amount of days in each month
        // Jan, Mar, May, Jul, Aug, Oct, and Dec have 31 days 31 x 7 = 217
        // Feb has 28 days; 29 days if leap year
        // Apr, Jun, Sep, and Nov have 30 days 30 x 4 = 120
        // 217 + 120 + 28/29 = 365/366 total days

        // Check for leap years
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // Determine the amount of days to go through if it is a leap year or not
        int amountOfDays = isLeapYear ? 366 : 365;

        for (int i = firstDay; i < (amountOfDays + firstDay); i++) {
            String day = switch (i % 7) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Incorrect";
            };
            // Is it a leap year? If it is, then add 1 starting day and 1 day to february
            String month = isLeapYear ?
                    switch ((amountOfDays + firstDay) - i) {
                        case 336 -> "January";
                        case 305 -> "February";
                        case 276 -> "March";
                        case 245 -> "April";
                        case 215 -> "May";
                        case 184 -> "June";
                        case 154 -> "July";
                        case 123 -> "August";
                        case 92 -> "September";
                        case 62 -> "October";
                        case 31 -> "November";
                        case 1 -> "December";
                        default -> "Incorrect";
                    }:
                    switch ((amountOfDays + firstDay) - i) {
                        case 335 -> "January";
                        case 304 -> "February";
                        case 276 -> "March";
                        case 245 -> "April";
                        case 215 -> "May";
                        case 184 -> "June";
                        case 154 -> "July";
                        case 123 -> "August";
                        case 92 -> "September";
                        case 62 -> "October";
                        case 31 -> "November";
                        case 1 -> "December";
                        default -> "Incorrect";
                    };

            if (!day.equals("Incorrect") && !month.equals("Incorrect")) {
                System.out.printf("%s 1, %d is %s\n", month, year, day);
            }
        }
    }
}
