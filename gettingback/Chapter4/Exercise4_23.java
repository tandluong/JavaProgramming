import java.util.*;
public class Exercise4_23 {
    public static void main(String[] args) {
        // Create Scanner Object
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter employee's name: ");
        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double pay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate (0.01 - 1.0): ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate (0.01 - 1.0): ");
        double stateTax = input.nextDouble();

        // Calculate deductions
        double grossPay = hours * pay;
        double federalDeduction = grossPay * federalTax;
        double stateDeduction = grossPay * stateTax;
        double totalDeduction = federalDeduction + stateDeduction;
        double netPay = grossPay - totalDeduction;

        // Display Result
        System.out.printf("""
                
                Employee Name: %s
                Hours Worked: %.1f
                Pay Rate: $%.2f
                Gross Pay: $%.1f
                Deductions:
                  Federal Withholding (%.1f%%): $%.1f
                  State Withholding (%.1f%%): $%.2f
                  Total Deduction: $%.2f
                Net Pay: $%.2f""",
                name, hours, (int)(pay * 100) / 100.0, (int)(grossPay * 100) / 100.0,
                (int)(federalTax * 10000) / 100.0, (int)(federalDeduction * 100) / 100.0,
                (int)(stateTax * 10000) / 100.0, (int)(stateDeduction * 100) / 100.0,
                (int)(totalDeduction * 100) / 100.0, (int)(netPay * 100) / 100.0);
    }
}
