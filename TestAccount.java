class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public void showInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class TestAccount {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountHolder("Md. Sahel");
        b.setAccountNumber("BA-2025-1122");
        b.setBalance(15000.50);

        b.showInfo();
    }
}
