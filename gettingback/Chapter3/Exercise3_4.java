public class Exercise3_4 {
    public static void main(String[] args) {
        // Generate random number from 1-12
        int randomNumber = 1 + (int)(Math.random() * 12);

        System.out.println("The random number is " + randomNumber);
        System.out.print("The month is ");

        // create a switch case for the months with corresponding random number
        switch (randomNumber) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December");
        }
    }
}
