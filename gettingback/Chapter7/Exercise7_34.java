import java.util.Scanner;

public class Exercise7_34 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Invoke method to sort String
        String sSorted = sort(s);

        // Display result
        System.out.printf("The String \"%s\" sorted is \"%s\"", s, sSorted);
    }

    public static String sort(String s) {
        // How would we sort a string?
        // We will have to compare and sort the Chars inside the String

        // Get the length of the string
        int sLength = s.length();
        // Initialize a char array based on the String's length
        char[] sInChar = new char[sLength];
        // Divide each char in the String into the char array
        for (int i = 0; i < sLength; i++)
            sInChar[i] = s.charAt(i);

        // Modify of one the sorting methods to sort the Chars
        // We will use selection sort
        for (int i = 0; i < sLength; i++) {
            // Initialize the current value at list[i]
            char currentMin = sInChar[i];
            int currentMinIndex = i;

            // Find the lowest value from i + 1 in the list
            // and find its value and location
            for (int j = i + 1; j < sLength; j++) {
                if (currentMin > sInChar[j]) {
                    currentMin = sInChar[j];
                    currentMinIndex = j;
                }
            }

            // If the initial low and next low are not at the same location, swap them
            // else the swapping is skipped; no action needed
            if (currentMinIndex != i) {
                sInChar[currentMinIndex] = sInChar[i];
                sInChar[i] = currentMin;
            }
        }

        String sorted = "";
        for (char ch : sInChar)
            sorted += ch;

        return sorted;
    }
}
