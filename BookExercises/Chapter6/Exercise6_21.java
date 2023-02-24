import java.util.Scanner;

public class Exercise6_21 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // Display result
        displayResult(s);
    }

    public static int getNumber(char uppercaseLetter) {
        // We know that uppercase letter char value is 65-90
        // We then we have to pair specific letters to phone keypads
        // ABC = 2; DEF = 3; GHI = 4; JKL = 5; MNO = 6; PQRS = 7; TUV = 8; WXYZ = 9
        return switch (uppercaseLetter) {
            case 65, 66, 67 -> 2;
            case 68, 69, 70 -> 3;
            case 71, 72, 73 -> 4;
            case 74, 75, 76 -> 5;
            case 77, 78, 79 -> 6;
            case 80, 81, 82, 83 -> 7;
            case 84, 85, 86 -> 8;
            case 87, 88, 89, 90 -> 9;
            default -> -1;
        };
    }

    public static String outPut(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(Character.toUpperCase(s.charAt(i))))
                output += getNumber(Character.toUpperCase(s.charAt(i)));
            else
                output += s.charAt(i);
        }

        return output;
    }

    public static void displayResult(String s) {
        System.out.println(outPut(s));
    }
}
