public class Exercise8_4 {
    public static void main(String[] args) {
        displayResult();
    }

    public static void displayResult() {
        int[][] employees = getArray();

        for (int[] hours : employees)
            System.out.println("Employee " + hours[0] + " has " +
                    hours[1] + " total hours worked");
    }

    public static int[][] getArray() {
        // Hard coded the input for easier testing
        // This method can be modified to create a Scanner and request input
        int[][] hours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        return bubbleSort(employeeHours(hours));
    }

    public static int[][] bubbleSort(int[][] hours) {
        // This is the same algorithm created in Exercise8_3
        // We will put it in a method this time for re-usability
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                // Uses the bubbleSort method with slight modifications
                if (hours[i][1] < hours[j][1]) {
                    // Swap the students
                    int tempStudent = hours[i][0];
                    hours[i][0] = hours[j][0];
                    hours[j][0] = tempStudent;
                    // Swap the scores
                    int temp = hours[i][1];
                    hours[i][1] = hours[j][1];
                    hours[j][1] = temp;
                }
            }
        }

        return hours;
    }

    public static int[][] employeeHours(int[][] employees) {
        // Given the number of hours per day; i.e., int[day][hours]
        // We will use the array as int[Employee #][# hours]
        int[][] work = new int[employees.length][2];

        // Add all the hours
        for (int i = 0; i < employees.length; i++) {
            work[i][0] = i;
            for (int j = 0; j < employees[i].length; j++) {
                work[i][1] += employees[i][j];
            }
        }

        return work;
    }
}
