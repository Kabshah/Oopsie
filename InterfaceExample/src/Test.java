public class Test {
    public static void main(String[] args) {
        
        Bank myBank = new Bank("My Bank");
        SavingsAccountCustomer customer1 = new SavingsAccountCustomer();
        myBank.welcomeCustomer(customer1);
        customer1.deposit(1000);
        customer1.withdraw(200);
        customer1.closeAccount();}
}
