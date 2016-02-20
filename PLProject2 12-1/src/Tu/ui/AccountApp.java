package Tu.ui;

import Tu.checking.*;

/**
 * Created by Chia-LinCatherine on 2/19/2016.
 */
public class AccountApp {
    public static void main(String[] args) {
        String action;
        String keepGoing = "y";

        Console.displayLine("Welcome to the Account Calculator");
        Console.displayLine();

        //Create account
        CheckingAccount account = new CheckingAccount();

        //Display starting balance
        Console.displayLine("Starting Balance");
        Console.displayLine("Checking: " + account.getBalanceFormatted());
        Console.displayLine();
        Console.displayLine("Enter the transactions for the month");
        Console.displayLine();

        //Keep going as long as user enters a "y"
        while (keepGoing.equalsIgnoreCase("y")) {
            //Take in the type from user
            action = Console.getString("Withdrawal or deposit? (w/d): ");
            double amount = Console.getDouble("Amount: ");
            Console.displayLine();

            //If/Else for when user inputs w or d somewhere here
            if (action.equalsIgnoreCase("w")) {
                // Check if amount is greater than current balance
                while (amount > account.getBalance()) {
                    Console.displayLine("You cannot withdraw more money than your current account balance.");
                    amount = Console.getDouble("Amount: ");
                    Console.displayLine();
                }
                // Withdraw amount from account
                Transactions.withdraw(account,amount);

            } else {
                while (amount > 10000) {
                    Console.displayLine("You cannot deposit more than $10,000.00 in one transaction.");
                    amount = Console.getDouble("Amount: ");
                    Console.displayLine();
                }
                // Deposit amount into account
                Transactions.deposit(account,amount);
            }

            //Ask if they want to continue
            keepGoing = Console.getString("Continue? (y/n): ");
            Console.displayLine();

        }
        // Display monthly checking fee
        Console.displayLine("Monthly Fees");
        Console.displayLine("Checking fee:\t" + account.getMonthlyFeeFormatted());
        Console.displayLine();
        // Subtract monthly fee
        account.subtractMonthlyFee();
        // Display final balance
        Console.displayLine("Final Balance");
        Console.displayLine("Checking: " + account.getBalanceFormatted());
    }
}
