import java.util.*;
public class Exercise3_11 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the month: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Check if year is a leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Display Results
        // all days of the other months are constant
        // only February needs to be accounted for leap years
        switch (month) {
            case 1: System.out.println("January " + year + " had 31 days"); break;
            case 2: if (!isLeapYear)
                        System.out.println("February " + year + " had 28 days");
                    else
                        System.out.println("February " + year + " had 29 days"); break;
            case 3: System.out.println("March " + year + " had 31 days"); break;
            case 4: System.out.println("April " + year + " had 30 days"); break;
            case 5: System.out.println("May " + year + " had 31 days"); break;
            case 6: System.out.println("June " + year + " had 30 days"); break;
            case 7: System.out.println("July " + year + " had 31 days"); break;
            case 8: System.out.println("August " + year + " had 31 days"); break;
            case 9: System.out.println("September " + year + " had 30 days"); break;
            case 10: System.out.println("October " + year + " had 31 days"); break;
            case 11: System.out.println("November " + year + " had 30 days"); break;
            case 12: System.out.println("December " + year + " had 31 days");
        }
    }
}
