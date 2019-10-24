package thisback;

public class TestCust {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane","Smith");
        cust.setAccount(new Account(1000,2000,0.0123));

        cust.getAccount().deposit(200);
        cust.getAccount().withdraw(34);
        cust.getAccount().deposit(89);

        System.out.println("Customer ["+cust.getFirsName()+" "+cust.getLastName()
        +"] has a account.\nID: "+cust.getAccount().getId()+"\nannualInterestRate: "
        +cust.getAccount().getAnnualInterestRate()+"\nbalance: "+cust.getAccount().getBalance());

        // BG marry game
        System.out.println();
        Boy boy = new Boy();
        boy.setName("Jon Snow");
        boy.setAge(26);
        Girl girl = new Girl();
        girl.setName("Kaliz Dragon");
        girl.setAge(22);
        boy.marry(girl);
        boy.shout();
        System.out.println();
        girl.marry(boy);
    }
}
