import java.util.*;
public class Exercise5_29 {
    public static void main(String[] args) {
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

        int count = 1;
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
            String month = "";
            int howManyDays = amountOfDays + firstDay - i;
            if (isLeapYear) {
                if (howManyDays > 366 - 31)
                    month = "January";
                else if (howManyDays > 366 - 31 - 29)
                    month = "February";
                else if (howManyDays > 366 - 31 - 29 - 31)
                    month = "March";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30)
                    month = "April";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31)
                    month = "May";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31 - 30)
                    month = "June";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31)
                    month = "July";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31)
                    month = "August";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30)
                    month = "September";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31)
                    month = "October";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30)
                    month = "November";
                else if (howManyDays > 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30 - 31)
                    month = "December";
            }
            else {
                if (howManyDays > 365 - 31)
                    month = "January";
                else if (howManyDays > 365 - 31 - 28)
                    month = "February";
                else if (howManyDays > 365 - 31 - 28 - 31)
                    month = "March";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30)
                    month = "April";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31)
                    month = "May";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31 - 30)
                    month = "June";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31)
                    month = "July";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31)
                    month = "August";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30)
                    month = "September";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31)
                    month = "October";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30)
                    month = "November";
                else if (howManyDays > 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30 - 31)
                    month = "December";
            }

            int dayOfMonth = 1 + i - firstDay;
            // These if statements down from here perfectly print out each calendar day
            // Adjust the month and days according to print out each month
            // Print January Calendar
            if (month.equals("January")) {
                if (isLeapYear ? howManyDays == 366 : howManyDays == 365) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (dayOfMonth <= 31) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (i == firstDay) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", dayOfMonth);
                            case 1 -> System.out.printf("%9d", dayOfMonth);
                            case 2 -> System.out.printf("%15d", dayOfMonth);
                            case 3 -> System.out.printf("%21d", dayOfMonth);
                            case 4 -> System.out.printf("%27d", dayOfMonth);
                            case 5 -> System.out.printf("%33d", dayOfMonth);
                            case 6 -> System.out.printf("%39d", dayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", dayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", dayOfMonth);
                        }
                    }
                    // We have to account for when the first day started
                    // If we started at 2 and count starts at 1
                    // Therefore, 1 % 7 == 7 - 2 (5); 1, 2, 3, 4, 5
                    // So the first row will only print (5)
                    // Once count is 6 or 7, it will print in the new line
                    // 6, 7, 1, 2, 3, 4, 5 will be in the new line which is (7)
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    // once the month is complete, create a new line
                    if (count % 7 != 7 - firstDay)
                        if (count == 31)
                            System.out.println();
                }
            }

            // Print February Calendar
            // Starting from February, we have to consider is there a leap year
            if (month.equals("February")) {
                if (isLeapYear ? howManyDays == 366 - 31 : howManyDays == 365 - 31) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 && dayOfMonth <= 31 + 29 :
                        dayOfMonth > 31 && dayOfMonth <= 31 + 28) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (i == firstDay + 31) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", dayOfMonth - 31);
                            case 1 -> System.out.printf("%9d", dayOfMonth - 31);
                            case 2 -> System.out.printf("%15d", dayOfMonth - 31);
                            case 3 -> System.out.printf("%21d", dayOfMonth - 31);
                            case 4 -> System.out.printf("%27d", dayOfMonth - 31);
                            case 5 -> System.out.printf("%33d", dayOfMonth - 31);
                            case 6 -> System.out.printf("%39d", dayOfMonth - 31);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", dayOfMonth - 31);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", dayOfMonth - 31);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 : count == 31 + 28)
                            System.out.println();
                }
            }

