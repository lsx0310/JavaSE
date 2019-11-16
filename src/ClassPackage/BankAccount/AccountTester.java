package ClassPackage.BankAccount;

/**
 * @ClassName AccountTester
 * @Description: TODO
 * @Authot li
 * @Date 2019/10/10
 * @Version v1.0
 **/

public class AccountTester {

    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount("zhangli",10023.0);
        System.out.println(bankAccount);
        System.out.println();

        BankAccount bankAccount1 = new BankAccount("wangfang",0);
        System.out.println(bankAccount1);
        bankAccount1.deposit(225.6f);
        bankAccount1.deposit(300.0f);
        System.out.println(bankAccount1);
        bankAccount1.withdraw(400.17f);
        System.out.println(bankAccount1);
    }
}
