import java.util.*;
public class Exercise4_17 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();

        // Check for leap years
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // Get the last two letters
        String lastTwoLetters = month.substring(1);
        // Get the first letter and capitalize it
        char firstLetter = Character.toUpperCase(month.charAt(0));
        String correctMonthInput = firstLetter + lastTwoLetters;

        // Create a switch statement to yield correct days for each month;
        int days = switch (correctMonthInput) {
            case "Jan","Mar","May","Jul","Aug","Oct","Dec": yield 31;
            case "Feb": yield 28;
            case "Apr","Jun","Sep","Nov": yield 30;
            default: yield -1;
        };

        // Check if it is a leap year and if there are 28 days
        // if it is, then add 1 day; else return the same value
        days = isLeapYear && days == 28 ? days + 1 : days;

        // Display Result
        if (days != -1)
            System.out.printf("%s %d has %d days", correctMonthInput, year, days);
        else
            System.out.printf("%s is an invalid input", correctMonthInput);
    }
}
