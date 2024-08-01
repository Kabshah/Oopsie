public class Test {
    public static void main(String[] args) {
        //create savings acc using static 
        Bank account = new SavingsAccount(1000);
        //Acess & display account type
        account.displayAccountType();
        //deposit & withdraw funds.
        account.deposit(500);
        account.withdraw(200);
        //display final balance
        System.out.println("Final Balance: $"+account.getBalance());
    }
}
