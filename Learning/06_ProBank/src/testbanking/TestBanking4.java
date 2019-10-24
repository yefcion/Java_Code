package testbanking;

import banking4.*;

public class TestBanking4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("Witch", "Olsen");
        bank.addCustomer("Annie", "Hals");
        bank.addCustomer("Kris", "Thunder");
        bank.addCustomer("Jon", "Stark");

        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer " + i + " :" +
                    customer.getFirstName() + " " + customer.getLastName());
        }
    }
}
