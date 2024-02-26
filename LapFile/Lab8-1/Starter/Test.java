import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setData("James", new BigDecimal("100.0"));
        BankAccount account2 = new BankAccount();
        account2.setData("Jason", new BigDecimal("100.0"));

        System.out.println("Before transfer: ");
        displayAccountInfo(account1);
        displayAccountInfo(account2);

        account1.transferFrom(account2, new BigDecimal("10.0"));
        displayAccountInfo(account1);
        System.out.println(account2); //toString @Override 를 함

        String s = "Hello";
        s = Utilities.reverseString(s);
        System.out.println(s);

        String s2 = Utilities.recurseReverseString(s, s.length() - 1);
        System.out.println(s2);
    }

    public static void displayAccountInfo(BankAccount account) {
        System.out.printf("Account No: %d, Owner Name: %s, Balance: %s\n", account.getNumber(), account.getOwnerName(), account.getBalance());
    }
}
