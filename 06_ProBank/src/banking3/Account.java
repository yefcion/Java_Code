package banking3;
// 账户
public class Account {
    private double balance;     // 账户余额
    // 构造器
    public Account(double init_balance){
        balance = init_balance;
    }

    public double getBalance(){
        return balance;
    }

    // 存钱
    public boolean deposit(double amt){    // amt 存钱额度
        balance += amt;
        return true;
    }

    // 取钱
    public boolean withdraw(double amt){
        if (balance >=amt){
            balance -= amt;
            return true;
        }else{
            System.out.println("余额不足！");
            return false;
        }
    }
}
