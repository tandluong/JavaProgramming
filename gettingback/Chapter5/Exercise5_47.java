import java.util.*;
public class Exercise5_47 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String s1 = input.nextLine();

        // Check if input is valid
        if (s1.length() != 12)
            System.out.printf("%s is an invalid input", s1);
        else {
            // We will have to extract all the digits from the string input and calculate the checksum
            // We can obtain each digit by using a for loop
            int digits = 0;
            for (int i = 0; i < s1.length(); i++) {
                // Since we are extracting Chars from String, we must consider their Char decimal value
                // 0-9 has decimal value 48-57; therefore we'll use char - 48
                if ((i + 1) % 2 == 0)
                    digits += 3 * (s1.charAt(i) - 48);
                else
                    digits += s1.charAt(i) - 48;
            }
            // Once all the digits sum are found, then we can find the Check Sum
            int checkSum = 10 - (digits % 10);
            // If Check Sum is 10, replace it with 0
            if (checkSum == 10)
                checkSum = 0;
            // Display Result
            System.out.printf("The ISBN-13 number is %s", s1 + checkSum);
        }
    }
}
