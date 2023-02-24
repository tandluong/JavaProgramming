public class Calculator {
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        // Determine the operator
        int result = switch (args[1].charAt(0)) {
            case '+' -> Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            case '-' -> Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
            case '.' -> Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
            case '/' -> Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
            default -> -1;
        };

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
