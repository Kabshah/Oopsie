public class SavingsAccountCustomer implements Customer{
    private double balance;
      public SavingsAccountCustomer(){
          balance = 0;
      }
      public void openAccount(){
          System.out.println("Savings account opened.");
      }
      public void closeAccount(){
          System.out.println("Savings account closed.");
      }
      public void deposit(double amount){
          balance += amount;
          System.out.println("Deposit $"+ amount+". New balance: $"+ balance);
      }
      public void withdraw(double amount){
          if (balance >= amount){
              balance -= amount;
              System.out.println("Withdrawn $"+ amount+ ".New balance: $"+balance);
          }
          else{
              System.out.println("Insufficient funds.");
          }  
      }
      public void displayAccountType(){
          System.out.println("Account type: Savings Account");
      }
}
