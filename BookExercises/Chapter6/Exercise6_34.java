import java.util.Scanner;

public class Exercise6_34 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for month of the year
        if (month >= 1 && month <= 12 || year >= 1800)
            printMonth(year, month);
        else
            System.out.print("Incorrect input");
    }

    // Print the calendar for a month in a year
    public static void printMonth(int year, int month) {
        // Print the headings of the calendar
        printMonthTitle(year, month);

        // Print the body of the calendar
        printMonthBody(year, month);
    }

    // Print hte month title, e.g., March 2012
    public static void printMonthTitle(int year, int month) {
        System.out.println("          " + getMonthName(month) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    // Get the English name for the month
    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "-1";
        };
    }

    // Print month body
    public static void printMonthBody(int year, int month) {
        // Get start day of the week for the first date in the month
        int startDay = getStartDay(year, month);

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space before the first day of the month
        // initialize "i"
        int i;
        // "i" will be 0
        for (i = 0; i < startDay; i++)
            System.out.print("    ");

        // "i" will be reset to 1
        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    // Get the start day of month/1/year
    public static int getStartDay(int year, int month) {
        if (month <= 2 && month > 0) {
            month += 12;
            year -= 1;
        }
        // Day 0 because we want the first day
        int q = 0;
        int j = year / 100;
        int k = year % 100;
        // Return the start day for month/1/year
        return (q + (26 * (month + 1) / 10) + (k) + (k / 4) + (j / 4) + (5 * j)) % 7;
    }

    // Get the number of days in a month
    public static int getNumberOfDaysInMonth(int year, int month) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 0; // If month is incorrect
        };
    }

    // Determine if it is a leap year
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
