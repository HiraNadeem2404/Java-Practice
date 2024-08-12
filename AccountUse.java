package Java;

public class AccountUse {
    public static void main(String[] args){
        Account testAccount= new Account(1122, 20000, 4.5);
        testAccount.displayInfo();
        testAccount.withdraw(2500);
        System.out.println("Balance= " + testAccount.getBalance());
        testAccount.deposit(3000);
        System.out.println("Balance= " + testAccount.getBalance());
    }
}
