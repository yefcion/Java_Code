package testbanking;

import banking3.*;

public class TestBanking3 {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        System.out.println("Creating thr customer Jane Smith.");

        Account account = new Account(500.00);
        System.out.println("Create an account that can has a 500.00 balance.");

        customer.setAccount(account);
        account = customer.getAccount();         //倒来倒去

        System.out.println("Withdraw 150.00：" + account.withdraw(150.00));
        System.out.println("Deposit 22.50：" + account.deposit(22.50));
        System.out.println("Withdraw 47.62：" + account.withdraw(4567.62));

        // Print out the final account balance
        System.out.println("Customer [" + customer.getFirstName() + " " +
                customer.getLastName() + "] has a balance of " +
                account.getBalance());
    }
}
