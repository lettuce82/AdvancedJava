import java.math.*;
import java.util.Scanner;

public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private BigDecimal balance;
    
    private static int nextAccountNo;

    private static int nextNumber() {
        return nextAccountNo++;
    }

    public void setData(String ownerName, BigDecimal balance) {
        this.accountNumber = nextNumber();
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    
    public String getOwnerName() {
        return this.ownerName;
    }

    
    public BigDecimal getBalance() {
        return this.balance;
    }

    public BigDecimal deposit(BigDecimal amount) {
        this.balance = this.balance.add(amount);
        return this.balance;
    }

    public boolean withDraw(BigDecimal amount) {
        if (amount.compareTo(this.balance) == 1 || amount.compareTo(this.balance) == 0) {
            return false;
        }
        else {
            balance = balance.subtract(amount);
            return true;
        }
    }
}

class CreateAccount {
    public static BankAccount createNewBankAccount(String ownerName, BigDecimal balance) {
        BankAccount newAccount = new BankAccount();
        
        newAccount.setData(ownerName, balance);

        return newAccount;
    }

    public static void testDeposit(BankAccount account) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        BigDecimal amount = new BigDecimal(sc.next());
        account.deposit(amount);
    }

    public static void testWithDraw(BankAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        BigDecimal amount = new BigDecimal(scanner.next());
        if(!account.withDraw(amount)) {
            System.out.println("Insufficient funds!");
        }
    }

    public static void main(String[] args) {
       BankAccount bankAccount1 = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
       BankAccount bankAccount2 = CreateAccount.createNewBankAccount("Vesper Lind", new BigDecimal("0.0"));
       printBankAccount(bankAccount1);
       testDeposit(bankAccount1);
       testWithDraw(bankAccount1);
       printBankAccount(bankAccount1);
       System.out.println();
       printBankAccount(bankAccount2);
       testDeposit(bankAccount2);
       testWithDraw(bankAccount2);
    }

    public static void printBankAccount(BankAccount account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Owner Name: " + account.getOwnerName());
        System.out.println("Balance: " + account.getBalance());
    }
}