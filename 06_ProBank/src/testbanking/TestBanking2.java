package testbanking;

import banking2.Account;
import banking2.Customer;

public class TestBanking2 {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        System.out.println("Creating thr customer Jane Smith.");

        Account account = new Account(500.00);
        System.out.println("Create an account that can has a 500.00 balance.");

        customer.setAccount(account);
        customer.getAccount().withdraw(150.00);
        System.out.println("Withdraw 150.00");

        customer.getAccount().deposit(22.50);
        System.out.println("Deposit 22.50");

        customer.getAccount().withdraw(47.62);
        System.out.println("Withdraw 47.62");

        // Print out the final account balance
        System.out.println("Customer [" +customer.getFirstName()+" "+
                customer.getLastName()+"] has a balance of "+
                customer.getAccount().getBalance());
    }
}
