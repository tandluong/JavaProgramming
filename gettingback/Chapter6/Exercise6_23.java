import java.util.Scanner;

public class Exercise6_23 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        String a = input.next();
        char ch = a.charAt(0);

        // Display Result
        displayResult(s, ch);
    }

    public static int count(String str, char a) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }

        return count;
    }

    public static void displayResult(String s, char a) {
        System.out.printf("The string \"%s\" contains %d character of \"%s\"", s, count(s, a), a);
    }
}
