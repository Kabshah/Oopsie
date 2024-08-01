public class Test {
    public static void main(String[] args) {
        Bank account = new SavingsAccount(1000);
        //Execute transactions
        account.executeTransaction("DEPOSIT", 500);
        account.executeTransaction("WITHDRAW", 200);
        account.executeTransaction("DEPOSIT", 2000);
    }
}
