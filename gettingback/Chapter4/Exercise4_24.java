import java.util.*;
public class Exercise4_24 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        // Use the method .compareTo to check all cases to see which city is first
        int city1AndCity2 = city1.compareTo(city2);
        int city1AndCity3 = city1.compareTo(city3);
        // if city1 compare to city2 returns negative, then city1 is smaller than city2
        // if city1 compare to city3 returns negative, then city1 is smaller than city3
        // if both conditions are true, then city1 is the first city to be outputted
        boolean isCity1First = city1AndCity2 < 0 && city1AndCity3 < 0;
        // if city1 is first, then what city is second?
        // if city2 compare to city3 returns negative, then city2 is smaller than city3
        int city2AndCity3 = city2.compareTo(city3);
        boolean isCity2Second = isCity1First && city2AndCity3 <= 0;

        int city2AndCity1 = city2.compareTo(city1);
        // Same logic applies
        boolean isCity2First = city2AndCity1 < 0 && city2AndCity3 < 0;
        // if city2 is first, then what city is second?
        // if city1 compare to city3 returns negative, then city1 is smaller than city3
        boolean isCity1Second = isCity2First && city1AndCity3 <= 0;

        int city3AndCity1 = city3.compareTo(city1);
        int city3AndCity2 = city3.compareTo(city2);
        // Same logic applies
        boolean isCity3First = city3AndCity1 < 0 && city3AndCity2 < 0;
        // if city3 is first, then what city is second?
        // if city1 compare to city2 returns negative, then city1 is smaller than city2
        boolean isCity1SecondFor3 = isCity3First && city1AndCity2 < 0;

        boolean oneTwoThree = false;
        boolean oneThreeTwo = false;
        boolean twoOneThree = false;
        boolean twoThreeOne = false;
        boolean threeOneTwo = false;
        boolean threeTwoOne = false;
        // Display result based on the logic
        if (isCity1Second) {
            if (isCity2Second)
                oneTwoThree = true;
            else
                oneThreeTwo = true;
        }
        if (isCity2First) {
            if (isCity1First)
                twoOneThree = true;
            else
                twoThreeOne = true;
        }
        if (isCity3First) {
            if (isCity1SecondFor3)
                threeOneTwo = true;
            else
                threeTwoOne = true;
        }

        // Create Spaces after each city by concatenating space
        city1 += " ";
        city2 += " ";
        city3 += " ";

        // Check all cases and concat the correct city in order
        String inOrder = oneTwoThree ? city1 + city2 + city3 : "Logic is incorrect";
        inOrder = oneThreeTwo ? city1 + city3 + city2 : inOrder;
        inOrder = twoOneThree ? city2 + city1 + city3 : inOrder;
        inOrder = twoThreeOne ? city2 + city3 + city1 : inOrder;
        inOrder = threeOneTwo ? city3 + city1 + city2 : inOrder;
        inOrder = threeTwoOne ? city3 + city2 + city1 : inOrder;

        System.out.printf("The three cities in alphabetical order are %s", inOrder);
    }
}
