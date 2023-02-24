import java.util.*;
public class Exercise5_46 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();

        // Reverse the string
        // How would this be approached?
        // We can use a for loop that goes backwards from the String's length
        // Such that i = String.length - 1; i >= 0; i--
        // Concatenate all the chars within the String to another String variable
        String reverseS1 = "";
        for (int i = s1.length() - 1; i >= 0; i--)
            reverseS1 = reverseS1 + s1.charAt(i);

        // Display result
        System.out.printf("The reversed string is %s", reverseS1);
    }
}
