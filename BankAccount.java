/**
A bank account has a balance that can be changed by 
deposits and withdrawals.
*/
public class BankAccount {  
   
	/**
	Bank account account number
	*/
	private int accountNumber;
		
	/**
	Bank account balance
	*/
     private double balance;

	
	/**
    Constructs a bank account with a zero balance
    @param anAccountNumber the account number for this account
    */
    public BankAccount(int anAccountNumber) {   
    		this.accountNumber = anAccountNumber;
    		this.balance = 0.0;
    	}

    /**
 	Constructs a bank account with a given balance
   	@param anAccountNumber the account number for this account
  	@param initialBalance the initial balance
  	*/
    	public BankAccount(int anAccountNumber, double initialBalance) {   
    		this.accountNumber = anAccountNumber;
    		this.balance = initialBalance;
    	}

    	/**
 	Gets the account number of this bank account.
 	@return the account number
    	 */
    	public int getAccountNumber() {   
    		return accountNumber;
    	}

    	/**
 	Deposits money into the bank account.
	@param amount the amount to deposit
    	 */
    	public void deposit(double amount) {  
    		this.balance += amount;
    	}

    	/**
	Withdraws money from the bank account.
  	@param amount the amount to withdraw
    	 */
    	public void withdraw(double amount) {   
    		this.balance -= amount;
    	}

    	/**
	Gets the current balance of the bank account.
  	@return the current balance
    	 */
    	public double getBalance() {   
    		return balance;
    	}
 
}
