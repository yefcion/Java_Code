package banking4;

public class Bank {
    private Customer[] customers;   //用于存放客户
    private int numberOfCustomers;  //记录客户个数

    public Bank() {
        customers = new Customer[5];
    }

    // 添加一个Customer到数组
    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomers] = cust;
        numberOfCustomers++;
    }

    // 获取Customer的数量
    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    // 返回指定索引位置的Customer
    public Customer getCustomer(int index) {
        return customers[index];
    }
}
