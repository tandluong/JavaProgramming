import java.util.*;

public class Exercise2_7 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user input
        System.out.print("Enter the number of minutes: ");
        long minuteInput = input.nextLong();

        // Compute
        long getHours = minuteInput / 60;
        long getDays = getHours / 24;
        long getYears = getDays / 365;
        long getLeftOverDays = getDays % 365;

        // Display result
        System.out.println(minuteInput + " minutes is approximately " + getYears +
                        " years and " + getLeftOverDays + " days");
    }
}
