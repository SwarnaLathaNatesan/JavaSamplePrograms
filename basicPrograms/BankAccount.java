package basicPrograms;


public class BankAccount {

	//data members or
	//instance variables or
	//object variables
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private double initialBalance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
     	int x = 5;
        {
       
        }
        System.out.println(x);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    //String accountHolderName is a local variable below
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    private boolean validateBalance(double balance) {
    	if (balance < 5000) {
    		return false;
    	}
    	else
    		return true;
    }

    public void setInitialBalance(double balance) {
    	if (validateBalance(balance)) {
    		this.balance = balance;
    		
    	}
    	else {
    		System.out.println("Initial Balance cannot be lesser than 5000. Hence not accepting the Initial Amount");
    		balance = 0;
    	}
    		
    }
    
    public void setBalance(double balance) {

        this.balance = balance;
        
    }

    public double getBalance() {
    	
       // return balance - .3;
    	 return balance ;
    }

    public void deposit(double amount) {
        //balance += amount;
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}