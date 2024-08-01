public interface Bank {
   abstract double getBalance();
   abstract void deposit(double amount);
   void withdraw(double amount);
   
   default void displayAccountType(){
       System.out.println("Account type: Generic");
   }
}
