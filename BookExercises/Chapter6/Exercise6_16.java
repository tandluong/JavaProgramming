public class Exercise6_16 {
    public static void main(String[] args) {
        // Call displayResult to display result
        displayResult();
    }

    public static int numberOfDaysInAYear(int year) {
        // Check if it is a leap year
        // if true, return 366 days else return 365 days
        return isLeapYear(year) ? 366 : 365;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static void displayResult() {
        int startYear = 2000;
        int endYear = 2020;

        int totalNumberOfDays = 0;
        while (startYear <= endYear) {
            totalNumberOfDays += numberOfDaysInAYear(startYear);
            startYear++;
        }

        System.out.printf("There are %d days between %d and %d",
                totalNumberOfDays, startYear, endYear);
    }
}
