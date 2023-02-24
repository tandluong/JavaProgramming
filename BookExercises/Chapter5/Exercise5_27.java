public class Exercise5_27 {
    public static void main(String[] args) {
        // Initialize known variables
        int year = 101;

        int counter = 0;
        while (year <= 2100) {
            // Check if the year is a leap year
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear) {
                System.out.print(year + " ");
                counter++;
                if (counter % 8 == 0) {
                    System.out.println();
                }
            }

            year++;
        }

        // Display the number of leap years in this period
        System.out.println("\nThe numbers of leap years in this period is " + counter);
    }
}
