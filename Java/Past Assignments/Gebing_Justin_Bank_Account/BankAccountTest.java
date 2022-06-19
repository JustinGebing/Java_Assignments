public class BankAccountTest {
    public static void main(String[] args){
        BankAccount ba = new BankAccount();

        ba.deposit(1000, "checking");
        ba.withdrawal(10000, "checking");
        ba.totalMoney();
        ba.accountInfo();
    }
}
