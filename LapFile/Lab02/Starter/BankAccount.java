public class BankAccount {
    int account;
    private  static int interest;
    String ownerName;
    int balance;

    public static void setIntrest(int newInterest) {
        interest = newInterest;
    }

    public static int getIntrest() {
        return interest;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public boolean withdraw(int amount) {
            if (this.balance < amount) {
                return false;
            } else {
                this.balance -= amount;
                return true;
            }
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return ownerName;
    }

    public int getAccount() {
        return account;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        
        BankAccount[] accounts = new BankAccount[100];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new BankAccount();
        }

        BankAccount.interest = 10;

        account1.deposit(30);
        System.out.println(account1.getBalance());
        account1.withdraw(20);
        System.out.println(account1.getBalance());
    }
}