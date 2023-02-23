import java.util.Scanner;

public class Exercise8_37 {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);
        // Initialize known variables
        // Starting
        int countStateAndCapital = 0;
        // Ending
        int totalStateAndCapital = 50;
        // counter for correct answers
        int correct = 0;
        while (countStateAndCapital < totalStateAndCapital) {
            // Get the state and capital at starting value
            String[] stateAndCapital = getStateAndCapital(countStateAndCapital);
            // Prompt user for input
            System.out.print("What is the capital of " + stateAndCapital[0] + "? ");
            String capital = input.nextLine();
            if (capital.equalsIgnoreCase(stateAndCapital[1])) {
                System.out.println("Your answer is correct");
                correct++;
            }
            else
                System.out.println("The correct answer should be " + stateAndCapital[1]);

            countStateAndCapital++;
        }

        System.out.println("The correct count is " + correct);
    }

    public static String[] getStateAndCapital(int n) {
        String[][] statesAndCapitals = {
                {"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Hawaii", "Honolulu"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"},
                {"Iowa", "Des Moines"},
                {"Kansas", "Topeka"},
                {"Kentucky", "Frankfort"},
                {"Louisiana", "Baton Rouge"},
                {"Maine", "Augusta"},
                {"Maryland", "Annapolis"},
                {"Massachusetts", "Boston"},
                {"Michigan", "Lansing"},
                {"Minnesota", "St. Paul"},
                {"Mississippi", "Jackson"},
                {"Missouri", "Jefferson City"},
                {"Montana", "Helena"},
                {"Nebraska", "Lincoln"},
                {"Nevada", "Carson City"},
                {"New Hampshire", "Concord"},
                {"New Jersey", "Trenton"},
                {"New Mexico", "Santa Fe"},
                {"New York", "Albany"},
                {"North Carolina", "Raleigh"},
                {"North Dakota", "Bismarck"},
                {"Ohio", "Columbus"},
                {"Oklahoma", "Oklahoma City"},
                {"Oregon", "Salem"},
                {"Pennsylvania", "Harrisburg"},
                {"Rhode Island", "Providence"},
                {"South Carolina", "Columbia"},
                {"South Dakota", "Pierre"},
                {"Tennessee", "Nashville"},
                {"Texas", "Austin"},
                {"Utah", "Salt Lake City"},
                {"Vermont", "Montpelier"},
                {"Virginia", "Richmond"},
                {"Washington", "Olympia"},
                {"West Virginia", "Charleston"},
                {"Wisconsin", "Madison"},
                {"Wyoming", "Cheyenne"}
        };

        return statesAndCapitals[n];
    }
}