//          Print March Calendar
            int marchDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 : dayOfMonth - 31 - 28;
            if (month.equals("March")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 : howManyDays == 365 - 31 - 28) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 && dayOfMonth <= 31 + 29 + 31 :
                        dayOfMonth > 31 + 28 && dayOfMonth <= 31 + 28 + 31) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 : i == firstDay + 31 + 28) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", marchDayOfMonth);
                            case 1 -> System.out.printf("%9d", marchDayOfMonth);
                            case 2 -> System.out.printf("%15d", marchDayOfMonth);
                            case 3 -> System.out.printf("%21d", marchDayOfMonth);
                            case 4 -> System.out.printf("%27d", marchDayOfMonth);
                            case 5 -> System.out.printf("%33d", marchDayOfMonth);
                            case 6 -> System.out.printf("%39d", marchDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", marchDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", marchDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 : count == 31 + 28 + 31)
                            System.out.println();
                }
            }

            // Print April Calendar
            int aprilDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 : dayOfMonth - 31 - 28 - 31;
            if (month.equals("April")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 : howManyDays == 365 - 31 - 28 - 31) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 && dayOfMonth <= 31 + 29 + 31 + 30 :
                        dayOfMonth > 31 + 28 + 31 && dayOfMonth <= 31 + 28 + 31 + 30) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 : i == firstDay + 31 + 28 + 31) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", aprilDayOfMonth);
                            case 1 -> System.out.printf("%9d", aprilDayOfMonth);
                            case 2 -> System.out.printf("%15d", aprilDayOfMonth);
                            case 3 -> System.out.printf("%21d", aprilDayOfMonth);
                            case 4 -> System.out.printf("%27d", aprilDayOfMonth);
                            case 5 -> System.out.printf("%33d", aprilDayOfMonth);
                            case 6 -> System.out.printf("%39d", aprilDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", aprilDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", aprilDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 : count == 31 + 28 + 31 + 30)
                            System.out.println();
                }
            }

            // Print May Calendar
            int mayDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 :
                    dayOfMonth - 31 - 28 - 31 - 30;
            if (month.equals("May")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 :
                        howManyDays == 365 - 31 - 28 - 31 - 30) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 && dayOfMonth <= 31 + 29 + 31 + 30 + 31 :
                        dayOfMonth > 31 + 28 + 31 + 30 && dayOfMonth <= 31 + 28 + 31 + 30 + 31) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 : i == firstDay + 31 + 28 + 31 + 30) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", mayDayOfMonth);
                            case 1 -> System.out.printf("%9d", mayDayOfMonth);
                            case 2 -> System.out.printf("%15d", mayDayOfMonth);
                            case 3 -> System.out.printf("%21d", mayDayOfMonth);
                            case 4 -> System.out.printf("%27d", mayDayOfMonth);
                            case 5 -> System.out.printf("%33d", mayDayOfMonth);
                            case 6 -> System.out.printf("%39d", mayDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", mayDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", mayDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 : count == 31 + 28 + 31 + 30 + 31)
                            System.out.println();
                }
            }

            // Print June Calendar
            int juneDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 - 31 :
                    dayOfMonth - 31 - 28 - 31 - 30 - 31;
            if (month.equals("June")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 - 31 :
                        howManyDays == 365 - 31 - 28 - 31 - 30 - 31) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 + 31
                        && dayOfMonth <= 31 + 29 + 31 + 30 + 31 + 30 :
                        dayOfMonth > 31 + 28 + 31 + 30 + 31
                        && dayOfMonth <= 31 + 28 + 31 + 30 + 31 + 30) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 + 31 :
                            i == firstDay + 31 + 28 + 31 + 30 + 31) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", juneDayOfMonth);
                            case 1 -> System.out.printf("%9d", juneDayOfMonth);
                            case 2 -> System.out.printf("%15d", juneDayOfMonth);
                            case 3 -> System.out.printf("%21d", juneDayOfMonth);
                            case 4 -> System.out.printf("%27d", juneDayOfMonth);
                            case 5 -> System.out.printf("%33d", juneDayOfMonth);
                            case 6 -> System.out.printf("%39d", juneDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", juneDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", juneDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 + 30 :
                                count == 31 + 28 + 31 + 30 + 31 + 30)
                            System.out.println();
                }
            }

            // Print July Calendar
            int julyDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 - 31 - 30:
                    dayOfMonth - 31 - 28 - 31 - 30 - 31 - 30;
            if (month.equals("July")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 - 31 - 30:
                        howManyDays == 365 - 31 - 28 - 31 - 30 - 31 - 30) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 + 31 + 30
                        && dayOfMonth <= 31 + 29 + 31 + 30 + 31 + 30 + 31 :
                        dayOfMonth > 31 + 28 + 31 + 30 + 31 + 30
                        && dayOfMonth <= 31 + 28 + 31 + 30 + 31 + 30 + 31) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 + 31 + 30 :
                            i == firstDay + 31 + 28 + 31 + 30 + 31 + 30) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", julyDayOfMonth);
                            case 1 -> System.out.printf("%9d", julyDayOfMonth);
                            case 2 -> System.out.printf("%15d", julyDayOfMonth);
                            case 3 -> System.out.printf("%21d", julyDayOfMonth);
                            case 4 -> System.out.printf("%27d", julyDayOfMonth);
                            case 5 -> System.out.printf("%33d", julyDayOfMonth);
                            case 6 -> System.out.printf("%39d", julyDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", julyDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", julyDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 + 30 + 31 :
                                count == 31 + 28 + 31 + 30 + 31 + 30 + 31)
                            System.out.println();
                }
            }

            // Print August Calendar
            int augustDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 - 31 - 30 - 31:
                    dayOfMonth - 31 - 28 - 31 - 30 - 31 - 30 - 31;
            if (month.equals("August")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31:
                        howManyDays == 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 + 31 + 30 + 31
                        && dayOfMonth <= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 :
                        dayOfMonth > 31 + 28 + 31 + 30 + 31 + 30 + 31
                        && dayOfMonth <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 + 31 + 30 + 31:
                            i == firstDay + 31 + 28 + 31 + 30 + 31 + 30 + 31) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", augustDayOfMonth);
                            case 1 -> System.out.printf("%9d", augustDayOfMonth);
                            case 2 -> System.out.printf("%15d", augustDayOfMonth);
                            case 3 -> System.out.printf("%21d", augustDayOfMonth);
                            case 4 -> System.out.printf("%27d", augustDayOfMonth);
                            case 5 -> System.out.printf("%33d", augustDayOfMonth);
                            case 6 -> System.out.printf("%39d", augustDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", augustDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", augustDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 :
                            count == 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31)
                            System.out.println();
                }
            }

            // Print September Calendar
            int septemberDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31:
                    dayOfMonth - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31;
            if (month.equals("September")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31:
                        howManyDays == 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31
                        && dayOfMonth <= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30:
                        dayOfMonth > 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31
                        && dayOfMonth <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 :
                            i == firstDay + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", septemberDayOfMonth);
                            case 1 -> System.out.printf("%9d", septemberDayOfMonth);
                            case 2 -> System.out.printf("%15d", septemberDayOfMonth);
                            case 3 -> System.out.printf("%21d", septemberDayOfMonth);
                            case 4 -> System.out.printf("%27d", septemberDayOfMonth);
                            case 5 -> System.out.printf("%33d", septemberDayOfMonth);
                            case 6 -> System.out.printf("%39d", septemberDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", septemberDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", septemberDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30:
                                count == 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30)
                            System.out.println();
                }
            }

            // Print October Calendar
            int octoberDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30:
                    dayOfMonth - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30;
            if (month.equals("October")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30:
                        howManyDays == 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30
                        && dayOfMonth <= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31:
                        dayOfMonth > 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30
                        && dayOfMonth <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 :
                            i == firstDay + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", octoberDayOfMonth);
                            case 1 -> System.out.printf("%9d", octoberDayOfMonth);
                            case 2 -> System.out.printf("%15d", octoberDayOfMonth);
                            case 3 -> System.out.printf("%21d", octoberDayOfMonth);
                            case 4 -> System.out.printf("%27d", octoberDayOfMonth);
                            case 5 -> System.out.printf("%33d", octoberDayOfMonth);
                            case 6 -> System.out.printf("%39d", octoberDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", octoberDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", octoberDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31:
                                count == 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31)
                            System.out.println();
                }
            }

            // Print November Calendar
            int novemberDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31:
                    dayOfMonth - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31;
            if (month.equals("November")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31:
                        howManyDays == 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
                        && dayOfMonth <= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30:
                        dayOfMonth > 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31
                        && dayOfMonth <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 :
                            i == firstDay + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", novemberDayOfMonth);
                            case 1 -> System.out.printf("%9d", novemberDayOfMonth);
                            case 2 -> System.out.printf("%15d", novemberDayOfMonth);
                            case 3 -> System.out.printf("%21d", novemberDayOfMonth);
                            case 4 -> System.out.printf("%27d", novemberDayOfMonth);
                            case 5 -> System.out.printf("%33d", novemberDayOfMonth);
                            case 6 -> System.out.printf("%39d", novemberDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", novemberDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", novemberDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30:
                                count == 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30)
                            System.out.println();
                }
            }

            // Print December Calendar
            int decemberDayOfMonth = isLeapYear ? dayOfMonth - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30:
                    dayOfMonth - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30;
            if (month.equals("December")) {
                if (isLeapYear ? howManyDays == 366 - 31 - 29 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30:
                        howManyDays == 365 - 31 - 28 - 31 - 30 - 31 - 30 - 31 - 31 - 30 - 31 - 30) {
                    System.out.printf("""
                        %20s %d
                        ----------------------------------------
                        %4s %5s %5s %5s %5s %5s %5s
                        """,
                            month, year, "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
                }
                if (isLeapYear ? dayOfMonth > 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30
                        && dayOfMonth <= 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31 :
                        dayOfMonth > 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30
                        && dayOfMonth <= 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31) {
                    // If the first day is at a specific day, then space it out accordingly
                    if (isLeapYear ? i == firstDay + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 :
                            i == firstDay + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30) {
                        switch (i % 7) {
                            case 0 -> System.out.printf("%3d", decemberDayOfMonth);
                            case 1 -> System.out.printf("%9d", decemberDayOfMonth);
                            case 2 -> System.out.printf("%15d", decemberDayOfMonth);
                            case 3 -> System.out.printf("%21d", decemberDayOfMonth);
                            case 4 -> System.out.printf("%27d", decemberDayOfMonth);
                            case 5 -> System.out.printf("%33d", decemberDayOfMonth);
                            case 6 -> System.out.printf("%39d", decemberDayOfMonth);
                        }
                    }
                    else {
                        switch (day) {
                            case "Sunday" -> System.out.printf("%3d", decemberDayOfMonth);
                            // all of these days are spaced out the same once the first day is found
                            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" ->
                                    System.out.printf("%6d", decemberDayOfMonth);
                        }
                    }
                    if (count % 7 == 7 - firstDay)
                        System.out.println();

                    if (count % 7 != 7 - firstDay)
                        if (isLeapYear ? count == 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31:
                                count == 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31)
                            System.out.println();
                }
            }

            count++;
        }
    }
}
