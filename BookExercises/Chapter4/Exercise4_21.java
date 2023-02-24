import java.util.*;
public class Exercise4_21 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a SSN: ");
        String ssn = input.next();

        // Given the format on a SSN, there are 3 parts we must consider
        /* The first part has 3 numbers with a dash
           The second part has 2 numbers with a dash, and
           The third part has 4 numbers
         */
        // Find the first part
        // We want to stop before the first dash
        String firstPart = ssn.substring(0, ssn.indexOf('-'));
        // We want to start after the first dash and end at the second dash
        String secondPart = ssn.substring(ssn.indexOf('-') + 1, ssn.lastIndexOf('-'));
        // We want the remaining numbers after the second dash
        String thirdPart = ssn.substring(ssn.lastIndexOf('-') + 1);

        // Check if SSN is valid by checking its length
        int firstPartLength = firstPart.length();
        int secondPartLength = secondPart.length();
        int thirdPartLength = thirdPart.length();
        boolean isFirstPartValid = firstPartLength == 3;
        boolean isSecondPartValid = secondPartLength == 2;
        boolean isThirdPartValid = thirdPartLength == 4;

        char firstPartChar1 = 'F', firstPartChar2 = 'F', firstPartChar3 = 'F';
        char secondPartChar1 = 'F', secondPartChar2 = 'F';
        char thirdPartChar1 = 'F', thirdPartChar2 = 'F', thirdPartChar3 = 'F', thirdPartChar4 = 'F';

        // if the length is true, then check individual Char in each part
        // to make sure that there aren't any letters
        if (isFirstPartValid) {
            firstPartChar1 = firstPart.charAt(0);
            firstPartChar2 = firstPart.charAt(1);
            firstPartChar3 = firstPart.charAt(2);
        }
        if (isSecondPartValid) {
            secondPartChar1 = secondPart.charAt(0);
            secondPartChar2 = secondPart.charAt(1);
        }
        if (isThirdPartValid) {
            thirdPartChar1 = thirdPart.charAt(0);
            thirdPartChar2 = thirdPart.charAt(1);
            thirdPartChar3 = thirdPart.charAt(2);
            thirdPartChar4 = thirdPart.charAt(3);
        }

        // We know numbers 0 to 9 in Char have value 48 to 57
        // Therefore; if the Char is between 48 and 57, then we know it is a number

//        boolean firstPartValidNumber = firstPartChar1 >= 48 && firstPartChar1 <= 57 &&
//                firstPartChar2 >= 48 && firstPartChar2 <= 57 && firstPartChar3 >= 48 &&
//                firstPartChar3 <= 57;
//        boolean secondPartValidNumber = secondPartChar1 >= 48 && secondPartChar1 <= 57 &&
//                secondPartChar2 >= 48 && secondPartChar2 <= 57;
//        boolean thirdPartValidNumber = thirdPartChar1 >= 48 && thirdPartChar1 <= 57 &&
//                thirdPartChar2 >= 48 && thirdPartChar2 <= 57 && thirdPartChar3 >= 48 &&
//                thirdPartChar3 <= 57 && thirdPartChar4 >= 48 && thirdPartChar4 <= 57;

        // We can also use the Character.isDigit() to verify if the input is a number as well
        boolean firstPartValidNumber = Character.isDigit(firstPartChar1) &&
                Character.isDigit(firstPartChar2) && Character.isDigit(firstPartChar3);
        boolean secondPartValidNumber = Character.isDigit(secondPartChar1) && Character.isDigit(secondPartChar2);
        boolean thirdPartValidNumber = Character.isDigit(thirdPartChar1) && Character.isDigit(thirdPartChar2) &&
                Character.isDigit(thirdPartChar3) && Character.isDigit(thirdPartChar4);

        if (firstPartValidNumber && secondPartValidNumber && thirdPartValidNumber)
            System.out.printf("%s is a valid social security number", ssn);
        else
            System.out.printf("%s is an invalid social security number", ssn);
    }
}
