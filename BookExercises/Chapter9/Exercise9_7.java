public class Exercise9_7 {
    public static void main(String[] args) {
        Account user0 = new Account(1122, 20000);
        user0.setAnnualInterestRate(4.5);
        user0.withdraw(2500);
        user0.deposit(3000);
        System.out.println("The account balance is $" + user0.getBalance() +
                "\nThe monthly interest is $" + user0.getMonthlyInterest() +
                "\nThe date when the account was created is " + user0.getDateCreated());
    }
}
