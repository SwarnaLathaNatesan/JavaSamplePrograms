package basicPrograms;

//Parent class
class Account {
 protected String name;
 protected double balance;
 
 public Account(String name, double balance) {
     this.name = name;
     this.balance = balance;
 }
 
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposit successful. New balance: " + balance);
 }
 
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawal successful. New balance: " + balance);
     } else {
         System.out.println("Insufficient balance. Withdrawal failed.");
     }
 }
 
 public void displayBalance() {
     System.out.println("Current balance: " + balance);
 }
}

//Child class
class SavingsAccount extends Account {
 private double interestRate;
 
 public SavingsAccount(String name, double balance, double interestRate) {
     super(name, balance);
     this.interestRate = interestRate;
 }
 
 public void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added. New balance: " + balance);
 }
}

//Driver class
public class AccountDemoForInheritance {
 public static void main(String[] args) {
     // Create a Bank object
     Account myBank = new Account("John", 5000);
	 //Account myBank ;
     myBank.deposit(1000);
     myBank.withdraw(2000);
     myBank.displayBalance();
     
     // Create a SavingsAccount object
     SavingsAccount mySavings = new SavingsAccount("Jane", 2000, 5);
     mySavings.deposit(500);
     mySavings.addInterest();
     mySavings.displayBalance();
 }
}