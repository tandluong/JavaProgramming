import java.util.*;
public class Exercise5_48 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        // The book got the String result by getting the even char of the String
        String oddS1 = "";
        for (int i = 0; i < s1.length(); i++)
            if (i % 2 == 0)
                oddS1 += s1.charAt(i);

        // Display Result
        System.out.printf("%s", oddS1);
    }
}
