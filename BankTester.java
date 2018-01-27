/**
This program tests the Bank class.
*/
public class BankTester {
   public static void main(String[] args) {
	   try{
		   //tests Bank constructor, and creates 2 Banks
		   Bank firstBankOfJava = new Bank();
		   Bank worstBankOfJava = new Bank();
		   
		   //tests both BankAccount constructors, and addAccount()
		   firstBankOfJava.addAccount(new BankAccount(1001, 20000.00));
		   firstBankOfJava.addAccount(new BankAccount(1015, 10000.00));
		   firstBankOfJava.addAccount(new BankAccount(1729, 15000.00));
		   firstBankOfJava.addAccount(new BankAccount(1113));
		   
		   //tests find() and getBalance() methods
		   System.out.printf("Account 1113 has a balance of $%.2f.\n", firstBankOfJava.find(1113).getBalance());
		   //tests deposit()
		   firstBankOfJava.find(1113).deposit(100000.00);
		   System.out.printf("After depositing $100,000.00, account 1113 has a new balance of $%.2f.\n", firstBankOfJava.find(1113).getBalance());
		   //tests withdraw()
		   firstBankOfJava.find(1113).withdraw(50000.00);
		   System.out.printf("After withdrawing $50,000.00, account 1113 has a new balance of $%.2f.\n", firstBankOfJava.find(1113).getBalance());
		   
		   //tests getMaximum() and getAccountNumber()
		   System.out.printf("Bank account %d has the largest account balance in the firstBankOfJava with $%.2f.\n", 
				   firstBankOfJava.getMaximum().getAccountNumber(), firstBankOfJava.getMaximum().getBalance());
		   
		   //tests count() and getTotalBalance()
		   System.out.printf("The firstBankOfJava has %d accounts with a balance of at least $20,000.00.\nThe Banks total balance is $%.2f.\n", 
				   firstBankOfJava.count(20000), firstBankOfJava.getTotalBalance());
		   
		   //tests to see if getMaximum() will return a null object when it has no accounts.
		   if (worstBankOfJava.getMaximum() == null) {
			   System.out.println("worstBankOfJava still doesnt have any accounts, what a suprise."); 
		   } else {
			   System.out.printf("worstBankOfJava finally has bank accounts, and account %d has the largest account balance with $%.2f.\n", 
					   firstBankOfJava.getMaximum().getAccountNumber(), firstBankOfJava.getMaximum().getBalance());
		   }
      
	   } catch(Exception e) {
		   System.out.println("Something broke, please fix me");
	   }
   }
}
