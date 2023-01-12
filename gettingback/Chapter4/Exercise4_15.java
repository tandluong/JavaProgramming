import java.util.*;
public class Exercise4_15 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a letter: ");
        String userInput = input.next();
        char letter = userInput.charAt(0);

        // Phone key pads start with 2 and ends with 9
        /* We know that ABC is 2, DEF is 3, GHI is 4, JKL is 5,
           MNO is 6, PQRS is 7, TUV is 8, WXYZ is 9
           From there, we have to know their char value
           ABC = 65,66,67; DEF = 68,69,70; GHI = 71,72,73;
           JKL = 74,75,76; MNO = 77,78,79; PQRS = 80,81,82,83;
           TUV = 84,85,86; WXYZ = 87,88,89,90
           abc = 97,98,99; def = 100,101,102; ghi = 103,104,105;
           jkl = 106,107,108; mno = 109,110,111; pqrs = 112,113,114,115;
           tuv = 116,117,118; wxyz = 119,120,121,122
        */
        int number = switch (letter) {
            case 65,66,67,97,98,99: yield 2;
            case 68,69,70,100,101,102: yield 3;
            case 71,72,73,103,104,105: yield 4;
            case 74,75,76,106,107,108: yield 5;
            case 77,78,79,109,110,111: yield 6;
            case 80,81,82,83,112,113,114,115: yield 7;
            case 84,85,86,116,117,118: yield 8;
            case 87,88,89,90,119,120,121,122: yield 9;
            default: yield -1;
        };

        if (number != -1)
            System.out.printf("The corresponding number is %d", number);
        else
            System.out.printf("%s is an invalid input", userInput);
    }
}
