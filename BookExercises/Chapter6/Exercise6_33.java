public class Exercise6_33 {
    public static void main(String[] args) {
        // This Exercise is the same as Exercise6_24
        // We will make minor adjustments to get the same display as the textbook
        showCurrentTime();
    }

    public static void showCurrentTime() {
        // We know that computer time started on January 1, 1970,
        // We can keep dividing down to get how many days have passed since then
        // Once we have the days, then we can find the number of months and years

        // Display Result
        printCurrentDateAndTime();
    }

    public static void printCurrentDateAndTime() {
        // Obtain the milliseconds
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the seconds from milliseconds
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = getCurrentSecond(totalSeconds);

        // Obtain the minute from seconds
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = getCurrentMinute(totalMinutes);

        // Obtain the hour from the minutes
        long totalHour = totalMinutes / 60;

        // Compute the current hour
        long currentHour = getCurrentHour(totalHour);

        // Obtain the day from the hours
        long totalDay = totalHour / 24;

        // Compute the current day
        long currentDay = getCurrentDay(totalDay);

        // Compute the current day plus remaining days
        long totalCurrentDay = getRemainingDays(totalDay) + 1;

        // Compute the current month
        long currentMonth = getCurrentMonth(totalDay);

        // Compute the current year
        long currentYear = getCurrentYear(totalDay);

        // Display result
        System.out.printf("Current date and time is %s %d, %d %d:%d:%d",
                getMonthFromNumber((int) currentMonth), totalCurrentDay, currentYear,
                currentHour, currentMinute, currentSecond);
    }

    public static String getDayFromNumber(int number) {
        return switch (number) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Incorrect month";
        };
    }

    public static String getMonthFromNumber(int number) {
        return switch (number) {
            case 0 -> "December";
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
            default -> "Incorrect month";
        };
    }

    public static long getCurrentSecond(long totalMilliseconds) {
        return totalMilliseconds % 60;
    }

    public static long getCurrentMinute(long totalSeconds) {
        return totalSeconds % 60;
    }

    public static long getCurrentHour(long totalMinute) {
        return totalMinute % 24;
    }

    public static long getCurrentDay(long totalDay) {
        final int START_DAY_FOR_JAN_1_1970 = 4;

        return (totalDay + START_DAY_FOR_JAN_1_1970) % 7;
    }

    public static long getRemainingDays(long totalDay) {
        int year = 1970;
        int month = 1;
        while (totalDay >= 30) {
            switch (month % 12) {
                case 1, 3, 5, 7, 8, 10, 0 -> {
                    totalDay -= 31;
                    month++;
                }
                case 2 -> {
                    totalDay = isLeapYear(year) ? totalDay - 29 : totalDay - 28;
                    month++;
                }
                case 4, 6, 9, 11 -> {
                    totalDay -= 30;
                    month++;
                }
            }
            if (month % 12 == 0) {
                year++;
            }
        }

        return totalDay;
    }

    public static long getCurrentMonth(long totalDay) {
        // How to convert days into months?
        // We can get the total years and left over days to find how many months
        int year = 1970;
        int month = 1;
        while (totalDay >= 30) {
            switch (month % 12) {
                case 1, 3, 5, 7, 8, 10, 0 -> {
                    totalDay -= 31;
                    month++;
                }
                case 2 -> {
                    totalDay = isLeapYear(year) ? totalDay - 29 : totalDay - 28;
                    month++;
                }
                case 4, 6, 9, 11 -> {
                    totalDay -= 30;
                    month++;
                }
            }
            if (month % 12 == 0) {
                year++;
            }
        }

        return month % 12;
    }

    public static long getCurrentYear(long totalDay) {
        int startingYear = 1970;

        while (isLeapYear(startingYear) ? totalDay >= 366 : totalDay >= 365) {
            totalDay = isLeapYear(startingYear) ? totalDay - 366 : totalDay - 365;
            startingYear++;
        }

        return startingYear;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
