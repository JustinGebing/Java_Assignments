import java.util.Random;

public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;
    public static int numberOfAccounts = 0;

    public BankAccount() {
        this.checkingBalance = 0.00;
        this.savingsBalance = 0.00;
        this.accountNumber = genAccount();
        BankAccount.numberOfAccounts++;
    }

    public void totalMoney() { 
        double total = this.checkingBalance + this.savingsBalance;
        System.out.println("Your total amount available is " + total);
    }
    
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void deposit(double deposit, String account) {
        if(account.equals("checking")) {
            this.checkingBalance += deposit;
            System.out.println("Your account now has " + this.checkingBalance);
        }
        else if (account.equals("savings")) {
            this.savingsBalance += deposit;
            System.out.println("Your account now has " + this.savingsBalance);
        }
    }

    public void withdrawal(double withdrawal, String account) {
        if(account.equals("checking")) {
            if(this.checkingBalance >= withdrawal) {
                this.checkingBalance -= withdrawal;
                System.out.println("Your account now has " + this.checkingBalance);
            }
            else if(this.checkingBalance <= withdrawal) {
                System.out.println("Insufficient Funds");
            }
        }
        else if (account.equals("savings")) {
            if(this.savingsBalance >= withdrawal) {
                this.savingsBalance -= withdrawal;
                System.out.println("Your account now has " + this.savingsBalance);

            }
            else if(this.savingsBalance <= withdrawal) {
                System.out.println("Insufficient Funds");
            }
        }
    }

    public String genAccount(){
        String output = "";
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            output += random.nextInt(10);
        }
        return output;
    }

    public void accountInfo() {
        System.out.printf("%n Your Account Number is %s", accountNumber);
        System.out.printf("%n Your Checking Account has %.2f.", checkingBalance);
        System.out.printf("%n Your Savings Account has %.2f", savingsBalance);
    }


}
