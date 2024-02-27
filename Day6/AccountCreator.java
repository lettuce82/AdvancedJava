public class AccountCreator {
    private static AccountCreator accountCreator;
    int nextAccountNo = 0;

    private AccountCreator() {}

    public static AccountCreator getAccountCreator() {
        if (accountCreator == null) {
            accountCreator = new AccountCreator();
        }
        return accountCreator;
    }

    public int getNextAccountNo() {
        return this.nextAccountNo++;
    }
}

class Test3 {
    public static void main(String[] args) {
        //AccountCreator accountCreator = new AccountCreator(); -> 불가 (접근제어자가 private)
        AccountCreator creator = AccountCreator.getAccountCreator();
        int newNo = creator.getNextAccountNo();
    }
}