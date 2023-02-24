import java.util.GregorianCalendar;

public class Exercise9_5 {
    public static void main(String[] args) {
        java.util.GregorianCalendar date = new java.util.GregorianCalendar();
        int year = date.get(GregorianCalendar.YEAR);
        int month = date.get(GregorianCalendar.MONTH);
        int day = date.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Year " + year + ", Month " + month + ", Day " + day);
        System.out.println("The current date is: " + date.getTime());

        long time = 1234567898765L;
        date.setTimeInMillis(time);
        System.out.println("The date of " + time + " is " + date.getTime());
    }
}
