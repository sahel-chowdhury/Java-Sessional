interface ATMService {
    void withdraw();
    void deposit();
    void checkBalance();
}

class DBBL implements ATMService {

    public void withdraw() {
        System.out.println("Withdraw money from DBBL");
    }

    public void deposit() {
        System.out.println("Deposit money to DBBL");
    }

    public void checkBalance() {
        System.out.println("Check balance in DBBL");
    }
}

public class TestATM {
    public static void main(String[] args) {
        DBBL dbblATM = new DBBL();

        dbblATM.deposit();
        dbblATM.checkBalance();
        dbblATM.withdraw();
    }
}
