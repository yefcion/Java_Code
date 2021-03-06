package testbanking;

import banking1.Account;

public class TestBanking1 {
    public static void main(String[] args) {
        Account account;

        // Create an account that can has a 500.00 balance.
        account = new Account(500.00);
        System.out.println("Creating her account with a 500.00 balance.");

        account.withdraw(150.00);
        System.out.println("Withdraw 150.00");

        account.deposit(22.50);
        System.out.println("Deposit 22.50");

        account.withdraw(47.62);
        System.out.println("Withdraw 47.62");
        // Print out the final account balance
        System.out.println("The account has a balance of " + account.getBalance());

    }
}
