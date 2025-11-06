
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Sonali Bank";

    
    BankAccount(int accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolderName = holder;
        balance = bal;
    }

    
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    
    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    
    public static void main(String[] args) {
        showBankName();  

        BankAccount acc1 = new BankAccount(101, "Sahel Chowdhury", 50000);
        BankAccount acc2 = new BankAccount(102, "Jahedul Islam", 30000);

        System.out.println("\n--- Account 1 Details ---");
        acc1.displayAccountInfo();

        System.out.println("\n--- Account 2 Details ---");
        acc2.displayAccountInfo();
    }
}
