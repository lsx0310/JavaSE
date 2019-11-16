package ClassPackage.BankAccount;

/**
 * @ClassName BankAccount
 * @Description: 重载  设置样例账户使用类方法
 * @Authot li
 * @Date 2019/10/10
 * @Version v1.0
 **/

public class BankAccount {
    private String ownerName;
    private double accountNumber;
    private float balance;
    private static int LAST_ACCOUNT_NUMBER = 0;


    public BankAccount(String initName,float initBalance){
        ownerName = initName;
        accountNumber = ++LAST_ACCOUNT_NUMBER;
        balance = initBalance;
    }

    public BankAccount(String initName,double initAccountNumber){
        this(initName,0.0f);
    }

    public BankAccount(){
        this("",0.0f);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }


    @Override
    public String toString() {
        return("Account#" + this.accountNumber + "with balance $" + this.balance);
    }

    public float deposit(float anAmount){
        balance += anAmount;
        return balance;
    }

    public float withdraw(float anAmount){
        balance -= anAmount;
        return anAmount;
    }
}
