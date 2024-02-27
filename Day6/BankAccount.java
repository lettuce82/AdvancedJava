public class BankAccount {
    private int accountNo;
    private String ownerName;

    public BankAccount(String ownerName) {
        this.accountNo = AccountCreator.getAccountCreator().getNextAccountNo();
        this.ownerName = ownerName;
    }

    //final 메소드 - override 불가
    //final 클래스(파생 금지 클래스) - 상속 불가 (ex. String)
    final public int getNo() {
        return this.accountNo;
    }

    @Override
    public String toString() {
        return this.accountNo + ", " + this.ownerName;
    }
}

class Test4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("채상희");
        BankAccount account1 = new BankAccount("채상희");
        BankAccount account2 = new BankAccount("채상희");

        System.out.println(account.toString());
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}